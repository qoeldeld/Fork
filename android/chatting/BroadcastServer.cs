using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using System.Collections;
namespace chatServerTest
{
    class BroadcastServer
    {
        public static ArrayList socketList = new ArrayList(); //������ ����� ���ϵ��� Array �Դϴ�.
        private static BroadcastServer broadcastServer;
        private Thread threadWaitingSocket;
        private Socket listener;        
        private int port;
        public static void start(int _port) //   ���� ����
        {
            if (broadcastServer == null)
            {
                broadcastServer = new BroadcastServer(_port);
            }
        }
        public static void stop()       // ���� ����
        {
            Console.WriteLine("������ �����մϴ�.");
            foreach (SocketHandler socketHandler in socketList)
            {
                socketHandler.end();
            }
            if (broadcastServer != null)
            {
                broadcastServer.threadStop();
            }
        }
        private void threadStop()
        {
            threadWaitingSocket.Abort();
            listener.Close();
        }
        private BroadcastServer(int _port)
        {
            port = _port;
            threadWaitingSocket = new Thread(new ThreadStart(WaitingSocket));
            threadWaitingSocket.Start();
        }
        private void WaitingSocket()    //  Ŭ���̾�Ʈ�� ������ üũ�ϴ� ������.
        {
            IPAddress ipAddress = IPAddress.Any;
            IPEndPoint ipEndPoint = new IPEndPoint(ipAddress, port);
            listener = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
            listener.Bind(ipEndPoint);
            listener.Listen(1000);      //  ���ÿ� ������ �����ڼ��� ����
            Console.WriteLine("������ ��ٸ��ϴ�.");
            while (true)
            {
                Socket acceptedSocket = listener.Accept();      //  ������ Ŭ���̾�Ʈ ����
                string acceptedIP = ((IPEndPoint)acceptedSocket.RemoteEndPoint).Address.ToString(); //  ������ Ŭ���̾�Ʈ IP
                socketList.Add(new SocketHandler(acceptedSocket));                                  //  ���Ӹ���Ʈ�� �߰�
                Console.WriteLine(socketList.Count + "��° ��ǻ�� - " + acceptedIP + "���� �����Ͽ����ϴ�.");
            }
        }
    }
    public class SocketHandler
    {
        public Socket socket;
        public Thread threadHandler;
        public SocketHandler(Socket socket)
        {
            this.socket = socket;
            threadHandler = new Thread(new ThreadStart(Handler));
            threadHandler.Start();            
        }
        public void Handler()                   //  �������� �����۾�
        {
            byte[] buffer = new byte[4096];
            int bufferCount;
            SendMsg((BroadcastServer.socketList.Count) + "���� ������ �ֽ��ϴ�.");
            try
            {
                while (true)
                {
                    buffer.Initialize();
                    bufferCount = socket.Receive(buffer);
                    if (bufferCount == 0) break;
                    string Msgs = ASCIIEncoding.UTF8.GetString(buffer);
                    byte[] byteimsi = new byte[bufferCount];    // �������� ���ֱ�� �ӽ�byte
                    for (int i = 0; i < bufferCount; i++)
                    {
                        byteimsi[i] = buffer[i];
                    }
                    Msgs = ASCIIEncoding.UTF8.GetString(byteimsi);
                    Console.WriteLine("Ŭ���̾�Ʈ���� ���� �޼���" + Msgs);
                    SendMsg(Msgs);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
            finally
            {
                Console.WriteLine("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
                BroadcastServer.socketList.Remove(this);
                socket.Close();
                socket = null;
            }
        }
        public void SendMsg(string Msg)     //  �޼��� ������.
        {
            int bufferCount = 0;
            byte[] buffer = new byte[4096];
            buffer = ASCIIEncoding.UTF8.GetBytes(Msg);
            bufferCount = ASCIIEncoding.UTF8.GetByteCount(Msg);
            foreach (SocketHandler socketHandler in BroadcastServer.socketList)
            {
                socketHandler.socket.Send(buffer, 0, bufferCount, SocketFlags.None);
            }
        }
        public void end()
        {
            threadHandler.Abort();
        }
    }
}
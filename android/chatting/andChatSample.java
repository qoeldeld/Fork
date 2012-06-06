package chat.um;

import java.io.*;
import java.net.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
public class andChatSample extends Activity {
    /** Called when the activity is first created. */
 public Socket cSocket = null;
 private String server = "113.198.84.88";  // ���� ip�ּ�
 private int port = 23;                           // ��Ʈ��ȣ
 
 public PrintWriter streamOut = null;
 public BufferedReader streamIn = null;
 
 public chatThread cThread = null;
 
 public TextView tv;
 public EditText nickText;
 public EditText msgText;
 public ScrollView sv;
 
 public String nickName;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        sv = (ScrollView)findViewById(R.id.scrollView1);
        tv = (TextView)findViewById(R.id.text01);
        nickText = (EditText)findViewById(R.id.connText);
        msgText = (EditText)findViewById(R.id.chatText);
        
        logger("ä���� �����մϴ�.");
    }
    
    public void onDestroy() { // ���� �Ҹ�Ǹ�
     super.onDestroy();
     if (cSocket != null) {
    sendMessage("# [" + nickName + "]���� �����̽��ϴ�.");
  }
    }
    
    public void connBtnClick(View v) {
     switch (v.getId()) {
     case R.id.connBtn: // ���ӹ�ư
      if (cSocket == null) {
          nickName = nickText.getText().toString();
          logger("�������Դϴ�...");
          connect(server, port , nickName);
         } 
      break;
     case R.id.closeBtn: // ������ ��ư
      if (cSocket != null) {
       sendMessage("# [" + nickName + "]���� �����̽��ϴ�.");
      }
     break;
     case R.id.sendBtn: // �޼��� ������ ��ư
      if (cSocket != null) {
       String msgString = msgText.getText().toString();
          if (msgString != null && !"".equals(msgString)) {
              sendMessage("[" + nickName + "] " + msgString);
              msgText.setText("");
             }
      } else {
       logger("������ ���� ���ּ���.");
      }      
     break;      
     }
    }
    
    public void connect(String server, int port, String user) {
  try {
   cSocket = new Socket(server, port);
   streamOut = new PrintWriter(cSocket.getOutputStream(), true);      // ��¿� ��Ʈ��
   streamIn = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));  // �Է¿� ��Ʈ��
   
   sendMessage("# ���ο� �̿���[" + user + "]���� ���Խ��ϴ�.");
   
   cThread = new chatThread();
   cThread.start();
  }catch (Exception ex) {
   logger("������ ����� �̷�� ���� �ʾҽ��ϴ�.");
  }
 }
    
    private void logger(String MSG) {
     tv.append(MSG + "\n");     // �ؽ�Ʈ�信 �޼����� �����ݴϴ�.
     sv.fullScroll(ScrollView.FOCUS_DOWN); // ��ũ�Ѻ��� ��ũ���� �����ݴϴ�.
    }
    
    private void sendMessage(String MSG) {
     try {
      streamOut.println(MSG);     // ������ �޼����� �����ݴϴ�.
     } catch (Exception ex) {
      logger(ex.toString());
     }
  
 }
    
    Handler mHandler = new Handler() {   // �����忡�� �޼����� ���� �ڵ鷯.
     public void handleMessage(Message msg) {
      switch (msg.what) {
      case 0: // ä�� �޼����� �޾ƿ´�.
       logger(msg.obj.toString());
       break;
      case 1: // ���������� ���´�.
       try {       
        cSocket.close();
        cSocket = null;
        
        logger("������ ���������ϴ�.");
        
       } catch (Exception e) {
        logger("������ �̹� ���� �ֽ��ϴ�." + e.getMessage());
        finish();
       }
       break;
      }
     }
    };
    
    class chatThread extends Thread {
     private boolean flag = false; // ������ ����(����)�� �÷���
     public void run() {
      try {
       while (!flag) { // �÷��װ� false�ϰ�쿡 ����
        String msgs;
        Message msg = new Message();
           msg.what = 0;
           msgs = streamIn.readLine();  // �������� �� �޼����� ��ٸ���. 
           msg.obj = msgs;
           
           mHandler.sendMessage(msg); // �ڵ鷯�� �޼��� ����
           
           if (msgs.equals("# [" + nickName + "]���� �����̽��ϴ�.")) { // �������� �� �޼����� ���� �޼������
            flag = true;   // ������ ���Ḧ ���� �÷��׸� true�� �ٲ�.
            msg = new Message();
            msg.what = 1;   // ����޼���
            mHandler.sendMessage(msg);
           }               
          }
       
      }catch(Exception e) {
       logger(e.getMessage());
      }
     }     
    }
}
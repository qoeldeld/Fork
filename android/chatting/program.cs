using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace chatServerTest
{
    class Program
    {
        static void Main(string[] args)
        {
            BroadcastServer.start(10701);
        }
    }
}
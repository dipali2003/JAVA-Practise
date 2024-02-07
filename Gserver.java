import java.net.*;
import java.io.*;
public class Gserver extends Thread
{
   private ServerSocket ss;
   public Gserver(int port)throws IOException
    {
      ss=new ServerSocket(port);
      ss.setSoTimeout(30000);
    }
       public void run()
       {
         while(true){
             try{
                  System.out.println("waiting on client on port"+ss.getLocalPort()+"...");
                  Socket Server=ss.accept();
                  System.out.println("just connected to"+Server.getRemoteSocketAddress());
                  DataInputStream in=new DataInputStream(Server.getInputStream());
                  System.out.println(in.readUTF());
                  DataOutputStream out=new DataOutputStream(Server.getOutputStream());
                  out.writeUTF("thank you for connecting                                                    to"+Server.getLocalSocketAddress()+"\n good bye");
                  Server.close();
                }
                   catch(SocketTimeoutException s)
                      {
                         System.out.println("socket timed out");
                          break;
                        }
                     catch(IOException e){
                            e.printStackTrace();
                            break;
                       }
          }
}
public static void main(String args[])
{
 int port=Integer.parseInt(args[0]);
 try{
      Thread t=new Gserver(port);
      t.start();
    }
     catch(IOException e)
     {
       e.printStackTrace();
      }
  }
}  

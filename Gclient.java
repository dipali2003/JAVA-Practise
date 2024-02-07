import java.net.*;
import java.io.*;
public class Gclient
{
  public static void main(String args[])
{
  String ServerName=args[0];
  int port=Integer.parseInt(args[1]);
  try
    {
       System.out.println("connecting to"+ServerName+"on port"+port);
       Socket client=new Socket(ServerName,port);
       System.out.println("just connected to"+client.getRemoteSocketAddress());
       OutputStream outToServer=client.getOutputStream();
       DataOutputStream out=new DataOutputStream(outToServer);
       out.writeUTF("hello from"+client.getLocalSocketAddress());
       InputStream inFromServer=client.getInputStream();
       DataInputStream in=new DataInputStream(inFromServer);
       System.out.println("server says"+in.readUTF());
       client.close();
    }
     catch(IOException e)
    {
      e.printStackTrace();
     }
  }
}
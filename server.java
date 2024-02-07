import java.io.*;
import java.net.*;
class server{
            DataInputStream dis;
            DataOutputStream dos;
            InputStream is;
            OutputStream os;
            ServerSocket sob;
            Socket cob;
    server()throws Exception
    {
          sob=new ServerSocket(1300);
          System.out.println("\n server is connected");
          cob=sob.accept();
          System.out.println("\n client is connected");
          is=cob.getInputStream();
          os=cob.getOutputStream();
          dis=new DataInputStream(is);
          dos=new DataOutputStream(os);
   }
  void dispaly()throws Exception
{
   System.out.println("\n enter a response");
   BufferedReader obt=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("\n reading a data");
    while(true)
    {
      String str=dis.readUTF();
      if(str.equals("end"))
      {
         break;
      }
     System.out.println("\n"+str);
    System.out.println("\n response");
    System.out.println("\n enter a your responce=\n");
   String str2=obt.readLine();
   dos.writeUTF(str2);
   }
}
  public static void main(String args[])throws Exception
 {
      server ob=new server();
      ob.dispaly();
}
}
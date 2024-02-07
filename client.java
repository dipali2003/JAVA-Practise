import java.io.*;
import java.net.*;
class client{
            DataInputStream dis;
            DataOutputStream dos;
            InputStream is;
            OutputStream os;
            
            Socket cob;
    client()throws Exception
    {
          cob=new Socket("localhost",1300);
          is=cob.getInputStream();
          os=cob.getOutputStream();
          dis=new DataInputStream(is);
          dos=new DataOutputStream(os);
   }
  void sent()throws Exception
{
   
   BufferedReader obt=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("\n enter a data");
   while(true)
   {
      String str=obt.readLine();
      dos.writeUTF(str);

    if(str.equals("end"))
      {
        break;
       }
      System.out.println(dis.readUTF());
   }
}
  public static void main(String args[])throws Exception
 {
  client ob=new client();
  ob.sent();
 }
}
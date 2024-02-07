import java.net.InetAddress;
public class ipdemo
{
  public static void main(String args[])throws Exception
{
  InetAddress Ip=InetAddress.getLocalHost();
  System.out.println("ip of my system is:="+Ip.getHostAddress());
  System.out.println("the host or client name is:"+Ip.getHostName());
}
}
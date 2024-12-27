class newthrd implements Runnable
{
  Thread t;
  String name;
  newthrd(String s)
 {
  name=s;
  t=new Thread(this,name);
  System.out.println("new thread="+t);
  t.start();
  }
 public void run()
{
   try
   {
     for(int i=4;i>0;i--)
      {
         System.out.println(name+":"+i);
         Thread.sleep(4000);
       }
   }catch(Exception e){}
  System.out.println("finally"+Thread.currentThread().getName()+"exited..");
}
}
 public class multi
{
  public static void main(String args[])
  {
    System.out.println("Thread name:"+Thread.currentThread().getName());
    new newthrd("first thread");
    new newthrd("second thread");
    new newthrd("third thread");
    new newthrd("fourth thread");
  }
}

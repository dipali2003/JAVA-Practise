class mythrd extends Thread
{
  mythrd(String s)
  {
    super(s);
    start();
  }
   public void run()
   {
      for(int i=0;i<2;i++)
      {
         System.out.println("thread name:"+Thread.currentThread().getName());
       try{
              System.out.println("now"+Thread.currentThread().getName()+"sleep...");
              Thread.sleep(2000);
              System.out.println(" ");
              System.out.println("now"+Thread.currentThread().getName()+"wakeup...");
          }
            catch(Exception e){}
       }
    System.out.println("finally"+Thread.currentThread().getName()+"Exit...");
  }
}
 public class test
{
  public static void main(String args[])
 {
   System.out.println("thread name:"+Thread.currentThread().getName());
   mythrd t1=new mythrd("first thread");
   mythrd t2=new mythrd("second thread");
 }
}
     
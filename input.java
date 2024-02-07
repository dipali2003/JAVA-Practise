import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("enter first number ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        int c=a+b;
       System.out.println("a+b: "+c);

    }
}

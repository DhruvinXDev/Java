
import java.util.Scanner;

class Hello
{
    public static void main(String Args[])
    {
        System.out.println("hello my name is dhruvin ");

        // 1

        // int n= Integer.parseInt(Args[0]);
        // PS C:\Users\Administrator\Downloads\24CE137> javac Hello.java
        // PS C:\Users\Administrator\Downloads\24CE137> java Hello 10  

        // 2
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table : ");
        int n = sc.nextInt();

        for (int i=1 ;i<=10;i++)
        {
            System.out.println( n + " * " + i + " = " + (n*i));
        }
    }
}

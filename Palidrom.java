
import java.util.Scanner;

class Code
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number  : ");
        int n = sc.nextInt();
        int ext = 0;
        int i=1,t=n;

        while (n > 0) { 
            ext += (n%10)*i;
            i*=10;
            n /= 10;
        }
        if(ext == t)
        {
            System.out.println("Number is pal. Number "+ ext + " = " + t);
        }
        else{
            System.out.println("Number is not pal. Number "+ ext + " != " + t);
        }
    }
}

abstract class Abstractdemo
{
    abstract void display();
    void test ()
    {
        System.out.println("hello this is abstratct class ");
    }
}
class Concretedemo extends Abstractdemo
{
    void display()
    {
        System.out.println("hello this is ");
    }
}
public class Abstractclass
{
    public static void main(String[] args) {
        
    }
}
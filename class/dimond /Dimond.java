interface  A
{
    int a = 20;
    default void Display()
    {
        System.out.println("A in : "+ a);
    }
}
interface  B extends   A
{
    float b = 20f;
    default  void Display()
    {
        System.out.println("B in : "+ b);
    }
}
interface C extends   A
{
    double c = 20;
    default  void Display()
    {
        System.out.println("C in : "+ c);
    }
}

class D implements B , C{
    long d =50l;
    public void Display()
    {
        System.out.print("D in : " + d);
    }
}

class  Dimond
{
    public static void main(String[] args) {
        D od = new D();
        od.Display();
    }
}
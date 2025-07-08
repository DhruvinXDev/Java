abstract class  Game {
    abstract void Play();
}
class Cricket extends Game
{
    void Play()
    {
        System.out.println("Let's play Cricket ");
    }
}
class Tennis extends Game
{
    void Play()
    {
        System.out.println("Let's play Tennis ");
    }
}

public class Abstarct{
    public static void main(String[] args) {
        Cricket c = new Cricket();
        Tennis t = new Tennis();
        c.Play();
        t.Play();
    }
}
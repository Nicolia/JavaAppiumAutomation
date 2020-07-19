import org.junit.Test;

public class  MainTest
{
    int a = 5;
    int b = 11;

    @Test
    public void myFirstTest()
    {
     int a = multiplay(5);
     System.out.println(a);
     int b = this.multiplay(10,15);
     System.out.println(b);
    }
    public int multiplay(int number)
    {
        return number * 2;
    }
    public int multiplay(int number, int multiplier)
    {
        return number * multiplier;
    }
}

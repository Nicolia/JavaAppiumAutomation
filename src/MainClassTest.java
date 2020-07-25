import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void  testGetClassNumber()
    {
        if (this.class_number > 45) {
            System.out.println("Value more then 45");
        } else {
            System.out.println("Value is 45 or less then 45");
        }
    }
    @Test
    public void  testGetClassString()
    {

    }
}
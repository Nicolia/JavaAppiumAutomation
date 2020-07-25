import org.junit.Test;

public class MainClass
{
    int class_number = 20;
    String class_string = "Hello, world";

  @Test
    public void getClassNumber()
  {
      System.out.println(this.class_number);
  }
    @Test
    public void getClassString()
    {
        System.out.println(this.class_string);
    }
}

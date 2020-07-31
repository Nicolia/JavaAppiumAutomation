import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void  testGetClassNumber()
    {
 /**       if (this.class_number > 45) {
            System.out.println("Value more then 45");
        } else {
            System.out.println("Value is 45 or less then 45");
        }
  */
        Assert.assertTrue("Value is 45 or less then 45",this.class_number>45);
    }
    @Test
    public void  testGetClassString()
    {
        if (this.class_string.contains("Hello")) {
            System.out.println("The text is exist");
        } else if (this.class_string.contains("hello")) {
            System.out.println("The text is exist");
        } else {
            System.out.println("The text is wrong - there is no the Hello word");
        }
    }
    @Test
    public void testGetLocalNumber()
    {
 /**       int number = this.GetLocalNumber();
                if (number == 14){
                    System.out.println("Number is 14");
                }else {
                    System.out.println("Number isn't 14");
                }
 */
        Assert.assertTrue("Number isn't 14",this.GetLocalNumber()==14);
    }

}

import JUnit.JUnit_Introduction;
import org.junit.Test;
import static org.junit.Assert.*;
public class JUnit_IntroductionTest {
    @Test
    public void testAddDouble(){
        System.out.println("addDouble");
        double n1 = 2.5;
        double n2 = 5.0;
        JUnit_Introduction instance= new JUnit_Introduction();
        double expResult= 7.5;
        double result= instance.addDouble(n1, n2);
        assertEquals(expResult,result,0.0);
    }
      @Test
    public void testAddString(){
        System.out.println("addString");
        String s1 = "Semangat menuju";
        String s2 = " UAS PKPL";
        JUnit_Introduction instance = new JUnit_Introduction();
        String expResult = "Semangat menuju UAS PKPL";
        String result = instance.addString(s1, s2);
        assertEquals(expResult,result);
    }
    @Test
    public void testAddInt(){
        System.out.println("addInt");
        int n1 = 25;
        int n2 = 8;
        JUnit_Introduction instance= new JUnit_Introduction();
        int expResult = 33;
        int result = instance.addInt(n1, n2);
        assertEquals(expResult,result);
    }
    @Test
    public void textIsOdd(){
        System.out.println("isOdd");
        int number = 1 ;
        JUnit_Introduction instance = new JUnit_Introduction();
        boolean expResult= true;
        boolean result= instance.isOdd(number);
        assertEquals(expResult,result);
    }
    @Test
    public void textIsEven(){
        System.out.println("isEven");
        int number = 10;
        JUnit_Introduction instance = new JUnit_Introduction();
        boolean expResult= true;
        boolean result= instance.isEven(number);
        assertEquals(expResult,result);
    }
}

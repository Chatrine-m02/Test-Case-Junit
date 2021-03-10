/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITD
 */
public class JUnitIntro_Test1 {
    
    public JUnitIntro_Test1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    // public void hello() {}
    @Test
    public void testAddDouble(){
        System.out.println("addDouble");
        double n1 = 1.25;
        double n2 = 2.0;
        JUnit_Introduction instance= new JUnit_Introduction();
        double expResult= 3.25;
        double result= instance.addDouble(n1, n2);
        assertEquals(expResult,result,0.0);
    }
      @Test
    public void testAddString(){
        System.out.println("addString");
        String s1 = "Semangat menuju";
        String s2 = " UAS PUPL";
        JUnit_Introduction instance = new JUnit_Introduction();
        String expResult = "Semangat menuju UAS PUPL";
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

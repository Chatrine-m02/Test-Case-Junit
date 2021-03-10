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
public class JUnitIntro_Test2 {
    
    public JUnitIntro_Test2() {
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
    // @Test
    // public void hello() {}
    @Test
    public void testAddDouble(){
        System.out.println("addDouble");
        double n1 = 3.05;
        double n2 = 2.05;
        JUnit_Introduction instance= new JUnit_Introduction();
        double expResult= 5.10;
        double result= instance.addDouble(n1, n2);
        assertEquals(expResult,result,0.0);
    }
      @Test
    public void testAddString(){
        System.out.println("addString");
        String s1 = "Ingin Menjadi ";
        String s2 = "QA atau ST?";
        JUnit_Introduction instance = new JUnit_Introduction();
        String expResult = "Ingin Menjadi QA atau ST?";
        String result = instance.addString(s1, s2);
        assertEquals(expResult,result);
    }
    @Test
    public void testAddInt(){
        System.out.println("addInt");
        int n1 = 9;
        int n2 = 7;
        JUnit_Introduction instance= new JUnit_Introduction();
        int expResult = 16;
        int result = instance.addInt(n1, n2);
        assertEquals(expResult,result);
    }
    @Test
    public void textIsOdd(){
        System.out.println("isOdd");
        int number = 9 ;
        JUnit_Introduction instance = new JUnit_Introduction();
        boolean expResult= true;
        boolean result= instance.isOdd(number);
        assertEquals(expResult,result);
    }
    @Test
    public void textIsEven(){
        System.out.println("isEven");
        int number = 8;
        JUnit_Introduction instance = new JUnit_Introduction();
        boolean expResult= true;
        boolean result= instance.isEven(number);
        assertEquals(expResult,result);
    }
}

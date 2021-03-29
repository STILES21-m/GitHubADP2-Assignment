/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.danielmarais;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author hp i5
 */
public class GamerTest {
    
     public GamerTest() {
    }
    
    public Gamer buildtest1;
    public Gamer buildtest2;
    public Gamer buildtest3;
    @Before
    public void setUp() {
        buildtest1= new Gamer();
        buildtest2= new Gamer();
        buildtest3= buildtest1;
    }
    
    @Test
    public void testIdentity(){
        assertSame(buildtest1, buildtest3);
    }
    @Test
    public void testEquality(){
        assertEquals(buildtest1,buildtest3);
    }
    @Test
    public void testFail(){
      fail("The test case is a prototype.");
      assertEquals(buildtest1,buildtest3);
    }
    @Test(timeout=1000)
    public void testTimeOut(){
          final int factorialof= 1+(int) (30000+Math.random());
    assertEquals(buildtest1,buildtest3);
    }
    @Test
    @Disabled("Deliberately Disabling test")
    public void testDisable(){
        assertEquals(buildtest1,buildtest3);
    }
    
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
       
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ChangeNumberTest {
    private ChangeNumber cNumber = new ChangeNumber();

    @Test
    public void testToBinary() {
        assertEquals(10000, cNumber.toBinary(16)); 
        assertEquals(101,cNumber.toBinary(-27));
        assertTrue(1001==cNumber.toBinary(9));
        assertFalse(1001==cNumber.toBinary(8));
    }
    @After
    public void testToOctal() {
        assertEquals(131, cNumber.toOctal(89));
       assertEquals(5,cNumber.toOctal(-27));
    }
    @Before
    public void testToHex() {
        assertEquals("B4", cNumber.toHex(180));
        assertEquals("5",cNumber.toHex(-27));
    }
    @Test
    public void testFromBinary(){
        assertEquals(17,cNumber.fromBinary("10001"));
    }
    @Test
    public void testFromOCtal(){
        assertEquals(89,cNumber.fromOctal("131"));
    }
    @Test
    public void testFromHex(){
        assertEquals(180,cNumber.fromHex("B4"));
    }
    @Ignore("This Test is ignored intentionaly")
    @Test
  public void testFromHexIntension(){
    assertEquals(185,cNumber.fromHex("B4"));
  }
  @Test
  public void testWithTimeOut(){
   cNumber.toOctal(-45678);
   long startTime = System.nanoTime();
   cNumber.toOctal(-45678);
   long endTime = System.nanoTime();
   
   // Calculate the duration in nanoseconds
   long duration = endTime - startTime;
   
   // Check if the duration is less than 1 millisecond (1,000,000 nanoseconds)
   assertTrue("Method took too long to execute", duration < 1_000);
  }
}

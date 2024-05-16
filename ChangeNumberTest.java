import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChangeNumberTest {
    private ChangeNumber cNumber = new ChangeNumber();

    @Test
    public void testToBinary() {
        assertEquals(10000, cNumber.toBinary(16)); 
        assertEquals(101,cNumber.toBinary(-27));
    }
    @Test
    public void testToOctal() {
        assertEquals(131, cNumber.toOctal(89));assertEquals(5,cNumber.toBinary(-27));
    }
    @Test
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
}

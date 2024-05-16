
public class ChangeNumberTest {
    private ChangeNumber cNumber = new ChangeNumber();

    @Test
    public void testToBinary() {
        assertEquals(10000, cNumber.toBinary(16)); // for birzaf
    }
    @Test
    public void testToOctal() {
        assertEquals(131, cNumber.toOctal(89));
    }
    @Test
    public void testToHex() {
        assertEquals("B4", cNumber.toHex(180));
    }
    @Test
    public void testFromBinary(){
        assertEquals(16,cNumber.fromBinary("10000"));
    }
    @Test
    public void testFromOCtal(){
        assertEquals.(89,cNumber.fromOctal("131"));
    }
}

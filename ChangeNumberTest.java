
public class ChangeNumberTest {
    private ChangeNumber cNumber = new ChangeNumber();

    @Test
    public void testToBinary() {
        assertEquals(10000, cNumber.toBinary(16)); // for birzaf
    }
}

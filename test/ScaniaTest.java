import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScaniaTest {

    @Test
    public void testTipTrailer() {
        Scania scania = new Scania();

        scania.tipTrailer(30);
        assertEquals(30, scania.getTrailerAngle(), 0.01);

        scania.tipTrailer(80);
        assertEquals(30, scania.getTrailerAngle(), 0.01);

        scania.gas(0.5);
        scania.tipTrailer(40);
        assertEquals(30, scania.getTrailerAngle(), 0.01);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTransportTest {

    @Test
    public void loadDifferentAmountsOfCars() {
        CarTransport carTransport = new CarTransport();

        Saab95 saab1 = new Saab95();
        Saab95 saab2 = new Saab95();

        carTransport.loadCar(saab1);
        carTransport.loadCar(saab2);

        assertEquals(2, carTransport.getLoadedCars(), 0.0);
    }

    /*@Test
    public void unloadingCarTest() {
        CarTransport carTransport = new CarTransport();

        CarTransport.unloadCar()
    }*/
}

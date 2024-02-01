import java.awt.*;
import java.util.ArrayList;

public class CarTransport extends CommonBaseCar {

    private boolean rampUp;
    private ArrayList carsLoaded = new ArrayList<>();
    private final int maxCars = 6;

    public CarTransport() {
        super(2, Color.blue, 220, "carTransport", 0.0, 0.0, 0.0);
        rampUp = true;
    }

    private boolean isRampUp() {
        return rampUp;
    }

    public void raiseRamp() {
        if (getCurrentSpeed() == 0) {
            rampUp = true;
        }
    }

    public void lowerRamp() {
        if (getCurrentSpeed() == 0){
            rampUp = false;
        }
    }

    public int getLoadedCars() {
        if (carsLoaded.size() <= maxCars) {
            return carsLoaded.size();
        } else {
            return maxCars;
        }
    }

    public void loadCar(CommonBaseCar car) {
        if (!isRampUp() && getCurrentSpeed() == 0 && carsLoaded.size() < maxCars) {
            carsLoaded.add(car);
        } else {
            System.err.println("");
        }
    }

    public void unloadCar() {
        if (!isRampUp() && getCurrentSpeed() == 0 && !carsLoaded.isEmpty()) {
            carsLoaded.remove(carsLoaded.size() - 1);
        } else {
            System.err.println("");
        }
    }

}

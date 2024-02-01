import java.awt.*;

public class carTransport extends CommonBaseCar {

    private boolean rampDown;
    private double distanceFromCar;
    public carTransport() {
        super(2, Color.blue, 220, "carTransport", 0.0, 0.0, 0.0);
        rampDown = false;
    }

    public void setRampDown(boolean rampDown) {
        if (getCurrentSpeed() == 0) {
            this.rampDown = rampDown;
        }
    }

    private boolean isRampDown() {
        return rampDown;
    }

    private void loadCar() {
        if (isRampDown() && getCurrentSpeed() == 0) {

        }
    }

    private void unloadCar() {
        if (isRampDown() && getCurrentSpeed() == 0) {

        }
    }
}

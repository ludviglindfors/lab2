import java.awt.*;

public abstract class Truck extends CommonBaseCar {
    public Truck(int nrDoors, Color color, double enginePower, String modelName,
                 double xPosition, double yPosition, double direction) {
        super(nrDoors, color, enginePower, modelName, xPosition, yPosition, direction);
    }

    public void operateRamp(boolean raise) {
        if (getCurrentSpeed() == 0) {
            if (raise) {
                raiseRamp();
            } else {
                lowerRamp();
            }
        }
    }

    protected abstract void raiseRamp();

    protected abstract void lowerRamp();
}


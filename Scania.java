import java.awt.*;

public class Scania extends Truck {

    private int flapAngle;
    private boolean currentlyMoving;
    public Scania() {
        super(2, Color.blue, 220, "Scania", 0.0, 0.0, 0.0);
        this.flapAngle = 0;
        this.currentlyMoving = false;
    }

    @Override
    protected void raiseRamp() {
        flapAngle = Math.min(flapAngle + 10, 70);
    }

    @Override
    protected void lowerRamp() {
        flapAngle = Math.max(flapAngle - 10, 0);
    }
    public double getFlapAngle() {
        return flapAngle;
    }

    private boolean isFlapDown() {
        if (flapAngle == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

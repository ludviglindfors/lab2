import java.awt.*;

public class Scania extends CommonBaseCar {

    private boolean trailerUp;
    private double trailerAngle;
    public Scania() {
        super(2, Color.blue, 220, "Scania", 0.0, 0.0, 0.0);
        this.trailerUp = false;
        this.trailerAngle = 0.0;
    }

    public double getTrailerAngle(){
        return trailerAngle;
    }

    public void tipTrailer(double angle) {
        if (getCurrentSpeed() == 0) {
            if (angle >= 0 && angle <= 70) {
                trailerAngle = angle;
            } else {
                System.err.println();
            }
        } else {
            System.err.println();
        }
    }

    @Override
    public void startEngine() {
        if (!trailerUp) {
            super.startEngine();
        } else {
            System.err.println();
        }
    }

    @Override
    public void gas(double amount) {
        if (!trailerUp) {
            super.gas(amount);
        } else {
            System.err.println();
        }
    }
}

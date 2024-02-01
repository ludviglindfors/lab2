import java.awt.*;

public class Scania extends CommonBaseCar {

    private boolean trailerDown;
    private double trailerAngle;
    public Scania() {
        super(2, Color.blue, 220, "Scania", 0.0, 0.0, 0.0);
        this.trailerDown = true;
        this.trailerAngle = 0.0;
    }

    public double getTrailerAngle(){
        return trailerAngle;
    }

    public boolean isTrailerDown() {
        return trailerDown;
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
        if (isTrailerDown()) {
            super.startEngine();
        } else {
            System.err.println("You can't start the truck while trailer is open");
        }
    }

    @Override
    public void gas(double amount) {
        if (isTrailerDown()) {
            super.gas(amount);
        } else {
            System.err.println("You can't move while trailer is open");
        }
    }
}

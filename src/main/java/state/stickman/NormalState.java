package state.stickman;

public class NormalState implements State {
    @Override
    public double jump(double yPos, double yVelocity) {
        yPos = yPos + yVelocity;
        return yPos;
    }

    @Override
    public double walk(double xPos, double xVelocity) {
        xPos = xPos + xVelocity;
        return xPos;
    }

    @Override
    public double setYVelocity(double number) {
        return number;
    }

    @Override
    public double setXVelocity(double number) {
        return number;
    }
}

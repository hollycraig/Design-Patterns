package state.stickman;

public class MagicState implements State {

    double yPos;
    double xPos;

    @Override
    public double jump(double yPos, double yVelocity) {
        this.yPos = yPos + yVelocity;
        return this.yPos;
    }

    @Override
    public double walk(double xPos, double xVelocity) {
        this.xPos = xPos + xVelocity;
        return this.xPos;
    }

    @Override
    public double setYVelocity(double number) {
        return number;
    }

    @Override
    public double setXVelocity(double number) {
        return -1;
    }

}

package state.stickman;

public interface State {
    public double jump(double yPos, double yVelocity);

    public double walk(double xPos, double xVelocity);

    public double setYVelocity(double number);

    public double setXVelocity(double number);

}

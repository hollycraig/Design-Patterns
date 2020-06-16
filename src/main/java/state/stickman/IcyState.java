package state.stickman;

public class IcyState implements State {

    double xPos;
    double yPos;

    @Override
    public double jump(double yPos, double yVelocity){
        this.yPos = yPos + yVelocity*1.2;
        return this.yPos;
    }

    @Override
    public double walk(double xPos, double xVelocity){
        this.xPos = xPos + xVelocity*2;
        return this.xPos;
    }

    @Override
    public double setYVelocity(double number) {
        return number;
    }

    @Override
    public double setXVelocity(double number) {
        return 2;
    }


}

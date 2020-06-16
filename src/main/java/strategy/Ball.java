package strategy;

import javafx.scene.paint.Paint;

import java.util.List;
import java.util.Random;

public class Ball {
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;
    private Paint colour;
    BallStrategy strategy;

    Ball(double startX, double startY, double startRadius, Paint colour, BallStrategy strategy) {
        this.xPos = startX;
        this.yPos = startY;
        this.radius = startRadius;
        this.colour = colour;
        xVel = new Random().nextInt(5);
        yVel = new Random().nextInt(5);
        this.strategy = strategy;
    }

    void tick() {
        xPos += xVel;
        yPos += yVel;
    }

    void setxVel(double xVel) {
        this.xVel = xVel;
    }

    void setyVel(double yVel) {
        this.yVel = yVel;
    }

    double getRadius() {
        return radius;
    }

    double getxPos() {
        return xPos;
    }

    double getyPos() {
        return yPos;
    }

    Paint getColour() {
        return colour;
    }

    double getxVel() {
        return xVel;
    }

    double getyVel() {
        return yVel;
    }

    void setxPos(double xPos) {
        this.xPos = xPos;
    }

    void setyPos(double yPos) {
        this.yPos = yPos;
    }

    boolean slowDown = false;

    void think(List<Ball> balls, Boolean didCollide, double height, double width, boolean hitWall) {
        // Here is where the strategy should have some effect.
        // You can add parameters to the think method so the ball knows something about its
        // world to make decisions with, or you can inject things upon construction for it to query

        String instructionA = strategy.getReaction(balls.get(0));
        if (slowDown == true){
            xVel *= 0.9;
            yVel *= 0.9;
        }

        if (instructionA.equals("blue") && (didCollide || hitWall)){
            //do red stuff
            //return acceleration vector
            //x delta and y delta
            slowDown = true;

        }
        else if (instructionA.equals("black") && (hitWall || didCollide)){
            //do blue stuff
            if (width-xPos > xPos){
                xVel *= 1.1;
            }
            else{
                //go towards width
                xVel*= -1.1;
            }
            if (height-yPos > yPos){
                //go towards 0
                yVel *= -1.1;
            }
            else{
                //do towards width
                yVel *= 1.1;
            }

        }
        else if(instructionA.equals("red")){
            //do green strategy
        }
    }

    void setStrategy(BallStrategy strategy){
        this.strategy = strategy;
    }
}

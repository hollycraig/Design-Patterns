package strategy;

import java.util.List;

public class StrategyRed implements BallStrategy {


    @Override
    public String getReaction(boolean didCollide, boolean hitWall) {
        return "red";
    }
}
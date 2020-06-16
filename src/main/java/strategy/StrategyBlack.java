package strategy;

import java.util.List;

public class StrategyBlack implements BallStrategy {
    @Override
    public String getReaction(boolean didCollide, boolean hitWall) {
        return "black";
    }
}

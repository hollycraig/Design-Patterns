package strategy;

import java.util.List;

public class StrategyBlue implements BallStrategy{


    @Override
    public String getReaction(boolean didCollide, boolean hitWall) {
        if (didCollide == true || hitWall == true){
            return "blue";
        }
        return null;
    }
}

package strategy;

public interface BallStrategy {

    public String getReaction(boolean didCollide, boolean hitWall);
}

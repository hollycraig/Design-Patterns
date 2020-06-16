package composite;

public class Add implements ExpressionNode {
    private ExpressionNode lhs, rhs;

    public Add(ExpressionNode lhs, ExpressionNode rhs){
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public int execute() {
        return lhs.execute() + rhs.execute();
    }
}

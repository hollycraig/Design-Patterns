package composite;

public class Const implements ExpressionNode {

    private int constant;

    public Const(int constant){
        this.constant = constant;
    }

    @Override
    public int execute() {
        return constant;
    }
}

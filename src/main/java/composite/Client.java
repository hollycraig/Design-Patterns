package composite;

public class Client {

    ExpressionNode add = new Add(new Add(new Const(1), new Const(2)), new Const(4));
}

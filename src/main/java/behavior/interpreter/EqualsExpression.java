package behavior.interpreter;

//non terminal expression
public class EqualsExpression implements Expression{

    private Expression firstArgument;

    public EqualsExpression(Expression firstArgument) {
        this.firstArgument = firstArgument;
    }

    @Override
    public boolean interpret(String context) {
        if(firstArgument.interpret(context)){
            return true;
        }
        return false;
    }
}

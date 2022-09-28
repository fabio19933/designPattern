package behavior.interpreter;

//non terminal expression
public class AndExpression implements Expression{

    private Expression firstArgument;
    private Expression secondAgurment;

    public AndExpression(Expression firstArgument, Expression secondAgurment) {
        this.firstArgument = firstArgument;
        this.secondAgurment = secondAgurment;
    }

    @Override
    public boolean interpret(String context) {
        if(firstArgument.interpret(context) && secondAgurment.interpret(context)){
            return true;
        }
        return false;
    }
}

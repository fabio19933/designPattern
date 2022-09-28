package behavior.interpreter;

//terminal expression
public class UserExpression implements Expression{
    private String data;

    public UserExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}

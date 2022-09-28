package behavior.interpreter;

public class Main {
    public static void main(String[] args) {
        System.out.println(isMarried("Giulia").interpret("is Giulia married?"));
        System.out.println(isMale("Johsn").interpret("Johsn"));
    }
    public static Expression isMarried(String name){
        Expression firstArgument  = new UserExpression(name);
        Expression secondArgument  = new UserExpression("married");
        return new AndExpression(firstArgument,secondArgument);
    }

    public static Expression isMale(String name){
        Expression firstArgument = new UserExpression(name);
        return new EqualsExpression(firstArgument);
    }
}

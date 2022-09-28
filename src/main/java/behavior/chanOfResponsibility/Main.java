package behavior.chanOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Operation sum = new Sum();
        Operation sub = new Sub();
        Operation molt = new Molt();
        Operation div = new Div();
        sum.getNextElementOnChain(sub);
        sub.getNextElementOnChain(molt);
        molt.getNextElementOnChain(div);
        sum.doOperation(1,2, Operation.OperationSign.DIV);
    }
}

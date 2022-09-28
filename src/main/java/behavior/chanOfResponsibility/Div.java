package behavior.chanOfResponsibility;

public class Div implements Operation{
    private Operation nextElementOnChain;


    @Override
    public void getNextElementOnChain(Operation nextElementOnChain) {
        this.nextElementOnChain = nextElementOnChain;
    }

    @Override
    public void doOperation(int a, int b, OperationSign operationSign) {
        if(operationSign.equals(OperationSign.DIV)){
            System.out.println("do div " + (a / b));
        }
        else System.out.println("not valid sign selected, please select SUM, SUB, SUM or DIV");
    }
}

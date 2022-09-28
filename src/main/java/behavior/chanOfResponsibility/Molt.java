package behavior.chanOfResponsibility;

public class Molt implements Operation{
    private Operation nextElementOnChain;


    @Override
    public void getNextElementOnChain(Operation nextElementOnChain) {
        this.nextElementOnChain = nextElementOnChain;
    }

    @Override
    public void doOperation(int a, int b, OperationSign operationSign) {
        if(operationSign.equals(OperationSign.MOLT)){
            System.out.println("do molt " + (a * b));
        }
        else nextElementOnChain.doOperation(a,b,operationSign);
    }
}

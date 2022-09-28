package behavior.chanOfResponsibility;

public class Sub implements Operation{
    private Operation nextElementOnChain;


    @Override
    public void getNextElementOnChain(Operation nextElementOnChain) {
        this.nextElementOnChain = nextElementOnChain;
    }

    @Override
    public void doOperation(int a, int b, OperationSign operationSign) {
        if(operationSign.equals(OperationSign.SUB)){
            System.out.println("do sub " + (a - b));
        }
        else nextElementOnChain.doOperation(a,b,operationSign);
    }
}

package behavior.chanOfResponsibility;

public class Sum implements Operation{
    private Operation nextElementOnChain;


    @Override
    public void getNextElementOnChain(Operation nextElementOnChain) {
        this.nextElementOnChain = nextElementOnChain;
    }

    @Override
    public void doOperation(int a, int b, OperationSign operationSign) {
        if(operationSign.equals(OperationSign.SUM)){
            System.out.println("do sum " + (a + b));
        }
        else nextElementOnChain.doOperation(a,b,operationSign);
    }
}

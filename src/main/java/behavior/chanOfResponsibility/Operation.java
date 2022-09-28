package behavior.chanOfResponsibility;

public interface Operation {
    void getNextElementOnChain(Operation nextElementOnChain);
    void doOperation(int a, int b, OperationSign operationSign);
    enum OperationSign{
        SUM,
        SUB,
        MOLT,
        DIV
    }
}

package behavior.visitor;

public class TaxVisitor implements Visitor{
    @Override
    public double visit(Liquor liquor) {
        return liquor.getTotal() * 0.12 + liquor.getTotal();
    }

    @Override
    public double visit(Necessary necessary) {
        return necessary.getTotal();
    }
}

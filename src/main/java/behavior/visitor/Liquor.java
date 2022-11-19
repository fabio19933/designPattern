package behavior.visitor;

public class Liquor extends Visitable {

    public Liquor(double total) {
        super(total);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

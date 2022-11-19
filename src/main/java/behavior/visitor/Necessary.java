package behavior.visitor;

public class Necessary extends Visitable {


    public Necessary(double total) {
        super(total);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

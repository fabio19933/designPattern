package behavior.visitor;

public abstract class Visitable {
    private double total;

    public Visitable(double total) {
        this.total = total;
    }

    public abstract double accept(Visitor visitor);
    public double getTotal(){
        return this.total;
    }
}

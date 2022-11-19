package behavior.visitor;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Liquor liquor = new Liquor(12);
        Necessary necessary = new Necessary(10);
        System.out.println("liquor cost is "+ liquor.accept(taxVisitor));
        System.out.println("necessary cost is "+ necessary.accept(taxVisitor));
    }
}

package behavior.visitor;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessary necessary);
}

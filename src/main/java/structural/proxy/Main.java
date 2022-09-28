package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Process implProcess = new ProxyProcess();
        implProcess.renderPage("www.google.it");
    }
}

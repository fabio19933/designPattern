package structural.proxy;

public class ImplProcess implements Process{
    @Override
    public void renderPage(String url) {
        System.out.println("url "+ url + " correct");
    }
    public void doSomething(){

    }
}

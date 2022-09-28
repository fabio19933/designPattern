package structural.proxy;

public class ProxyProcess implements Process{

    private ImplProcess implProcess;

    public ProxyProcess() {
         implProcess = new ImplProcess();
    }

    @Override
    public void renderPage(String url) {
        if(url.equals("www.google.it")){
            throw new RuntimeException();
        }
        implProcess.renderPage(url);
    }
}

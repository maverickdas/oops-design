package factory_method;

public class HTMLButton implements ButtonI{
    public void render() {
        System.out.println("Rendered HtmlButton ..");
    }
    public void onClick() {
        System.out.println("Clicked HtmlButton ..");
    }
}

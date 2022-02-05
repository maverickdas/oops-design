package factory_method;

public class WindowsButton implements ButtonI{
    // WindowsButton() {

    // }
    public void render() {
        System.out.println("Rendered WinButton ..");
    }
    public void onClick() {
        System.out.println("Clicked on WinButton.");
    }
}

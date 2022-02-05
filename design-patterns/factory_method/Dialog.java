package factory_method;

public abstract class Dialog {
    public void render() {
        System.out.println("Rendering Dialog.");
        ButtonI b = createButton();
        b.render();
        b.onClick();
        b.render();
        System.out.println("Done rendering dialog.");
    }

    // Factory method pattern
    public abstract ButtonI createButton();
}

package factory_method;

public class WebDialog extends Dialog{
    public ButtonI createButton() {
    // if (btype == ButtonType.HTMLButton)
    //     return new HTMLButton();
    // else
    //     return null;
        return new HTMLButton();
    }
}

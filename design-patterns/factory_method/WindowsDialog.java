package factory_method;

public class WindowsDialog extends Dialog {
    public ButtonI createButton() {
    //     if (btype == ButtonType.WindowButton)
    //         return new WindowsButton();
    //     else
    //         return null;
        return new WindowsButton();
    }
}

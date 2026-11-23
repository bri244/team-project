package views;

import javax.swing.*;

public class LoginView extends JPanel {
    private final JTextField usernameField = new JTextField(15);
    private final JTextField passwordField = new JTextField(15);

    public LoginView() {
        this.add(usernameField);
        this.add(passwordField);
    }
}

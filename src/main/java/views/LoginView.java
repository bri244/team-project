package views;

import interface_adapter.login.LoginViewModel;
import interface_adapter.login.LoginController;

import javax.swing.*;

public class LoginView extends JPanel {
    private final JTextField usernameField = new JTextField(15);
    private final JTextField passwordField = new JTextField(15);

    public LoginView() {
        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();

        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.Y_AXIS));
        usernamePanel.add(new JLabel("Username"));
        usernamePanel.add(usernameField);
        usernamePanel.setMaximumSize(usernamePanel.getPreferredSize());
        usernamePanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.Y_AXIS));
        passwordPanel.add(new JLabel("Password"));
        passwordPanel.add(passwordField);
        passwordPanel.setMaximumSize(passwordPanel.getPreferredSize());
        passwordPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(Box.createVerticalStrut(100));
        this.add(usernamePanel);
        this.add(Box.createVerticalStrut(20));
        this.add(passwordPanel);
    }
}

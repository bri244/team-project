package views;

import interface_adapter.login.LoginViewModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginController;
import interface_adapter.login.LoginViewModelListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JPanel implements LoginViewModelListener {
    private final LoginViewModel loginViewModel;

    private final JTextField usernameField = new JTextField(15);
    private final JTextField passwordField = new JTextField(15);

    private final JButton login = new JButton("Log In");

    private LoginController loginController = null;

    public LoginView(LoginViewModel loginViewModel) {
        this.loginViewModel = loginViewModel;
        this.loginViewModel.addListener(this);

        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

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

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(login);
        buttonPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(Box.createVerticalStrut(100));
        this.add(usernamePanel);
        this.add(Box.createVerticalStrut(20));
        this.add(passwordPanel);
        this.add(Box.createVerticalStrut(20));
        this.add(buttonPanel);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final LoginState state = loginViewModel.getState();

                state.setUsername(usernameField.getText());
                state.setPassword(passwordField.getText());

                loginViewModel.setState(state);

                loginController.execute(state.getUsername(), state.getPassword());
            }
        });

    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    private void setFields() {
        usernameField.setText("");
    }

    @Override
    public void stateChanged() {
        setFields();
    }

}

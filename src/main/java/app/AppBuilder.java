package app;

import views.LoginView;

import javax.swing.*;
import java.awt.*;

public class AppBuilder {
    private final JPanel mainPanel = new JPanel();

    private final CardLayout cardLayout = new CardLayout();

    private LoginView loginView;

    public AppBuilder() {
        mainPanel.setLayout(cardLayout);
    }

    public AppBuilder addLoginView() {
        loginView = new LoginView();
        mainPanel.add(loginView);
        return this;
    }

    public JFrame build() {
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setMinimumSize(new java.awt.Dimension(600, 400));

        application.add(mainPanel);

        return application;
    }

}

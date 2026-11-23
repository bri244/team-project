package app;

import views.LoginView;

import javax.swing.*;

public class AppBuilder {
    private final JPanel mainPanel;

    private LoginView loginView;

    public AppBuilder() {
        this.mainPanel = new JPanel();
    }

    public AppBuilder addLoginView() {
        loginView = new LoginView();
        mainPanel.add(loginView);
        return this;
    }

    public JFrame build() {
        JFrame application = new JFrame();

        application.add(mainPanel);

        return application;
    }

}

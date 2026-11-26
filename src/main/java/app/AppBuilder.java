package app;

import interface_adapter.ViewManagerModel;
import views.ViewManager;

import views.LoginView;
import interface_adapter.login.LoginViewModel;
import interface_adapter.login.LoginController;
import interface_adapter.login.LoginPresenter;
import use_case.login.LoginInputBoundary;
import use_case.login.LoginOutputBoundary;
import use_case.login.LoginInteractor;

import javax.swing.*;
import java.awt.*;

public class AppBuilder {
    private final JPanel mainPanel = new JPanel();

    private final CardLayout cardLayout = new CardLayout();

    final ViewManagerModel viewManagerModel = new ViewManagerModel();
    ViewManager viewManager = new ViewManager(mainPanel, cardLayout, viewManagerModel);

    private LoginView loginView;
    private LoginViewModel loginViewModel;

    public AppBuilder() {
        mainPanel.setLayout(cardLayout);
    }

    public AppBuilder addLoginView() {
        loginViewModel = new LoginViewModel();
        loginView = new LoginView(loginViewModel);
        mainPanel.add(loginView, LoginViewModel.VIEW_NAME);
        return this;
    }

    public AppBuilder addLoginUseCase() {
        final LoginOutputBoundary loginOutputBoundary = new LoginPresenter(loginViewModel, viewManagerModel);
        final LoginInputBoundary loginInteractor = new LoginInteractor(loginOutputBoundary);

        LoginController loginController = new LoginController(loginInteractor);
        loginView.setLoginController(loginController);

        return this;
    }

    public JFrame build() {
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setMinimumSize(new java.awt.Dimension(600, 400));

        application.add(mainPanel);

        viewManagerModel.setCurrentViewName(LoginViewModel.VIEW_NAME);
        viewManagerModel.notifyViewChanged();

        return application;
    }

}

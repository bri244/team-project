package use_case.login;

public class LoginInteractor implements LoginInputBoundary {
    private final LoginOutputBoundary loginPresenter;

    public LoginInteractor(LoginOutputBoundary loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void execute(LoginInputData loginInputData) {
        String username = loginInputData.getUsername();
        String password = loginInputData.getPassword();

        final LoginOutputData loginOutputData = new LoginOutputData("username", "password");
        loginPresenter.prepareView(loginOutputData);
    }
}

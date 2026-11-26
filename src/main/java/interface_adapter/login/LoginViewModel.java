package interface_adapter.login;

public class LoginViewModel {
    private LoginState state = new LoginState();

    public LoginState getState() {
        return state;
    }

    public void setState(LoginState state) {
        this.state = state;
    }

}

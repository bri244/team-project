package interface_adapter.login;

import java.util.ArrayList;
import java.util.List;

public class LoginViewModel {
    public static final String VIEW_NAME = "login";

    private final List<LoginViewModelListener> listeners = new ArrayList<>();

    private LoginState state = new LoginState();

    public LoginState getState() {
        return state;
    }

    public void setState(LoginState state) {
        this.state = state;
    }

    public void addListener(LoginViewModelListener listener) {
        listeners.add(listener);
    }

    public void notifyStateChanged() {
        for (LoginViewModelListener listener : listeners) {
            listener.stateChanged();
        }
    }

}

package chiachen.example.com.unittestpractice.mvp;



/**
 * Created by jianjiacheng on 08/11/2017.
 */

public class LoginPresenter {
    private final LoginView mLoginView;
    private final UserManager mUserManager;

    public LoginPresenter(LoginView loginView, UserManager userManager) {
        this.mLoginView = loginView;
        this.mUserManager = userManager;
    }

    public void login(String username, String password) {
        mLoginView.showLoginHint();
        mUserManager.performLogin(username, password, new UserManager.LoginCallback() {
            @Override
            public void onSuccess() {
                mLoginView.showSuccess();
            }

            @Override
            public void onFail(int code) {
                mLoginView.showError();
            }
        });
    }
}

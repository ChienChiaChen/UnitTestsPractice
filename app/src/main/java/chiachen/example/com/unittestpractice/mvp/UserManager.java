package chiachen.example.com.unittestpractice.mvp;

/**
 * Created by jianjiacheng on 08/11/2017.
 */

public class UserManager {
    public interface LoginCallback{
        void onSuccess();

        void onFail(int ErrCode);
    }

    public void performLogin(String username, String password, LoginCallback loginCallback) {

    }
}

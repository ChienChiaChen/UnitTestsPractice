package chiachen.example.com.unittestpractice;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import chiachen.example.com.unittestpractice.mvp.LoginPresenter;
import chiachen.example.com.unittestpractice.mvp.LoginView;
import chiachen.example.com.unittestpractice.mvp.UserManager;


/**
 * Created by jianjiacheng on 08/11/2017.
 */

public class TestDemo {
    @MockitoAnnotations.Mock
    LoginView mLoginView;
    @MockitoAnnotations.Mock
    UserManager mUserManager;

    LoginPresenter mLoginPresenter;

    @Captor
    ArgumentCaptor<UserManager.LoginCallback> mCallbackArgumentCaptor;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        mLoginPresenter = new LoginPresenter(mLoginView, mUserManager);
    }

    @Test
    public void showError() {
        mLoginPresenter.login("username", "password");
        Mockito.verify(mUserManager, Mockito.times(1)).performLogin(Mockito.anyString(), Mockito.anyString(), mCallbackArgumentCaptor.capture());
        mCallbackArgumentCaptor.getValue().onFail(0);
        Mockito.verify(mLoginView, Mockito.times(1)).showError();
    }

    @Test
    public void showSuccess() {
        mLoginPresenter.login("username", "password");
        Mockito.verify(mUserManager, Mockito.times(1)).performLogin(Mockito.anyString(), Mockito.anyString(), mCallbackArgumentCaptor.capture());
        mCallbackArgumentCaptor.getValue().onSuccess();
        Mockito.verify(mLoginView, Mockito.times(1)).showSuccess();
    }
}

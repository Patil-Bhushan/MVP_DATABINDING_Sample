package com.ebhushan.mvp_databinding_sample.signin;

public class SigninPresenter implements SigninContract.SigninPrese {

    private SigninContract.signinView view;

    public SigninPresenter(SigninContract.signinView v) {
        view = v;
    }

    @Override
    public void handlepageLoad() {

        view.showToast();
    }

    @Override
    public void handleSignIn(String user, String pass) {
        User u = new User(user, pass);
        if (u.checkValidation())
            view.showSignIn();
        else view.showsigninFailed();

    }


}

package com.ebhushan.mvp_databinding_sample.signin;

public interface SigninContract {

    interface signinView {

        void showToast();

        void showSignIn();

        void showsigninFailed();
    }

    interface SigninPrese {
        void handlepageLoad();

        void handleSignIn(String user, String pass);
    }

    interface IUser {
        String getUserName()
                ;

        String getPassword();

        Boolean checkValidation();
    }
}

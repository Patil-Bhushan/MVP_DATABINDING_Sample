package com.ebhushan.mvp_databinding_sample.main;

public interface MainInterface {

    interface MainView{

        void showSignInScreen();
        void showSignUpScreen();


    }

    interface MainPresenter{

        void handleSignInClick();
        void handleSignUpClick();
    }
}

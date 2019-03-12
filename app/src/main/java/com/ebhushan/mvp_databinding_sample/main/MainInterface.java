package com.ebhushan.mvp_databinding_sample.main;

import android.view.View;

public interface MainInterface {

    interface MainView{

        void showSignInScreen();
        void showSignUpScreen();


    }

    interface MainPresenter{

        void handleSignInClick(View v);
        void handleSignUpClick(View v);
    }
}

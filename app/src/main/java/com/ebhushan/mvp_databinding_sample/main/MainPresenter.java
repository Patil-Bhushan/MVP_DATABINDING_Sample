package com.ebhushan.mvp_databinding_sample.main;

import android.view.View;

public class MainPresenter implements MainInterface.MainPresenter {

    private MainInterface.MainView mainview;

    public MainPresenter(MainInterface.MainView view){
        mainview=view;
    }

    @Override
    public void handleSignInClick(View v) {
mainview.showSignInScreen();
    }

    @Override
    public void handleSignUpClick(View v) {
        mainview.showSignUpScreen();
    }
}

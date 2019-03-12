package com.ebhushan.mvp_databinding_sample.main;

public class MainPresenter implements MainInterface.MainPresenter {

    private MainInterface.MainView mainview;

    public MainPresenter(MainInterface.MainView view){
        mainview=view;
    }

    @Override
    public void handleSignInClick() {
mainview.showSignInScreen();
    }

    @Override
    public void handleSignUpClick() {
        mainview.showSignUpScreen();
    }
}

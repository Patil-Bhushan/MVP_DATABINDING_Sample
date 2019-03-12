package com.ebhushan.mvp_databinding_sample.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    private MainInterface.MainView mvpView;

    private MainPresenter mvp_presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mvp_presenter=new MainPresenter(mvpView);
    }

    @Test
    public void handleSignInClick() {
mvp_presenter.handleSignInClick();
verify(mvpView).showSignInScreen();
    }

    @Test
    public void handleSignUpClick() {
        mvp_presenter.handleSignUpClick();
        verify(mvpView).showSignUpScreen();
    }
}
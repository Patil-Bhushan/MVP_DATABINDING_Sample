package com.ebhushan.mvp_databinding_sample.signin;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class SigninPresenterTest {


    @Mock
    private SigninContract.signinView view;
    private SigninPresenter presenter;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter=new SigninPresenter(view);
    }

    @Test
    public void handlepageLoad() {
        presenter.handlepageLoad();
        verify(view).showToast();
    }
}
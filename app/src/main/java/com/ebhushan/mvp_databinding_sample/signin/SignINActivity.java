package com.ebhushan.mvp_databinding_sample.signin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.ebhushan.mvp_databinding_sample.R;

public class SignINActivity extends AppCompatActivity  implements SigninContract.signinView{

    private SigninContract.SigninPrese presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        presenter=new SigninPresenter(this);
    }

    @Override
    public void showToast() {
        Toast.makeText(this,"Sign in Screen",Toast.LENGTH_LONG).show();

    }
}

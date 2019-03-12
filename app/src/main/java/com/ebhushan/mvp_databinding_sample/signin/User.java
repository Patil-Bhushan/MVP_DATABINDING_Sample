package com.ebhushan.mvp_databinding_sample.signin;

public class User implements SigninContract.IUser {

    private String user;

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    private String pass;
    @Override
    public String getUserName() {
        return user;
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public Boolean checkValidation() {
        if(user.isEmpty() || pass.isEmpty()){
            return false;
        }else return true;

    }


}

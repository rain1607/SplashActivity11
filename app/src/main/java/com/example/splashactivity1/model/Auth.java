package com.example.splashactivity1.model;

public class Auth {
    private static final String EMAIL="namandfon@hotmail.com"; //**
    private static final String PASSWORD="0850445415Ff"; //**

    private String mEmail;
    private  String mPassword;

    public Auth(String email,String password){
        this.mEmail=email;
        this.mPassword=password;
    }

   /* public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getPassword() {
        return mPassword;
    }

    public Auth(String mEmail, String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }*/

    public boolean check(){
        if(mEmail.equals(EMAIL)&&mPassword.equals(PASSWORD)){
            return true;
        }
        else{
            return false;
        }
    }
}

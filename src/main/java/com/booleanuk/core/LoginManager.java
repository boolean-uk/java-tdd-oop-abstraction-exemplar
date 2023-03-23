package com.booleanuk.core;

public class LoginManager {
    private String email;
    private String password;
    private boolean canLogin;

    public LoginManager(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.setCanLogin(false);
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return "Success";
        } else {
            return "Invalid email address";
        }
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        if (password.length() < 8) {
            return "Invalid password";
        } else {
            this.password = password;
            return "Success";
        }
    }

    public boolean getLoginStatus() {
        return canLogin;
    }

    public void setCanLogin(boolean canLogin) {
        this.canLogin = canLogin;
    }

    public void toggleLoginStatus() {
        if (getLoginStatus()) {
            this.setCanLogin(false);
        } else {
            this.setCanLogin(true);
        }
        // Could do the following instead but it isn't particularly readable
        //this.setCanLogin(!getLoginStatus());

    }


}

package com.samantha.password_validator;

/**
 * Created by Samantha on 2017-05-28.
 */

public class ValidatePassword {
    private String password;
    /**
     *
     * @ValidatePassword
     */
    public ValidatePassword(){
        password = "";
    }

    /**
     *
     * @param input The password
     */
    public ValidatePassword(String input){
        password = input;
    }

    /**
     *
     * @return  A string, get the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password  A string, set the password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Checks whether a password meets requirements
     * @return An int, the number of rules passed.
     */
    public int isStrongPassword(){
        int numOfRulesPassed = 0;

        return numOfRulesPassed;
    }

    /**
     *
     * @return  A boolean, returns false if the text is password, true otherwise.
     */
    protected boolean isNotPassword(){
        if(password.toLowerCase().equals("password")) {
            return false;
        }
        else{
            return true;
        }
    }

    /**
     *
     * @return  A boolean, true false if less than 8 characters, true otherwise.
     */
    protected boolean isValidLength(){
        if(password.length()<8){
            return false;
        }
        else{
            return true;
        }
    }


}

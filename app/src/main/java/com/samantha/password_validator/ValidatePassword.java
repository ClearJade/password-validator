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
     * Checks to make sure string isn't "password"
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
     * Checks whether string is at least 8 chars.
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

    /**
     * Checks whether string contains at least one number.
     * @return  A boolean, true if contains at least one number, false otherwise.
     */
    protected boolean containsDigits(){
        if(password.matches(".*\\d+.*")){
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * Checks whether string contains at least one letter.
     * @return  A boolean, true if contains at least one letter, false otherwise.
     */
    protected boolean containsLetters(){
        if(password.matches(".*[a-zA-Z]+.*")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *Checks whether string uses both cases.
     * @return  A boolean, true if contains both cases false otherwise.
     */
    protected boolean usesBothCases(){
        String upper = password.toUpperCase();
        String lower = password.toLowerCase();

        //if password is the same as either the all upper or lower case version it cannot be mixed case
        if(password.equals(upper) || password.equals(lower)){
            return false;
        }
        else{
            return true;
        }


    }



}

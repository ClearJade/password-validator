package com.samantha.password_validator;

import org.junit.Test;

import static junit.framework.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    ValidatePassword password0 = new ValidatePassword();
    ValidatePassword password1 = new ValidatePassword("TEST");
    ValidatePassword password2 = new ValidatePassword("word1");
    ValidatePassword password3 = new ValidatePassword("password123");
    ValidatePassword password4 = new ValidatePassword("password");
    ValidatePassword password5 = new ValidatePassword("PaSsWoRd");
    ValidatePassword password6 = new ValidatePassword("0011223345");

    @Test
    public void notPassword(){
        //are not password
        assertTrue(password0.isNotPassword());
        assertTrue(password1.isNotPassword());
        assertTrue(password2.isNotPassword());
        assertTrue(password3.isNotPassword());
        assertTrue(password6.isValidLength());
        //are password
        assertFalse(password4.isNotPassword());
        assertFalse(password5.isNotPassword());


    }

    @Test
    public void validLength(){
        //are shorter than 8 characters
        assertFalse(password0.isValidLength());
        assertFalse(password1.isValidLength());
        assertFalse(password2.isValidLength());

        //are at least 8 characters
        assertTrue(password3.isValidLength());
        assertTrue(password4.isValidLength());
        assertTrue(password5.isValidLength());
        assertTrue(password6.isValidLength());

    }

    @Test
    public void hasNumbers() {
        //does not contain numbers
        assertFalse(password0.containsDigits());
        assertFalse(password1.containsDigits());
        assertFalse(password4.containsDigits());
        assertFalse(password5.containsDigits());

        //contains at least one number
        assertTrue(password3.containsDigits());
        assertTrue(password2.containsDigits());
        assertTrue(password6.containsDigits());

    }

    @Test
    public void hasLetters() {
        //does not contain letters
        assertFalse(password0.containsLetters());
        assertFalse(password6.containsLetters());


        //contains at least one letter
        assertTrue(password1.containsLetters());
        assertTrue(password2.containsLetters());
        assertTrue(password3.containsLetters());
        assertTrue(password4.containsLetters());
        assertTrue(password5.containsLetters());
    }
    @Test
    public void bothCases() {
        //uses both cases
        assertTrue(password5.usesBothCases());

        //do not use both cases
        assertFalse(password0.usesBothCases());
        assertFalse(password1.usesBothCases());
        assertFalse(password2.usesBothCases());
        assertFalse(password3.usesBothCases());
        assertFalse(password4.usesBothCases());
        assertFalse(password6.usesBothCases());

    }




}
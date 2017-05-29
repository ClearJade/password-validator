package com.samantha.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Validate button */
    public void evaluatePasswordStrength(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);

        ValidatePassword password = new ValidatePassword(editText.getText().toString());


        String message = getMessage(password);
        TextView textToReplace = (TextView) findViewById(R.id.textView);
        textToReplace.setText(message);
    }

    private String getMessage(ValidatePassword password){
        String message = "";
        int strength = password.getPasswordStrength();

        if(strength == 5){
            message = "Password is strong";
        }
        else{
            message = "Password is not strong enough";
        }

        return message;
    }


}

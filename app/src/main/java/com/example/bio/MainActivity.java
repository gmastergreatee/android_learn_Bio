package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterHobbies;
    private TextView hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterHobbies = findViewById(R.id.txt_hobbies);
        hobbies = findViewById(R.id.lbl_hobbies);
    }

    public void setHobbies(View view) {
        String text = enterHobbies.getText().toString().trim();
        hobbies.setText(
                String.format(
                        "Hobbies : %s",
                        text
                )
        );

        if (text.length() > 0)
            hobbies.setVisibility(View.VISIBLE);
        else
            hobbies.setVisibility(View.GONE);

        // hide keyboard on done-click
        InputMethodManager keyboardManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        keyboardManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
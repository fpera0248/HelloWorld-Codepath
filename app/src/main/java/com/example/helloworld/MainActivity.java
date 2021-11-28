package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.brown));
            }
        });
        // User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // #66aa55 - mid green
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        findViewById(R.id.changetextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });


        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User can tap on the background view to reset all views to default settings
                // 1. Reset the text to "Hello from Fernando" id - text
                ((TextView) findViewById(R.id.text)).setText("Hello from Fernando");

                // 2. Reset the color of the text to original color
                //original color - black, text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3. Reset the background color
                //original background color - light_purple
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_green));;
            }
        });

        // User can tap the "Change text string" button tp update the label with the text from the text field.
        findViewById(R.id.changeCustomTextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // If the text string is empty. update the abel with default text string
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}
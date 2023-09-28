package com.example.lab1part3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        answerTextView = findViewById(R.id.answerTextView);

        Button addButton = findViewById(R.id.button);
        Button multiplyButton = findViewById(R.id.button2);
        Button clearButton = findViewById(R.id.button3);

        // Set click listeners for buttons
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyNumbers();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();
            }
        });
    }

    private void addNumbers() {
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            int sum = num1 + num2;
            answerTextView.setText("Answer: " + sum);
        } catch (NumberFormatException e) {
            answerTextView.setText("Invalid input. Please enter valid numbers.");
        }
    }

    private void multiplyNumbers() {
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            int product = num1 * num2;
            answerTextView.setText("Answer: " + product);
        } catch (NumberFormatException e) {
            answerTextView.setText("Invalid input. Please enter valid numbers.");
        }
    }

    private void clearFields() {
        editText1.setText("");
        editText2.setText("");
        answerTextView.setText("Answer");
    }
}

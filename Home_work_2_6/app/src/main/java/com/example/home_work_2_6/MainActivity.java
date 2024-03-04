package com.example.home_work_2_6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.button.MaterialButton;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText1;
    private MaterialButton button;
    private TextView text;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        button1 = findViewById(R.id.button1);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateLoginButtonBackground();}

            @Override
            public void afterTextChanged(Editable s) {
                updateLoginButtonBackground();}
        });


        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateLoginButtonBackground();}

            @Override
            public void afterTextChanged(Editable s) {
                updateLoginButtonBackground();}
        });


        button.setOnClickListener(v -> {
            if (editText.getText().toString().equals("admin") && editText1.getText().toString().equals("admin")) {

                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                editText.setVisibility(View.GONE);
                editText1.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                text1.setVisibility(View.GONE);
                text2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                text.setVisibility(View.VISIBLE);
            } else {
                Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();}
        });
    }
    private void updateLoginButtonBackground() {
            boolean hasText = editText.getText().length() > 0 || editText1.getText().length() > 0;
            int backgroundColor = hasText ? R.color.orange : R.color.gray1;
            button.setBackgroundColor(getResources().getColor(backgroundColor));
    }
    }





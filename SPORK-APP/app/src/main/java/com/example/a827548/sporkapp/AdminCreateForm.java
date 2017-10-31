package com.example.a827548.sporkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdminCreateForm extends AppCompatActivity {

    EditText enterName;
    Button showName;
    TextView showNameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_create_form);

        enterName = (EditText) findViewById(R.id.editText);
        showName = (Button) findViewById(R.id.button);
        showNameText = (TextView) findViewById(R.id.textView2);

        showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = enterName.getText().toString();
                showNameText.setText(name);
            }
        });
    }
}

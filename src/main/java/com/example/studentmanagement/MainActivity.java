package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name,email,cgpa;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =  (EditText)  findViewById(R.id.name_id);
        email =  (EditText)  findViewById(R.id.email_id);
        cgpa =  (EditText)  findViewById(R.id.cgpa_id);
        textView = (TextView) findViewById(R.id.textView_id);

        button=  (Button)  findViewById(R.id.button_id);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String name1 = name.getText().toString();
        String email1 = email.getText().toString();
        String cgpa1 = cgpa.getText().toString();
        if (v.getId()==R.id.button_id){
            textView.setText("Name: "+name1+"\nEmail: "+email1+"\nCGPA: "+cgpa1);
            clearText();
        }


    }

    public void clearText()
    {
        name.setText("");
        email.setText("");
        cgpa.setText("");
        name.requestFocus();
    }


}












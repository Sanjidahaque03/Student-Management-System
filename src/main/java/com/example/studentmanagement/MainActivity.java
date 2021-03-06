package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name,id,cgpa;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =  (EditText)  findViewById(R.id.name_id);
        id =  (EditText)  findViewById(R.id.id_id);
        cgpa =  (EditText)  findViewById(R.id.cgpa_id);
        textView = (TextView) findViewById(R.id.textView_id);

        button=  (Button)  findViewById(R.id.button_id);
        button.setOnClickListener(this);


        
    }

    @Override
    public void onClick(View v) {
        String name1 = name.getText().toString();
        String id1 = id.getText().toString();
        String cgpa1 = cgpa.getText().toString();

        TableLayout table = (TableLayout) findViewById(R.id.tb);
        TableRow row = new TableRow(this);
        TextView tv = new TextView(this);



        if (v.getId()==R.id.button_id){

            textView.setText("Name: "+name1+"\nEmail: "+id1+"\nCGPA: "+cgpa1);
            
            tv.setText(name1);
            tv.setText(id1);
            tv.setText(cgpa1);

            row.addView(tv);
            table.addView(row);
        }





        clearText();
    }

    public void clearText()
    {
        name.setText("");
        id.setText("");
        cgpa.setText("");
        name.requestFocus();
    }


}












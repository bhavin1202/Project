package com.example.project;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class student_page extends AppCompatActivity {

    String EmailHolder;
    TextView Email;
    Button LogOUT, MyBooks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);

        Email = (TextView)findViewById(R.id.textView1);
        LogOUT = (Button)findViewById(R.id.button1);

        Intent intent = getIntent();

        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(com.example.project.student.UserEmail);

        // Setting up received email to TextView.
        Email.setText(Email.getText().toString()+ EmailHolder);

        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Finishing current DashBoard activity on button click.
                finish();

                Toast.makeText(student_page.this,"Log Out Successfull", Toast.LENGTH_LONG).show();

            }
        });

    }
    public void details_button (View view) {
        Intent intent = new Intent(this,details.class);
        startActivity(intent);
    }
    public void search_button (View view) {
        Intent intent = new Intent(this,Mylistview.class);
        startActivity(intent);
    }
    public void wishlist_button (View view) {
        Intent intent = new Intent(this,Mywishlist.class);
        startActivity(intent);
    }
}
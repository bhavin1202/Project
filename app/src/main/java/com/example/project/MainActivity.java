package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void student (View view) {
        Intent intent = new Intent(this,student.class);
        startActivity(intent);
    }
    public void librarian (View view) {
        Intent intent = new Intent(this,librarian.class);
        startActivity(intent);
    }

}

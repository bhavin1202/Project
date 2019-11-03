package com.example.project;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by HP on 4/6/2016.
 */
public class item1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item1);
    }
    public void Issue (View view) {
        Intent intent = new Intent(this,Mylistview.class);
        Toast.makeText(item1.this,"Book issued",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
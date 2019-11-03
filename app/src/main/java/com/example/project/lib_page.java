package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lib_page extends AppCompatActivity {
    Button classroomcall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_page);

        classroomcall =(Button)findViewById(R.id.book_next);
        classroomcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), classroom.class);
                view.getContext().startActivity(intent);}
        });

    }

    public void SeatFunc (View view) {
        Intent intent = new Intent(this,seat.class);
        startActivity(intent);
    }

    public void scan_qr_code (View view) {
        Intent intent = new Intent(this,qr_code.class);
        startActivity(intent);
    }

}

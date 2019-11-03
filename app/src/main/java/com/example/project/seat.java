package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class seat extends AppCompatActivity {
    String[] mobileArray = {"Android", "Iphone", "Windows", "BB", "Webos", "Ubuntu", "MAc OS X"};
    ArrayAdapter adapter;String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);
        int counter = 0;
       for (int i = 101; i < 110; i++) {
            System.out.println("Classroom No:"+i);

            for (int j = 1; j < 5; j++) {

            System.out.println(mobileArray[counter]);
                adapter = new ArrayAdapter<String>(this, R.layout.activity_listviewdetails, mobileArray);

                ListView listView = (ListView) findViewById(R.id.mobile_list);
                listView.setAdapter(adapter);


                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        // TODO Auto-generated method stub

                        value = String.valueOf(adapter.getItem(position));
                        Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
                    }
                });
                System.out.println(value);
                counter++;
            }
  }
    }
}

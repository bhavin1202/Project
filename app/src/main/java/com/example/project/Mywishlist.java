package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Mywishlist extends AppCompatActivity {
    Button btnAdd, btnClear;
    ListView lstView;
    EditText txtCompanyName;
    com.example.project.DatabaseController dbController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywishlist);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtCompanyName = (EditText) findViewById(R.id.txtCompanyName);
        lstView = (ListView) findViewById(R.id.lstView);

        FillList();
    }

    public void AddData(View v) {
        try {
            if (TextUtils.isEmpty(txtCompanyName.getText().toString()))
                Toast.makeText(this, "Please enter Book name", Toast.LENGTH_SHORT).show();
            else {
                dbController = new com.example.project.DatabaseController(this);
                String s = dbController.InsertData(txtCompanyName.getText().toString());
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                FillList();
                txtCompanyName.setText("");
            }
        } catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void ClearData(View v) {
        txtCompanyName.setText("");
    }

    public void FillList() {
        try {
            int[] id = {R.id.txtListElement};
            String[] CompanyName = new String[]{"CompanyName"};
            if (dbController == null)
                dbController = new com.example.project.DatabaseController(this);
            SQLiteDatabase sqlDb = dbController.getReadableDatabase();
            Cursor c = dbController.getCompanies();

            SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                    R.layout.list_template, c, CompanyName, id, 0);
            lstView.setAdapter(adapter);

        } catch (Exception ex) {
            Toast.makeText(Mywishlist.this, ex.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }

}
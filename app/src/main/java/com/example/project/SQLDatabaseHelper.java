package com.example.project;



/**
 * Created by Juned on 3/13/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class SQLDatabaseHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME="Seating.db";

    public static final String TABLE_NAME="LibTable";

    public static final String Table_Column_ID="Lid";

    public static final String Table_Column_1_Name="Lname";

    public static final String Table_Column_2_Email="Lemail";

    public static final String Table_Column_3_Password="Lpassword";

    public SQLDatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_ID+" INTEGER PRIMARY KEY, "+Table_Column_1_Name+" VARCHAR, "+Table_Column_2_Email+" VARCHAR, "+Table_Column_3_Password+" VARCHAR)";
        database.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

}

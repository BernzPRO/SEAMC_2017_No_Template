package com.example.seongbincho.seamc_2017_no_template;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/30/16.
 */

public class schedule_database extends SQLiteOpenHelper {
    public static final String DBNAME = "sample.sqlite";
    public static final String DBLOCATION = "/data/data/com.example.seongbincho.seamc_2017_no_template";
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public schedule_database(Context context) {
        super(context, DBNAME, null, 1);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDatabase() {
        String dbPath = mContext.getDatabasePath(DBNAME).getPath();
        if(mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase() {
        if(mDatabase!=null) {
            mDatabase.close();
        }
    }

    public List<Schedule_list> getListProduct() {
        Schedule_list schedule_list = null;
        List<Schedule_list> schedule_listList = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM PRODUCT", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            schedule_list = new Schedule_list(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            schedule_listList.add(schedule_list);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return schedule_listList;
    }
}


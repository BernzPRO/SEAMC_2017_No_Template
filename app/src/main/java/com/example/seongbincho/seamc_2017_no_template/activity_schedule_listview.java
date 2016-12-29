package com.example.seongbincho.seamc_2017_no_template;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by seongbincho on 12/30/16.
 */

public class activity_schedule_listview extends Activity {
    private ListView lvProduct;
    private schedule_adapter adapter;
    private List<Schedule_list> mScheduleList;
    private schedule_database mDBHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_schedule_schedule);
        lvProduct = (ListView)findViewById(R.id.listview_schedule);
        mDBHelper = new schedule_database(this);

        //Check exists database
        File database = getApplicationContext().getDatabasePath(schedule_database.DBNAME);
        if(false == database.exists()) {
            mDBHelper.getReadableDatabase();
            //Copy db
            if(copyDatabase(this)) {
                Toast.makeText(this, "Copy database succes", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Copy data error", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        //Get product list in db when db exists
        mScheduleList = mDBHelper.getListProduct();
        //Init adapter
        adapter = new schedule_adapter(this, mScheduleList);
        //Set adapter for listview
        lvProduct.setAdapter(adapter);

    }

    private boolean copyDatabase(Context context) {
        try {

            InputStream inputStream = context.getAssets().open(schedule_database.DBNAME);
            String outFileName = schedule_database.DBLOCATION + schedule_database.DBNAME;
            OutputStream outputStream = new FileOutputStream(outFileName);
            byte[]buff = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, length);
            }
            outputStream.flush();
            outputStream.close();
            Log.w("MainActivity","DB copied");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

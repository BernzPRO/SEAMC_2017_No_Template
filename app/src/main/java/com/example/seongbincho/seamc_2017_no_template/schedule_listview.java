package com.example.seongbincho.seamc_2017_no_template;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class schedule_listview extends Activity {
    private ListView lvSchedule;
    private schedule_adapter adapter;
    private List<schedulelis> mScheduleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_lis);

        lvSchedule = (ListView)findViewById(R.id.listview_schedule);

        mScheduleList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mScheduleList.add(new schedulelis(1, "Opening Ceremony", "18:00~19:00", "Theater"));
        mScheduleList.add(new schedulelis(2, "IceBreaker", "19:00~21:30", "Theater"));
        mScheduleList.add(new schedulelis(3, "All teachers planning meeting", "21:30~", "Room"));



        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}


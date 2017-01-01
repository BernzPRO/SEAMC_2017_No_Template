package com.example.seongbincho.seamc_2017_no_template;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class day2_listview extends Activity {
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
        mScheduleList.add(new schedulelis(1, "Breakfast", "06.30-07.45", "Atria Hotel"));
        mScheduleList.add(new schedulelis(2, "Bus from Hotel Atria to BSJ", "07.45-08.30", "Bus"));
        mScheduleList.add(new schedulelis(3, "Individual Round", "08.30-10.00", "-"));
        mScheduleList.add(new schedulelis(4, "Quick Break", "10.00-10.15", "-"));
        mScheduleList.add(new schedulelis(5, "Lecture", "10.15-11.15", "-"));
        mScheduleList.add(new schedulelis(6, "PassBack Round", "11.30-12.30", "-"));
        mScheduleList.add(new schedulelis(7, "Lunch", "12.30-13.30", "Cafeteria"));
        mScheduleList.add(new schedulelis(8, "Outdoor/Trail/Etc Adventure", "13.30-15.30", "-"));
        mScheduleList.add(new schedulelis(9, "Activities/Games Round", "15.45-17.00", "-"));
        mScheduleList.add(new schedulelis(10, "Dinner", "17.00-18.00", "-"));
        mScheduleList.add(new schedulelis(11, "Trail Adventure Completion Deadline", "19.00-20.00", "-"));
        mScheduleList.add(new schedulelis(12, "Bus to accomodation", "20.00", "Bus"));











        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}


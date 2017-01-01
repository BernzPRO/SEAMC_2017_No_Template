package com.example.seongbincho.seamc_2017_no_template;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class day3_listview extends Activity {
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
        mScheduleList.add(new schedulelis(3, "Team Round", "08.30-09.30", "-"));
        mScheduleList.add(new schedulelis(4, "Quick Break", "09.30-09.45", "-"));
        mScheduleList.add(new schedulelis(5, "Codebreakers' Round", "09.45-11.00", "-"));
        mScheduleList.add(new schedulelis(6, "Lightning Round", "11.00-12.15", "-"));
        mScheduleList.add(new schedulelis(7, "Lunch with Codebreakers' Final", "12.15-13.30", "-"));
        mScheduleList.add(new schedulelis(8, "DEADLINE for Buddy Long Term Answers submission", "13.00", "-"));
        mScheduleList.add(new schedulelis(9, "Activities/Games Round", "13.00-14.15", "-"));
        mScheduleList.add(new schedulelis(10, "Teachers' feedback and review meeting", "13.30-14.30", "-"));
        mScheduleList.add(new schedulelis(11, "Activities/Games Round", "14.15-15.30", "-"));
        mScheduleList.add(new schedulelis(12, "Bus to accomodation", "15.30-16.00", "Bus"));
        mScheduleList.add(new schedulelis(13, "Smarten up into black tie dress", "16.00-17.30", "-"));
        mScheduleList.add(new schedulelis(14, "Gala Dinner", "18.30-21.30", "-"));












        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}


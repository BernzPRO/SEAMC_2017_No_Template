package com.example.seongbincho.seamc_2017_no_template;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class schedule_adapter extends BaseAdapter {
    private Context mContext;
    private List<schedulelis> mScheduleList;

    //Constructor

    public schedule_adapter(Context mContext, List<schedulelis> mScheduleList) {
        this.mContext = mContext;
        this.mScheduleList = mScheduleList;
    }

    @Override
    public int getCount() {
        return mScheduleList.size();
    }

    @Override
    public Object getItem(int position) {
        return mScheduleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.schedule_list, null);
        TextView activityName = (TextView)v.findViewById(R.id.activity_name);
        TextView activityTime = (TextView)v.findViewById(R.id.activity_time);
        TextView activityVenue = (TextView)v.findViewById(R.id.activity_venue);
        //Set text for TextView
        activityName.setText(mScheduleList.get(position).getActivity());
        activityTime.setText(mScheduleList.get(position).getTime());
        activityVenue.setText(mScheduleList.get(position).getVenue());

        //Save product id to tag
        v.setTag(mScheduleList.get(position).getId());

        return v;
    }
}


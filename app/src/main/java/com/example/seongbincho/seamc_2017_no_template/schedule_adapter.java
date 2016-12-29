package com.example.seongbincho.seamc_2017_no_template;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by seongbincho on 12/30/16.
 */

public class schedule_adapter extends BaseAdapter{

    private Context mContext;
    private List<Schedule_list> mScheduleList;

    public schedule_adapter(Context mContext, List<Schedule_list> mProductList) {
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
        return mScheduleList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext, R.layout.schedule_list, null);
        TextView activityname = (TextView)v.findViewById(R.id.activity_name);
        TextView activitytime = (TextView)v.findViewById(R.id.activity_time);
        TextView activityroom = (TextView)v.findViewById(R.id.activity_room);
        activityname.setText(mScheduleList.get(position).getName());
        activitytime.setText(mScheduleList.get(position).getTime());
        activitytime.setText(mScheduleList.get(position).getRoom());
        return v;
    }
}


package com.example.seongbincho.seamc_2017_no_template;

/**
 * Created by seongbincho on 12/31/16.
 */

public class schedulelis {
    private int id;
    private String activity;
    private String time;
    private String venue;

    //Constructor

    public schedulelis(int id, String activity, String time, String venue) {
        this.id = id;
        this.activity = activity;
        this.time = time;
        this.venue = venue;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {this.time = time;}

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}


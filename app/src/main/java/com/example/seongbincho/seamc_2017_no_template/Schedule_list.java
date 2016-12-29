package com.example.seongbincho.seamc_2017_no_template;

/**
 * Created by seongbincho on 12/30/16.
 */

public class Schedule_list {
    private int id;
    private  String name;
    private  String time;
    private  String room;

    public Schedule_list(int id, String name,String time, String room){
        this.id = id;
        this.name = name;
        this.time = time;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getTime() {
        return time;
    }

    public void setTime(String time){
        this.time = time;

    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room){
        this.room = room;

    }
}
package com.tzw.observer;

import java.sql.Time;

public class WeekupEvent {

    public String location;
    public String myTime;
    //一般需要事件源本身的
    public Child source;

    public WeekupEvent(String location, String myTime) {
        this.location = location;
        this.myTime = myTime;
    }

    @Override
    public String toString() {
        return "WeekupEvent{" +
                "location='" + location + '\'' +
                ", myTime=" + myTime +
                '}';
    }
}

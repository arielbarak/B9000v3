package com.example.b9000v3.Schema;

import com.example.b9000v3.Schema.Action.Action;
import com.example.b9000v3.Schema.Action.Action;

import java.util.Date;

public class Notification {

    private String notification_id;
    private Action action;
    private String triggeringUserId;
    private String effectedUserId;
    private Date action_date_time;



    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getTriggeringUserId() {
        return triggeringUserId;
    }

    public void setTriggeringUserId(String triggeringUserId) {
        this.triggeringUserId = triggeringUserId;
    }

    public String getEffectedUserId() {
        return effectedUserId;
    }

    public void setEffectedUserId(String effectedUserId) {
        this.effectedUserId = effectedUserId;
    }

    public String getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    public Date getAction_date_time() {
        return action_date_time;
    }

    public void setAction_date_time(Date action_date_time) {
        this.action_date_time = action_date_time;
    }
}


package com.example.b9000v3.Schema;

import com.example.profily.Schema.Action.Action;

import java.util.Date;

public class Notification {

    private String notificationId;
    private Action action;
    private String triggeringUserId;
    private String effectedUserId;
    private Date actionDateTime;

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

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

    public Date getActionDateTime() {
        return actionDateTime;
    }

    public void setActionDateTime(Date actionDateTime) {
        this.actionDateTime = actionDateTime;
    }
}


package com.example.b9000v3.Schema.Action;

public abstract class Action {

    public enum ActionType {
        Like, Comment, Subscription
    }

    public abstract String getDescription();
}



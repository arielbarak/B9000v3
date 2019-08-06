package com.example.b9000v3.Schema.Action;

public final class SubscriptionAction extends Action{
    private final ActionType type = ActionType.Subscription;
    private final String description = "started following you";

    public ActionType getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return " " + description;
    }
}

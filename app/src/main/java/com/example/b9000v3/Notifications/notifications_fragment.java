package com.example.b9000v3.Notifications;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Action.CommentAction;
import com.example.b9000v3.Schema.Action.LikeAction;
import com.example.b9000v3.Schema.Action.SubscriptionAction;
import com.example.b9000v3.Schema.Notification;
import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Action.CommentAction;
import com.example.b9000v3.Schema.Action.LikeAction;
import com.example.b9000v3.Schema.Action.SubscriptionAction;
import com.example.b9000v3.Schema.Notification;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class notifications_fragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private NotificationsListAdapter adapter;
    private Vector<Notification> notifications = new Vector<>(); //TODO remove

    public notifications_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notifications_fragment, container, false);

        recyclerView = view.findViewById(R.id.notifications_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        //TODO remove
        // -------------------------------------
        Notification n1 = new Notification();
        n1.setAction(new LikeAction());
        n1.setAction_date_time(
                new GregorianCalendar(2019, Calendar.JULY, 5, 22, 30, 3)
                        .getTime()
        );
        n1.setEffectedUserId("1");
        n1.setNotification_id("1");
        n1.setTriggeringUserId("2");
        // -------------------------------------
        Notification n2 = new Notification();
        n2.setAction(new SubscriptionAction());
        n2.setAction_date_time(
                new GregorianCalendar(2019, Calendar.AUGUST, 4, 22, 49, 3)
                        .getTime()
        );
        n2.setEffectedUserId("3");
        n2.setNotification_id("2");
        n2.setTriggeringUserId("45");
        // -------------------------------------
        Notification n3 = new Notification();
        n3.setAction(new CommentAction());
        n3.setAction_date_time(
                new GregorianCalendar(2019, Calendar.AUGUST, 5, 22, 54, 0)
                        .getTime()
        );
        n3.setEffectedUserId("2");
        n3.setNotification_id("3");
        n3.setTriggeringUserId("1");

        notifications.add(n1);
        notifications.add(n2);
        notifications.add(n3);


        adapter = new NotificationsListAdapter(notifications);
        recyclerView.setAdapter(adapter);


        return view;
    }

}

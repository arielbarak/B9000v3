package com.example.b9000v3.Comments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Comment;
import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Comment;

import java.util.GregorianCalendar;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class comments_fragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private CommentsListAdapter adapter;
    private Vector<Comment> comments = new Vector<>(); //TODO remove

    public comments_fragment() {
        // Required empty public constructor
    }

    Comment c1 = new Comment();

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
        Comment c1 = new Comment();
        c1.setAction_time(new GregorianCalendar(2017, 6, 21, 8, 23, 45).getTime());
        c1.setContent("comment1");
        c1.setUser_id("1");

        // -------------------------------------
        Comment c2 = new Comment();
        c2.setAction_time(new GregorianCalendar(2019, 8, 6, 20, 36, 00).getTime());
        c2.setContent("comment2");
        c2.setUser_id("2");

        // -------------------------------------
        Comment c3 = new Comment();
        c3.setAction_time(new GregorianCalendar(2019, 8, 0, 0, 0, 0).getTime());
        c3.setContent("comment3");
        c3.setUser_id("3");

        adapter = new CommentsListAdapter(comments);
        recyclerView.setAdapter(adapter);


        return view;
    }

}

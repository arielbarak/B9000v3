package com.example.b9000v3.Home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Post;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private post_to_list_adapter adapter;
    private Vector<Post> posts = new Vector<>(); //TODO remove

    public home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);

        recyclerView = view.findViewById(R.id.home_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        //TODO remove
        for (int i=0; i<10; i++)
        {
            Post post = new Post();
            post.setCaption("Caption number " + i);
            List<String> commentIds = new LinkedList<>();
            commentIds.add("1");
            commentIds.add("2");
            commentIds.add("2");
            post.setCommentsList(commentIds);
            List<String> likes = new LinkedList<>();
            likes.add("11");
            likes.add("22");
            likes.add("23");
            post.setLikedUsersList(likes);
            post.setUser_id("123123123");
            posts.add(post);
        }

        adapter = new post_to_list_adapter(posts);
        recyclerView.setAdapter(adapter);


        return view;
    }

}

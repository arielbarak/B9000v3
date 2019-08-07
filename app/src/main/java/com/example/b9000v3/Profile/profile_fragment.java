package com.example.b9000v3.Profile;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Post;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class profile_fragment extends Fragment {

    private Vector<Post> postsList = new Vector<>();
    private Vector<String> followingList = new Vector<>();
    private Vector<String> followersList = new Vector<>();

    private ImageGridAdapter adapter;
    private RecyclerView recyclerView;


    //Profile vars
    private TextView profile_username, profile_first_name, profile_last_name;
    private ImageView profile_image;
    private Button edit_profile_btn;


    //counting vars
    private TextView profileNumOfFollowers;
    private TextView profileNumOfFollowing;
    private TextView profileNumOfPosts;
    private GridLayoutManager layoutManager;


    public profile_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.profile_fragment, container, false);
        profile_username = view.findViewById(R.id.profile_username);
        profile_first_name = view.findViewById(R.id.profile_first_name);
        profile_last_name = view.findViewById(R.id.profile_last_name);
        profileNumOfFollowers = view.findViewById(R.id.profile_followers_count);
        profileNumOfFollowing = view.findViewById(R.id.profile_following_count);
        profileNumOfPosts = view.findViewById(R.id.profile_posts_count);
        profile_image = view.findViewById(R.id.profile_image);
        edit_profile_btn = view.findViewById(R.id.profile_edit_profile_btn);

        for(int i=0; i<6; i++)
        {
            followingList.add(i + "");
            followersList.add("" + (i+20));
        }

        profileNumOfFollowers.setText("" + followersList.size());
        profileNumOfFollowing.setText("" + followingList.size());
        profileNumOfPosts.setText("" + postsList.size());
        profile_username.setText("Alex");

        recyclerView = view.findViewById(R.id.home_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(getActivity(), 3);
        layoutManager.isAutoMeasureEnabled();
        recyclerView.setLayoutManager(layoutManager);

        //TODO remove
        for (int i=0; i<10; i++)
        {
            Post post = new Post();
            post.setCaption("Caption number " + i);
            List<String> commentIds = new LinkedList<String>();
            commentIds.add("1");
            commentIds.add("2");
            commentIds.add("2");
            post.setCommentsList(commentIds);
            List<String> likes = new LinkedList<String>();
            likes.add("11");
            likes.add("22");
            likes.add("23");
            post.setLikedUsersList(likes);
            post.setUser_id("123123123");
            postsList.add(post);
        }

        profileNumOfPosts.setText("" + postsList.size());

        adapter = new ImageGridAdapter(postsList);
        recyclerView.setAdapter(adapter);

        return view;
    }



}

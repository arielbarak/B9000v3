package com.example.b9000v3.Post;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.b9000v3.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Post extends Fragment {


    public Post() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.post_fragment, container, false);
    }

}

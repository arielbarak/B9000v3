package com.example.b9000v3.Search;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.Schema.User;
import com.example.b9000v3.User.UserListAdapter;
import com.example.b9000v3.R;
import com.example.b9000v3.Schema.User;
import com.example.b9000v3.User.UserListAdapter;

import java.util.Locale;
import java.util.Vector;


/**
 * A simple {@link Fragment} subclass.
 */
public class search_fragment extends Fragment {


    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private UserListAdapter adapter;
    private Vector<User> searched_users = new Vector<>(); //TODO remove

    private EditText searchBox;

    public search_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.search_fragment, container, false);

        recyclerView = view.findViewById(R.id.user_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        //TODO remove
        // -------------------------------------
        User u1 = new User();
        u1.setUsername("Alex");
        // -------------------------------------
        User u2 = new User();
        u2.setUsername("Danon");
        // -------------------------------------
        User u3 = new User();
        u3.setUsername("Teleh");

        searched_users.add(u1);
        searched_users.add(u2);
        searched_users.add(u3);



        adapter = new UserListAdapter(searched_users);
        recyclerView.setAdapter(adapter);


        searchBox = view.findViewById(R.id.search_text);
        setSearchTextListener();

        return view;
    }

    private void setSearchTextListener(){
        searchBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = searchBox.getText().toString().toLowerCase(Locale.getDefault());
                searchForMatch(text);
            }
        });
    }


    private void searchForMatch(String keyword){
        Log.d("TAG: got new word: ", keyword);
        //update the users list view
        if(keyword.length() ==0){

        }
        else{
            Vector <User> new_users = new Vector<>();
            for (User user: searched_users)
            {
                if (user.getUsername().contains(keyword)){
                    updateUsersList();
                }
            }
            Log.d("TAG: new user list ", new_users.toString());

            searched_users = new_users;
        }
    }

    private void updateUsersList(){
        Log.d("TAG", "updateUsersList: updating users list");

        adapter = new UserListAdapter(searched_users);

        recyclerView.setAdapter(adapter);

    }

}

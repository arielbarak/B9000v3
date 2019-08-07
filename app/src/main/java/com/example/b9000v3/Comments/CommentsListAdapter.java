package com.example.b9000v3.Comments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Comment;
import com.example.b9000v3.Utils.DateTimeUtils;
import com.example.b9000v3.R;
import com.example.b9000v3.Schema.Comment;
import com.example.b9000v3.Utils.DateTimeUtils;

import java.util.Vector;

public class CommentsListAdapter extends RecyclerView.Adapter<CommentsListAdapter.CommentRowViewHolder> {

    private Vector<Comment> commentsList; //TODO maybe to delete

    public CommentsListAdapter(Vector<Comment> commentsList) {
        this.commentsList = commentsList;
    }//TODO maybe to delete

    @NonNull
    @Override
    public CommentRowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_row, parent, false);
        return new CommentRowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentRowViewHolder holder, int position) {
        Comment user = commentsList.elementAt(position);
        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }


    static class CommentRowViewHolder extends RecyclerView.ViewHolder {

        ImageView commentUserImage;
        TextView commentUserUsername;
        TextView commentDescription;
        TextView actionElapsedTime;

        public CommentRowViewHolder(@NonNull View itemView) {

            super(itemView);

            commentUserImage = itemView.findViewById(R.id.comment_commenter_image);
            commentUserUsername = itemView.findViewById(R.id.commenter_username);
            commentDescription = itemView.findViewById(R.id.comment_description);
            actionElapsedTime = itemView.findViewById(R.id.comment_time_posted_ago);

        }

        public void bind(Comment comment) {

            commentUserUsername.setText("username " + comment.getUser_id()); // TODO change
            commentDescription.setText(comment.getContent());
            actionElapsedTime.setText(DateTimeUtils.getFormattedElapsedTime(comment.getAction_time()));
        }
    }
}
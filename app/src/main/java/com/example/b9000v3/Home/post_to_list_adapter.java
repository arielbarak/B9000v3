package com.example.b9000v3.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profily.R;
import com.example.profily.Schema.Post;

import java.util.Vector;

public class post_to_list_adapter extends RecyclerView.Adapter<post_to_list_adapter.PostRowViewHolder> {

    private Vector<Post> postsList; //TODO maybe to delete

    public post_to_list_adapter(Vector<Post> postsList) {
        this.postsList = postsList;
    }//TODO maybe to delete

    @NonNull
    @Override
    public PostRowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_row, parent, false);
        return new PostRowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostRowViewHolder holder, int position) {
        Post post = postsList.elementAt(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    static class PostRowViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImage;
        ImageView mainImage;
        TextView username;
        ImageView likedImage;
        ImageView commentImage;
        TextView numOfLikes;
        TextView caption;
        TextView comments;

        public PostRowViewHolder(@NonNull View itemView) {

            super(itemView);

            profileImage = itemView.findViewById(R.id.post_profile_image);
            mainImage = itemView.findViewById(R.id.post_main_image);
            username = itemView.findViewById(R.id.post_username);
            likedImage = itemView.findViewById(R.id.post_like_image);
            commentImage = itemView.findViewById(R.id.post_comment_image);
            numOfLikes = itemView.findViewById(R.id.post_num_of_likes);
            caption = itemView.findViewById(R.id.post_caption);
            comments = itemView.findViewById(R.id.post_comments_link);
        }

        public void bind(Post post){
            username.setText(post.getUserCreatorId()); //TODO change to the creators name
            numOfLikes.setText(post.getLikedUsersList().size() + " likes");
            caption.setText(post.getCaption());
            comments.setText("View all " + post.getCommentsList().size() + " comments");
        }
    }

}

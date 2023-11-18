package com.example.healthcare2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcare2.data.model.Post;
import com.example.healthcare2.databinding.ItemNotificationBinding;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private List<Post> list;
    private int layout;

    public NotificationAdapter(Context context, List<Post> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNotificationBinding binding = ItemNotificationBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = list.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemNotificationBinding binding;

        public ViewHolder(@NonNull ItemNotificationBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Post post){
            binding.txtPicture.setImageResource(post.getPicture());
            binding.txtName.setText(post.getName());
            binding.txtComment.setText(post.getComment());
            binding.txtComment1.setText(post.getComment1());
        }
    }
}

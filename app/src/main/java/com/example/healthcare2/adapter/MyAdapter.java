package com.example.healthcare2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcare2.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListItem> dataList;

    public MyAdapter(List<ListItem> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_list_medicines, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem item = dataList.get(position);

        holder.imageViewItem.setImageResource(item.getImageResourceId());
        holder.textViewName.setText(item.getItemName());
        holder.textViewPrice.setText(item.getItemPrice());
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewItem;
        public TextView textViewName;
        public TextView textViewPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            imageViewItem = itemView.findViewById(R.id.imagelist);
            textViewName = itemView.findViewById(R.id.textTitle);
            textViewPrice = itemView.findViewById(R.id.textTitle);
        }
    }
}

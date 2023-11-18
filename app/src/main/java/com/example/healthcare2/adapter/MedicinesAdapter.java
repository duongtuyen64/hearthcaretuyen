package com.example.healthcare2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthcare2.R;
import com.example.healthcare2.data.model.Post;
import com.example.healthcare2.data.model.PostMedicines;
import com.example.healthcare2.databinding.ItemMedicinesBinding;
import com.example.healthcare2.databinding.ItemNotificationBinding;

import java.util.List;

public class MedicinesAdapter extends RecyclerView.Adapter<MedicinesAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private List<PostMedicines> list;
    private int layout;

    public MedicinesAdapter(Context context, List<PostMedicines> list, int layout) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMedicinesBinding binding = ItemMedicinesBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PostMedicines postMedicines = list.get(position);
        holder.bind(postMedicines);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemMedicinesBinding binding;

        public ViewHolder(@NonNull ItemMedicinesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(PostMedicines postMedicines){
            binding.imageMedicines.setImageResource(postMedicines.getImg_medicines());
            binding.txtName.setText(postMedicines.getName());
            binding.price.setText(postMedicines.getPrice());
            binding.icSao1.setImageResource(postMedicines.getIc_star1());
            binding.icSao2.setImageResource(postMedicines.getIc_star2());
            binding.icSao3.setImageResource(postMedicines.getIc_star3());
            binding.icSao4.setImageResource(postMedicines.getIc_star4());
            binding.icSao5.setImageResource(postMedicines.getIc_star5());
        }
    }
}

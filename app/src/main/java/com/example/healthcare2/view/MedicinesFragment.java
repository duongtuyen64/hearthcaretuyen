package com.example.healthcare2.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.healthcare2.R;
import com.example.healthcare2.adapter.MedicinesAdapter;
import com.example.healthcare2.data.model.PostMedicines;
import com.example.healthcare2.databinding.FragmentMedicinesBinding;

import java.util.ArrayList;
import java.util.List;

public class MedicinesFragment extends Fragment {
    private RecyclerView recyclerView;
    private MedicinesAdapter medicinesAdapter;
    private List<PostMedicines> postMedicinesList;
    private FragmentMedicinesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMedicinesBinding.inflate(inflater);
        View view = binding.getRoot();

        recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        postMedicinesList = new ArrayList<PostMedicines>();
        PostMedicines postMedicines1 = new PostMedicines(R.drawable.picture_thuoc, "Paracetamol","0.99$",R.drawable.ic_vector_sao);
        PostMedicines postMedicines2 = new PostMedicines(R.drawable.picture_thuoc, "Paracetamol","0.99$",R.drawable.ic_vector_sao);
        PostMedicines postMedicines3 = new PostMedicines(R.drawable.picture_thuoc, "Paracetamol","0.99$",R.drawable.ic_vector_sao);
        PostMedicines postMedicines4 = new PostMedicines(R.drawable.picture_thuoc, "Paracetamol","0.99$",R.drawable.ic_vector_nuasao);
        PostMedicines postMedicines5 = new PostMedicines(R.drawable.picture_thuoc, "Paracetamol","0.99$",R.drawable.ic_vector_saorong);
        postMedicinesList.add(postMedicines1);
        postMedicinesList.add(postMedicines2);
        postMedicinesList.add(postMedicines3);
        postMedicinesList.add(postMedicines4);
        postMedicinesList.add(postMedicines5);

        medicinesAdapter = new MedicinesAdapter(requireContext(), postMedicinesList, R.layout.item_medicines);

        recyclerView.setAdapter(medicinesAdapter);

        return view;
    }
}
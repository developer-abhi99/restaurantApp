package com.example.restaurantapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.Adapter.ChineseAdapter;
import com.example.restaurantapp.Adapter.IndianAdapter;
import com.example.restaurantapp.Data.NorthData;
import com.example.restaurantapp.R;

import java.util.ArrayList;
import java.util.List;

public class ChineseFragment extends Fragment {
    private List<NorthData> northIndians;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.north_indian, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.northRecycler);
        ChineseAdapter recyclerViewAdapterHome = new ChineseAdapter(getContext(), northIndians);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapterHome);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        northIndians = new ArrayList<>();

        //Add chinese food here..
        northIndians.add(new NorthData("Chow Mein", getString(R.string.sample_text), "Price : $50", R.drawable.sample));
        northIndians.add(new NorthData("Dumplin", getString(R.string.sample_text), "Price : $20", R.drawable.sample));
        northIndians.add(new NorthData("Steamed Vermicelli Rolls", getString(R.string.sample_text), "Price : $40", R.drawable.sample));
        northIndians.add(new NorthData("Kung Pao Chicken", getString(R.string.sample_text), "Price : $70", R.drawable.sample));
        northIndians.add(new NorthData("Ma Po Tofu", getString(R.string.sample_text), "Price : $90", R.drawable.sample));
        northIndians.add(new NorthData("Spring Rolls", getString(R.string.sample_text), "Price : $36", R.drawable.sample));

    }
}
package com.example.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.worldcupapp.databinding.ListItemViewBinding;

import java.util.ArrayList;

public class WorldCupAdapter extends ArrayAdapter<WorldCupModel> {
    private Context context;
    private ArrayList<WorldCupModel> worldCupModels;

    public WorldCupAdapter(ArrayList<WorldCupModel> data, Context context) {
        super(context, R.layout.list_item_view, data);
        this.worldCupModels = data;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the binding object for the list item view
        ListItemViewBinding binding = ListItemViewBinding.inflate(LayoutInflater.from(context), parent, false);

        // Get the data item for this position
        WorldCupModel dataModel = getItem(position);

        // Set the data to the views in the list item view
        binding.countryNameTextView.setText(dataModel.getCountryName());
        binding.cupWinTextView.setText(dataModel.getCupWins());
        binding.countryImgImageView.setImageResource(dataModel.getCountryImg());

        // Return the list item view
        return binding.getRoot();
    }
}
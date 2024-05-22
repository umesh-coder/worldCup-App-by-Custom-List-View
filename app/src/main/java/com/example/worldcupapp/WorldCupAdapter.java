package com.example.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WorldCupAdapter extends ArrayAdapter<WorldCupModel> {
    private Context context;
    private ArrayList<WorldCupModel> worldCupModels;

    public WorldCupAdapter(ArrayList<WorldCupModel> data,Context context){
        super(context,R.layout.list_item_view,data);
        this.worldCupModels = data;
        this.context = context;

    }



    //class for view holder
    public static class WorldCupViewHolder{
        TextView countryName,cupWins;
        ImageView countryImage;

    }


    //layoutparam belong to layout manager
    //where custom layout , adapter , reyclerview will use Adapter

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get data item for this position
       WorldCupModel datamodel = getItem(position);

       //check if an existing view is being reused, otherwise inflate the view
        WorldCupViewHolder viewHolder;
        final View result;

        if(convertView == null){

            viewHolder = new WorldCupViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.list_item_view,parent,false);
            viewHolder.countryName = convertView.findViewById(R.id.country_name_textView);
            viewHolder.cupWins = convertView.findViewById(R.id.cup_win_textView);
            viewHolder.countryImage = convertView.findViewById(R.id.country_img_imageView);

            result = convertView;
            convertView.setTag(viewHolder);

        }else {

            viewHolder = (WorldCupViewHolder) convertView.getTag();
            result = convertView;

        }

        //get data

        viewHolder.countryName.setText(datamodel.getCountryName());
        viewHolder.cupWins.setText(datamodel.getCupWins());
        viewHolder.countryImage.setImageResource(datamodel.getCountryImg());

         return convertView;
    }
}

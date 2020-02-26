package com.example.recyclerviewdemo2;

import android.content.Context;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    ArrayList<String> countryName,countryDesc;
    ArrayList<Integer> images;

    public MyAdapter(Context context, ArrayList<String> countryName, ArrayList<String> countryDesc, ArrayList<Integer> images) {
        this.context = context;
        this.countryName = countryName;
        this.countryDesc = countryDesc;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rowlayout,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.countryNameTextView.setText(countryName.get(position));
        holder.countryDescTextView.setText(countryDesc.get(position));
        holder.imageView.setImageResource(Integer.parseInt(String.valueOf(images.get(position))));
       // holder.imageView.setImageResource();

    }

    @Override
    public int getItemCount() {

        return countryName.size();
    }
}

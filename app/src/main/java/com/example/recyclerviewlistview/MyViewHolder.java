package com.example.recyclerviewlistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageview;
//   TextView email;
    TextView name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imageview);
//        email = itemView.findViewById(R.id.email);
        name = itemView.findViewById(R.id.name);
    }
}

//#E5D68A
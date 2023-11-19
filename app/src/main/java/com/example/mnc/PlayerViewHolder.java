package com.example.mnc;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlayerViewHolder extends RecyclerView.ViewHolder {

    private TextView playName;
    public PlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        playName = itemView.findViewById(R.id.play_name);
    }

    public void bind(String name){
        playName.setText(name);

    }
}

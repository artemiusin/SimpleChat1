package com.example.iurisconsultis;

import android.content.ClipData;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView message;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        message = itemView.findViewById(R.id.message_item);

    }
}

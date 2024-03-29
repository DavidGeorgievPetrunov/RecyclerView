
package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView wordItemView;


    public WordViewHolder(View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.word);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        wordItemView.setText(String.format("Clicked! %s", wordItemView.getText()));
    }
}
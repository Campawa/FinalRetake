package com.example.chelsi.finalretake.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chelsi.finalretake.R;

import java.util.List;

/**
 * Created by Chelsi on 6/10/2018.
 */

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<CardModel> list;
    public CardAdapter(List<CardModel> cards) {list = cards;}

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder( CardViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

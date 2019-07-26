package com.cursoandroid.adjaapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.adjaapp.R;
import com.cursoandroid.adjaapp.entities.Pastor;
import com.cursoandroid.adjaapp.listener.OnListClickInteractionListener;
import com.cursoandroid.adjaapp.viewHolder.PastorViewHolder;

import java.util.List;

public class PastorListAdapter extends RecyclerView.Adapter<PastorViewHolder> {

    private List<Pastor> mListPastor;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public PastorListAdapter (List<Pastor> pastores, OnListClickInteractionListener listener){
        this.mListPastor = pastores;
        this.mOnListClickInteractionListener = listener;
    }





    @NonNull

    @Override
    public PastorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View pastorView = inflater.inflate(R.layout.row_pastor_list, viewGroup, false);
        return new PastorViewHolder(pastorView);

    }

    @Override
    public void onBindViewHolder(@NonNull PastorViewHolder pastorViewHolder, int position) {


        Pastor pastor = this.mListPastor.get(position);
        pastorViewHolder.bindData(pastor, this.mOnListClickInteractionListener);

    }

    @Override
    public int getItemCount() {
        return this.mListPastor.size();
    }
}

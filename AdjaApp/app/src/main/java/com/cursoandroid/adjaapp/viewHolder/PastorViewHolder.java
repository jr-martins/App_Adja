package com.cursoandroid.adjaapp.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.adjaapp.R;
import com.cursoandroid.adjaapp.entities.Pastor;
import com.cursoandroid.adjaapp.listener.OnListClickInteractionListener;

public class PastorViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImgPastorPictures;
    private TextView mTextPastorNome;
   private TextView mTextHistoria;
    private TextView mTextViewDetails;

    private TextView mTextModel;


    public PastorViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mImgPastorPictures = itemView.findViewById(R.id.img_pastor);

        this.mTextPastorNome = itemView.findViewById(R.id.text_name_pastor);

        this.mTextViewDetails = itemView.findViewById(R.id.text_view_details);
        this.mTextHistoria = itemView.findViewById(R.id.text_name_historia);
    }

    public void bindData(final Pastor pastor, final OnListClickInteractionListener listener){

        this.mImgPastorPictures.setImageDrawable(pastor.picture);
        this.mTextPastorNome.setText(pastor.nome);
        this.mTextHistoria.setText(pastor.historia);





        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClick(pastor.id);
            }
        });
    }
}

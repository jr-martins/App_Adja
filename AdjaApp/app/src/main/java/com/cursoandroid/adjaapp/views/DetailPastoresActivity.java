package com.cursoandroid.adjaapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cursoandroid.adjaapp.R;
import com.cursoandroid.adjaapp.contants.PastorContants;
import com.cursoandroid.adjaapp.data.PastorMock;
import com.cursoandroid.adjaapp.entities.Pastor;

public class DetailPastoresActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    private PastorMock mPastorMock;
    private Pastor mPastor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pastores);

        this.mPastorMock = new PastorMock(this);

        this.mViewHolder.textName = this.findViewById(R.id.text_name);
        this.mViewHolder.textHistoria = this.findViewById(R.id.text_historia);


        this.getDataFromActivity();
        this.setData();
    }

    private void setData() {

        this.mViewHolder.textName.setText(this.mPastor.nome);
        this.mViewHolder.textHistoria.setText(this.mPastor.historia);


    }

    private void getDataFromActivity() {

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            this.mPastor = this.mPastorMock.get(extras.getInt(PastorContants.PASTOR_ID));
        }
    }

    private static class ViewHolder{

        TextView textName;
        TextView textHistoria;

    }
}

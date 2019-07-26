package com.cursoandroid.adjaapp.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cursoandroid.adjaapp.R;
import com.cursoandroid.adjaapp.adapter.PastorListAdapter;
import com.cursoandroid.adjaapp.contants.PastorContants;
import com.cursoandroid.adjaapp.data.PastorMock;
import com.cursoandroid.adjaapp.entities.Pastor;
import com.cursoandroid.adjaapp.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class PastoresActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastores);

        this.mContext = this;

        PastorMock pastorMock = new PastorMock(this);
        List<Pastor> pastorList = new ArrayList<>();
        pastorList.addAll(pastorMock.getList());

        //1 - Obter a recyclerView
        this.mViewHolder.recyclerPastor = this.findViewById(R.id.recycler_pastores);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void OnClick(int id) {

                Bundle bundle = new Bundle();
                bundle.putInt(PastorContants.PASTOR_ID, id);

                Intent intent = new Intent(mContext, DetailPastoresActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        };

        //2 - Definição Adapter

        PastorListAdapter pastorListAdapter = new PastorListAdapter(pastorList, listener);
        this.mViewHolder.recyclerPastor.setAdapter(pastorListAdapter);

        // Definir um layout

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerPastor.setLayoutManager(linearLayoutManager);



    }

    private static class ViewHolder {

        RecyclerView recyclerPastor;
    }
}

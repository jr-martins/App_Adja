package com.cursoandroid.adjaapp.data;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import com.cursoandroid.adjaapp.R;
import com.cursoandroid.adjaapp.entities.Pastor;

import java.util.ArrayList;
import java.util.List;

public class PastorMock {

    private List<Pastor> mListPastor;

    public PastorMock(Activity activity) {
        this.mListPastor = getPastorMockList(activity);

    }

    public List<Pastor> getList(){

        return this.mListPastor;
    }

    public Pastor get(int id){

        return this.mListPastor.get(id);
    }

    public List<Pastor> getPastorMockList(Activity activity){

        List<Pastor> mMockList = new ArrayList<>();



        int id = 0;

        Pastor toninho = new Pastor(id,"Antônio", "Historiaaaaaaaaaaaaaa", ContextCompat.getDrawable(activity, R.drawable.antonio_lisboa));
        mMockList.add(toninho);

        Pastor claudio = new Pastor(++id,"Pastor Claudio Gonçalves de Lisboa", "", ContextCompat.getDrawable(activity, R.drawable.pastor_claudio));
        mMockList.add(claudio);

        Pastor herone = new Pastor(++id,"Pastor Herone Pereira Meleti","",  ContextCompat.getDrawable(activity, R.drawable.herone_meleti));
        mMockList.add(herone);

        Pastor moises = new Pastor(++id,"Pastor Moises Silva da Fonseca","", ContextCompat.getDrawable(activity, R.drawable.moises_fonseca));
        mMockList.add(moises);

        return mMockList;

    }
}

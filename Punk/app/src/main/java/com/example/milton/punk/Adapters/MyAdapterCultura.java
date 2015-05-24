package com.example.milton.punk.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.milton.punk.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milton on 24/05/2015.
 */
public class MyAdapterCultura extends BaseAdapter {

    String[][] itensCultura = new String[][]{
            {"C. Cultural São Francisco", "Pc São Francisco-Centro, João Pessoa", "(83) 3218-4505"},
            {"Teatro Santa Roza","Pc Pedro Américo-Centro, João Pessoa","(83) 3218-4384"},
            {""}
    };
    int[] imagens = new int[]{
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_praias
    };

    private Context context;
    List<Cultura> culturaList = new ArrayList<Cultura>();

    public MyAdapterCultura(Context context) {
        this.context = context;
        //itensCultura = context.getResources().getStringArray(R.array.itensCultura);
        Cultura cultura = new Cultura();
        for (int i=0; i<imagens.length; i++){
            cultura.setImagem(imagens[i]);
            cultura.setNome(itensCultura[i][0]);
            cultura.setLocal(itensCultura[i][1]);
            cultura.setFone(itensCultura[i][2]);

            culturaList.add(cultura);
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

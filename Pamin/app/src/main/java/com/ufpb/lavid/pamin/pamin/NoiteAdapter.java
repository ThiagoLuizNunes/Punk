package com.ufpb.lavid.pamin.pamin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Milton on 22/05/2015.
 */
public class NoiteAdapter extends BaseAdapter {

    private Context context;
    private List<Noite> noiteList;

    public NoiteAdapter(Context context, List<Noite> noiteList){
        this.context = context;
        this.noiteList = noiteList;
    }
    @Override
    public int getCount() {
        return noiteList.size();
    }

    @Override
    public Object getItem(int position) {
        return noiteList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Recupera o estado da posição atual
        Noite noite = noiteList.get(position);

        // Cria uma instância do layout XML para os objetos correspondentes
        // na View
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fragment_item_list, null);

        //Imagem Noite
        ImageView imageNoite = (ImageView) view.findViewById(R.id.image_noite);
        imageNoite.setImageResource(noite.getImagem());

        //Imagem Local
        ImageView iconLocal = (ImageView) view.findViewById(R.id.image_noite_local);
        //iconLocal.setImageResource(noite.getImagem()); // trocar imagem

        //Imagem Fone
        ImageView iconFone = (ImageView) view.findViewById(R.id.image_noite_fone);
        //iconFone.setImageResource(noite.getImagem()); // trocar imagem

        //Texto Nome
        TextView textNome = (TextView) view.findViewById(R.id.text_noite_nome);
        textNome.setText(noite.getNome());

        //Texto Local
        TextView textLocal = (TextView) view.findViewById(R.id.text_noite_local);
        textLocal.setText(noite.getLocal());

        //Texto Fone
        TextView textFone = (TextView) view.findViewById(R.id.text_noite_fone);
        textFone.setText(noite.getFone());

        return view;
    }
}


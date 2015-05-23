package com.example.milton.punk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Milton on 23/05/2015.
 */
public class MyAdapterMenu extends BaseAdapter{

    private Context context;
    String[] itensMenu;

    int[] imagens = new int[]{
            R.drawable.icon_lazer,
            R.drawable.icon_praias,
            R.drawable.icon_praias,
            R.drawable.icon_pontos,
            R.drawable.icon_restaurantes,
            R.drawable.icon_noite,
            R.drawable.icon_compras
    };

    public MyAdapterMenu(Context context) {
        this.context = context;
        itensMenu = context.getResources().getStringArray(R.array.itensMenu);
    }

    @Override
    public int getCount() {
        return itensMenu.length;
    }

    @Override
    public Object getItem(int position) {
        return itensMenu[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.menu_layout, parent, false);
        }
        else{
            view = convertView;
        }

        TextView textView = (TextView) view.findViewById(R.id.text_menu_list);
        textView.setText(itensMenu[position]);

        ImageView imageView = (ImageView) view.findViewById(R.id.image_menu_list);
        imageView.setImageResource(imagens[position]);

        return view;
    }
}

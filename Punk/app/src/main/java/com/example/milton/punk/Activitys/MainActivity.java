package com.example.milton.punk.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.milton.punk.Adapters.MyAdapterMenu;
import com.example.milton.punk.Fragments.NavigationDrawerFragment;
import com.example.milton.punk.Fragments.PaminFragment;
import com.example.milton.punk.Fragments.PontosFragment;
import com.example.milton.punk.R;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ListView listView;
    private ActionBarDrawerToggle drawerListener;
    private MyAdapterMenu myAdapterMenu;

    FragmentManager fm = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FRAGMENTS<<<<<<<<<<<<<<<<<<<<<<<<
        if(savedInstanceState == null){
            PaminFragment fragment1 = new PaminFragment();

            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.layout_main, fragment1);
            ft.commit();
        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>LISTVIEW-ADAPTER<<<<<<<<<<<<<<<<<<
        listView = (ListView) findViewById(R.id.myListView);
        myAdapterMenu = new MyAdapterMenu(this);
        listView.setAdapter(myAdapterMenu);
        listView.setOnItemClickListener(this);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DRAWER-LAYOUT<<<<<<<<<<<<<<<<<<<<<<<
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.setDrawerListener(drawerListener);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TOOL-BAR<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pamin");

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);

        drawerFragment.setUp(R.id.navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectitem(position);

        switch (position){
            case 0:
                setTitle("Pamin");
                PaminFragment fragment0 = new PaminFragment();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout_main, fragment0, "fragment0");
                ft.commit();
                break;
            case 1:
                setTitle("ToParty");
                break;
            case 2:
                /*setTitle("Praias");
                PraiasFragment fragment1 = new PraiasFragment();
                ft = fm.beginTransaction();
                ft.replace(R.id.layout_main, fragment1, "fragment1");
                ft.commit();*/
                Intent intent = new Intent(this, PraiasActivity.class);
                startActivity(intent);
                break;
            case 3:
                setTitle("Pontos Turisticos");
                PontosFragment fragment2 = new PontosFragment();
                ft = fm.beginTransaction();
                ft.replace(R.id.layout_main, fragment2, "fragment2");
                ft.commit();
                break;
            case 4:
                setTitle("Cultura");
                break;
            case 5:
                setTitle("Restaurantes");
                break;
            case 6:
                setTitle("Noite");
                break;
        }

  }

    public void selectitem(int position) {
        listView.setItemChecked(position, true);
    }
    public void setTitle(String title){
        getSupportActionBar().setTitle(title);
    }
}


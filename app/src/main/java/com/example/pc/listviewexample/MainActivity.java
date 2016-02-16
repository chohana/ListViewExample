package com.example.pc.listviewexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setDataInit();

        listView = (ListView)findViewById(R.id.listview);
        ListViewAdapter adapter = new ListViewAdapter(this, setDataInit());
        listView.setAdapter(adapter);

    }

    public List<String> setDataInit(){
        List<String> titleList;
        titleList = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            titleList.add("하나 천재"+ i);
        }
        return titleList;
    }

}

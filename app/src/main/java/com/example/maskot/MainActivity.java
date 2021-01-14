package com.example.maskot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMaskot;
    private ArrayList<Maskot> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMaskot = findViewById(R.id.rv_maskot);
        rvMaskot.setHasFixedSize(true);

        list.addAll(MaskotData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMaskot.setLayoutManager(new LinearLayoutManager(this));
        ListMaskotAdapter listMaskotAdapter = new ListMaskotAdapter(list, this);
        rvMaskot.setAdapter(listMaskotAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public void Move(MenuItem item){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
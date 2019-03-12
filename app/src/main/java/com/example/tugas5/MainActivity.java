package com.example.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<TeamModel> listTeam = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rvh);
        rv.setHasFixedSize(true);
        listTeam.addAll(TeamData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        TeamAdapter ta = new TeamAdapter(this);
        ta.setTm(listTeam);
        rv.setAdapter(ta);
    }
}

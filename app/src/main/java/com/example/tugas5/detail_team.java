package com.example.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_team extends AppCompatActivity {
    private ImageView teamlogo;
    private TextView teamname,teamdetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        teamlogo = findViewById(R.id.desc_logo);
        teamname = findViewById(R.id.desc_name);
        teamdetail = findViewById(R.id.desc_desc);

        String name = getIntent().getStringExtra("Team_name");
        String detail = getIntent().getStringExtra("Team_Desc");
        int tumb = getIntent().getIntExtra("Team_Logo",0);

        teamlogo.setImageResource(tumb);
        teamname.setText(name);
        teamdetail.setText(detail);
    }
}

package com.example.tugas5;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TeamModel> tm;


    public TeamAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_team,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Glide.with(context).load(getTm().get(i).getTeam_logo()).into(viewHolder.ivTeam_Logo);
        viewHolder.tvTeam_Name.setText(getTm().get(i).getTeam_name());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(context,detail_team.class);
                move.putExtra("Team_Name",tm.get(i).getTeam_name());
                move.putExtra("Team_Logo",tm.get(i).getTeam_logo());
                move.putExtra("Team_Desc",tm.get(i).getTeam_desc());
                context.startActivities(new Intent[]{move});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getTm().size();
    }

    public ArrayList<TeamModel> getTm() {
        return tm;
    }

    public void setTm(ArrayList<TeamModel> tm) {
        this.tm = tm;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivTeam_Logo;
        private TextView tvTeam_Name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivTeam_Logo = itemView.findViewById(R.id.team_logo);
            tvTeam_Name = itemView.findViewById(R.id.team_name);
        }
    }
}

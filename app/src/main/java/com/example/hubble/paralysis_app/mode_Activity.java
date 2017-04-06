package com.example.hubble.paralysis_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class mode_Activity extends AppCompatActivity {

    private RecyclerView recyclerviwe;
    private LinearLayoutManager recyclerviwemanager;
    private Recyeviwe_adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_);
        recyclerviwe = (RecyclerView)findViewById(R.id.rec);
        recyclerviwe = (RecyclerView)findViewById(R.id.rec);
        recyclerviwe.setHasFixedSize(true);

        recyclerviwemanager = new LinearLayoutManager(this);
        recyclerviwe.setLayoutManager(recyclerviwemanager);
        madapter = new Recyeviwe_adapter();
        recyclerviwe.setAdapter(madapter);
    }
    public void getaction(int a){
        switch ( a){
            case 0
                    :Intent i = new Intent(getApplicationContext(), _action_1.class);
                        startActivity(i);
                break;
            case 1
                    :
                break;
            case 2
                    :
                break;
            case 3
                    :
                break;
            case 4
                    :
                break;
            case 5
                    :
                break;

        }

    }
    public  class Recyeviwe_adapter extends  RecyclerView.Adapter<ViweHolder>{


        @Override
        public ViweHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,parent,false);
            return new ViweHolder(v);
        }

        @Override
        public void onBindViewHolder(ViweHolder holder, int position) {
            holder.tv_action_name.setText("ชื่อท่า" + position);
            holder.itemView.setTag(position);


        }

        @Override
        public int getItemCount() {
            return 6;
        }
    }

    public  class   ViweHolder extends RecyclerView.ViewHolder{
                TextView tv_action_name;
                ImageView imageth;
                TextView tv_action_detail;
                public ViweHolder(View itemView) {
                    super(itemView);
                    tv_action_name = (TextView) itemView.findViewById(R.id.tv_action_name);
                    tv_action_detail = (TextView) itemView.findViewById(R.id.tv_action_detail);
                    imageth = (ImageView) itemView.findViewById(R.id.imageth);

                    //ดัก onclick
                    itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int clickindex = (int) v.getTag();
                            //Toast.makeText(mode_Activity.this, "clickon row :"+ clickindex, Toast.LENGTH_SHORT).show();
                            getaction(clickindex);
                        }
                    });

                }
            }


}

package com.example.apple.gymclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.*;

public class TrainerActivity extends AppCompatActivity {

    private List<Trainer> trainerList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);

        initTrainers();
        TrainerAdapter adapter=new TrainerAdapter(TrainerActivity.this,R.layout.trainer_item,trainerList);

        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Trainer trainer=trainerList.get(i);
                Toast.makeText(TrainerActivity.this,trainer.getName()+" was picked!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initTrainers(){
        for(int i=0;i<2;i++){
            Trainer tr1=new Trainer("Wang Qifeng",R.drawable.trainer1,"Specialist in Jogging.");
            trainerList.add(tr1);
            Trainer tr2=new Trainer("Li Bohan",R.drawable.trainer2,"Specialist in sleeping.");
            trainerList.add(tr2);
            Trainer tr3=new Trainer("David Kim",R.drawable.trainer3,"5-year-experience.");
            trainerList.add(tr3);
            Trainer tr4=new Trainer("Andrew",R.drawable.trainer4,"Muscle recovery。");
            trainerList.add(tr4);
            Trainer tr5=new Trainer("Lucy",R.drawable.trainer5,"Yoga coach");
            trainerList.add(tr5);
        }
    }
}

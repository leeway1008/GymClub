package com.example.apple.gymclub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TrainerAdapter extends ArrayAdapter<Trainer> {
    private int resouceId;
    public TrainerAdapter(@NonNull Context context, int resource, @NonNull List<Trainer> objects) {
        super(context, resource, objects);
        resouceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Trainer trainer=getItem(position);

        View view;
        if(convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(resouceId, parent, false);
        }else
        {
            view=convertView;
        }
        ImageView trainerImage=(ImageView)view.findViewById(R.id.trainer_image);
        trainerImage.setImageResource(trainer.getImageId());
        TextView trainerName=(TextView)view.findViewById(R.id.trainer_name);
        trainerName.setText(trainer.getName());
        TextView trainerIntro=(TextView)view.findViewById(R.id.trainer_intro);
        trainerIntro.setText(trainer.getIntro());
        return view;
    }
}

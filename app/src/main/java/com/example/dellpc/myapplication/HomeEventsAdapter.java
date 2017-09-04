package com.example.dellpc.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL PC on 04-Sep-17.
 */

public class HomeEventsAdapter extends RecyclerView.Adapter<HomeEventsAdapter.MyViewHolder> {
    private ArrayList<Hospital> hospitalList;
    private Context ctx;
    //  private Event d;

    public HomeEventsAdapter(Context ctx, ArrayList<Hospital> hospitalList){
        this.ctx=ctx;
        this.hospitalList=hospitalList;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_row_list,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Hospital d=hospitalList.get(position);
        //Log.d("Product position",d.getImageUrl());
        holder.home_row_list_name.setText(d.getHospitalName());
        holder.home_row_list_location.setText(d.getLocation());
   //     holder.home_row_list_date.setText(d.getStartDate());
        // holder.iv.setImageBitmap(d.getBitmapImage());
        //holder.bind(d,itemClickListener);
        /*holder.tv1.setText(d.getTitle());
        holder.tv2.setText("₹"+d.getPrice());*/
        PiccasoClient.downloadImage(ctx,d.getImageUrl(),holder.eventImage);

    }


    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView home_row_list_name;
        TextView home_row_list_location;
        TextView home_row_list_date;
        public MyViewHolder(View itemView) {
            super(itemView);
            eventImage=(ImageView)itemView.findViewById(R.id.eventImage);
            home_row_list_name=(TextView)itemView.findViewById(R.id.home_row_list_name);
            home_row_list_location=(TextView)itemView.findViewById(R.id.home_row_list_location);
            home_row_list_date=(TextView)itemView.findViewById(R.id.home_row_list_date);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   /* Intent intent =new Intent(ctx,EventDetails.class);
                    // String url=d.getImageUrl();
                    Event event=eventList.get(getLayoutPosition());
                    intent.putExtra("ievent",event);
                    intent.putExtra("ieventKey",event.getEventId());
                    ctx.startActivity(intent);*/
                    Toast.makeText(ctx.getApplicationContext(),"Successfully clicked",Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}

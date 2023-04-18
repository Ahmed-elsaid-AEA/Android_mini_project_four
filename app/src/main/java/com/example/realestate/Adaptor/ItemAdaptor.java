package com.example.realestate.Adaptor;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.realestate.Activites.DetailActivity;
import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;
import com.example.realestate.databinding.ActivityMainBinding;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ItemAdaptor extends RecyclerView.Adapter<ItemAdaptor.MyviewHodler> {
    ArrayList<ItemDomain> list;
    Context context;
    DecimalFormat formatter;


    public ItemAdaptor(ArrayList<ItemDomain> list, Context context) {
        this.list = list;
        this.context = context;
        formatter = new DecimalFormat("###,###,###,###,##");
    }

    @NonNull
    @Override
    public MyviewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_viewhodler, parent, false);
        return new MyviewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHodler holder, int position) {
        holder.titleTxt.setText(list.get(position).getTitle());
        holder.addressTxt.setText(list.get(position).getAddress());
        holder.priceTxt.setText("$" + formatter.format(list.get(position).getPrice()));
        int drawableResouceid = holder.itemView.getResources().getIdentifier(list.get(position).getPic(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResouceid)
                .into(holder.pic);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("object", list.get(position));
                    context.startActivity(intent);
                } catch (Exception ex) {
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyviewHodler extends RecyclerView.ViewHolder {
        TextView titleTxt, addressTxt, priceTxt;
        ImageView pic;

        public MyviewHodler(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            addressTxt = itemView.findViewById(R.id.addressTxt);
            priceTxt = itemView.findViewById(R.id.pricetxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}

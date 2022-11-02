package com.example.nguyenhahuynh_2050531200162;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder>{

    private List<Drink> mDrinks;
    private Context mContext;

    public DrinkAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Drink> list) {
        this.mDrinks = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drink,parent,false);
        return new DrinkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        Drink drink = mDrinks.get(position);
        if (drink == null) {
            return;
        }
        holder.imgDrink.setImageResource(drink.getResourceId());
        holder.tvTitle.setText(drink.getTitle());
        holder.tvprice.setText(drink.getTvprice());
    }

    @Override
    public int getItemCount() {
        if (mDrinks != null) {
            return mDrinks.size();
        }
        return 0;
    }


    public class DrinkViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgDrink;
        private TextView tvTitle;
        private TextView tvprice;
        public DrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            imgDrink = itemView.findViewById(R.id.img_drink);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvprice = itemView.findViewById(R.id.tvprice);
        }
    }
}

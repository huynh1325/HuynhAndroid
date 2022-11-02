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

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    private List<Food> mFoods;
    private Context mContext;

    public FoodAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Food> list) {
        this.mFoods = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food drink = mFoods.get(position);
        if (drink == null) {
            return;
        }
        holder.imgFood.setImageResource(drink.getResourceId());
        holder.tvTitle.setText(drink.getTitle());
        holder.tvprice.setText(drink.getTvprice());
    }

    @Override
    public int getItemCount() {
        if (mFoods != null) {
            return mFoods.size();
        }
        return 0;
    }


    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFood;
        private TextView tvTitle;
        private TextView tvprice;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.img_food);
            tvTitle = itemView.findViewById(R.id.tv_titlefood);
            tvprice = itemView.findViewById(R.id.tvpricefood);
        }
    }
}

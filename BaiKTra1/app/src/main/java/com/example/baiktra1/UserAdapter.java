package com.example.baiktra1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private Context mContext;
    private List<User> mListUser;

    public UserAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<User> list) {
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mListUser.get(position);
        if (user == null) {
            return;
        }
        holder.imgUser.setImageResource(user.getImgCasi());
        holder.imgSao.setImageResource(user.getImgSao());
        holder.tvName.setText(user.getTvname());
        holder.tvNghedanh.setText(user.getTvnghedanh());
        holder.tvQuocgia.setText(user.getTvquocgia());
        holder.tvSao.setText(user.getTvsao());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgUser, imgSao;
        private TextView tvName, tvNghedanh, tvQuocgia, tvSao;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.imgcasi);
            imgSao = itemView.findViewById(R.id.imgsao);
            tvName = itemView.findViewById(R.id.tvtencasi);
            tvNghedanh = itemView.findViewById(R.id.tvnghedanh);
            tvQuocgia = itemView.findViewById(R.id.tvquocgia);
            tvSao = itemView.findViewById(R.id.tvsao);
        }
    }
}

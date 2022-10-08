package com.example.ktgt_taoapptonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Player> arraylist;

    public PlayerAdapter(Context context, int layout, List<Player> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        Player player = arraylist.get(i);

        TextView textView1 = view.findViewById(R.id.tvname);
        TextView textView2 = view.findViewById(R.id.tvclub);
        TextView textView3 = view.findViewById(R.id.tvct);
        ImageView imageView = view.findViewById(R.id.image);

        textView1.setText(player.getName());
        textView2.setText(player.getClub());
        textView3.setText(player.getCountry());
        imageView.setImageResource(player.getImage());

        return view;
    }
}

package com.felix.jokelist;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<JokeModel> dataList;
    private LayoutInflater layoutInflater;
    private AdapterView.OnItemClickListener mClickListener;
    private Context context;
    Adapter(ArrayList<JokeModel> data, Context context) {
        this.dataList = data;
        this.context = context;

    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup prnt, int viewType) {
        layoutInflater = LayoutInflater.from(prnt.getContext());
        View view = layoutInflater.inflate(R.layout.jokerow, prnt, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.JokeId.setText(dataList.get(position).getJokeId());
        holder.JokeText.setText(dataList.get(position).getJokeText());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {
        TextView JokeId;
        TextView JokeText;
        ViewHolder (View item){
            super(item);
            JokeId = (TextView) item.findViewById(R.id.tvJokeId);
            JokeText = (TextView) item.findViewById(R.id.tvJokeText);
        }
        //implements  View.OnClickListener
        //@Override
        //public void onClick(View v) {
        //    if(mClickListener!=null) mClickListener.onItemClick(v, getAdapterPosition());
        //}
    }



    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}



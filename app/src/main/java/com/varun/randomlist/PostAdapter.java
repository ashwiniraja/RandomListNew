package com.varun.randomlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vvvro on 2/3/2017.
 */
class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Post> mDataSet;

    public PostAdapter(Context tcontext, ArrayList<Post> posts){
        context = tcontext;
        mDataSet = posts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView1;
        public TextView textView2;
        public ViewHolder(View itemView){
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.user_name);
            textView2 = (TextView) itemView.findViewById(R.id.postDescription);
        }
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.layout_post, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).textView1.setText(mDataSet.get(position).userName);
        ((ViewHolder) holder).textView2.setText(mDataSet.get(position).desc);
    }

}
package com.example.sah.lesson_6;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


   private OnItemClickListener onItemClickListener;

    private String[] titles;



    public MyAdapter(String[] title) {
        titles = title;


    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder viewHolder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv_items.setText(titles[position]);


    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_items;


        public MyViewHolder(View itemView) {
            super(itemView);
            tv_items = (TextView) itemView.findViewById(R.id.tv_items);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener !=null){
                        onItemClickListener.OnItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }

    public void setOnItemClickListener (OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;

    }

    public interface OnItemClickListener{
        void OnItemClick (int position);

    }

}

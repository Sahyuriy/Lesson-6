package com.example.sah.lesson_6;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MyFragment extends Fragment {

    private String[] text_list = null;
    private RecyclerView rv_items;
    private int item_position = -1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text_list = getResources().getStringArray(R.array.film_title);
        rv_items = (RecyclerView)view.findViewById(R.id.rv_item);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        MyAdapter adapter = new MyAdapter(text_list);
        rv_items.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_items.setAdapter(adapter);
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                String str = String.valueOf(position);
                Intent intent = new Intent(getContext(),SecondActivity.class);
                intent.putExtra("ITEM_POSITION", str);
                startActivity(intent);
            }
        });

    }
}

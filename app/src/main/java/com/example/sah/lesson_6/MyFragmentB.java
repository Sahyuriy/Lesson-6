package com.example.sah.lesson_6;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MyFragmentB extends Fragment {

    private String[] text_list = null;
    private RecyclerView rv_items;
    private int item_position = -1;
    private TextView tv_info;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_b, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text_list = getResources().getStringArray(R.array.film_info);

        item_position = Integer.valueOf(getActivity().getIntent().getStringExtra("ITEM_POSITION"));
        tv_info = (TextView) view.findViewById(R.id.tv_det);
        tv_info.setText(getResources().getStringArray(R.array.film_info)[item_position]);
        tv_info.setMovementMethod(new ScrollingMovementMethod());
    }

}


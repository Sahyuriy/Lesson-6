package com.example.sah.lesson_6;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ImgFragment extends Fragment {

private ImageView imageView;
    private int item_position;
    private int[] photoId= {R.drawable.img1,
                            R.drawable.img2,
                            R.drawable.img3,
                            R.drawable.img4,
                            R.drawable.img5,
                            R.drawable.img6,
                            R.drawable.img7};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_img, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        item_position = Integer.valueOf(getActivity().getIntent().getStringExtra("ITEM_POSITION"));
        imageView = (ImageView) view.findViewById(R.id.img_item);
        imageView.setImageResource(photoId[item_position]);
    }


}

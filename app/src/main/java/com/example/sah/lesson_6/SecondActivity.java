package com.example.sah.lesson_6;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tab1");
        tabSpec.setContent(R.id.lin_one);
        tabSpec.setIndicator(getResources().getString(R.string.info));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab2");
        tabSpec.setContent(R.id.lin_two);
        tabSpec.setIndicator(getResources().getString(R.string.pictuares));
        tabHost.addTab(tabSpec);

    }
    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(R.anim.rotate, R.anim.rotate);
    }
}

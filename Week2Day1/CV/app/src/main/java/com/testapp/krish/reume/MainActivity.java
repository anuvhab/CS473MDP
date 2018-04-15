package com.testapp.krish.reume;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar maintoolbar;
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maintoolbar = (Toolbar) findViewById(R.id.toolbar);

        maintoolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(maintoolbar);

        viewPager =(ViewPager) findViewById(R.id.viewPager);

        pagerAdapter = new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }
}

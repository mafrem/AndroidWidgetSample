package com.example.hordesk.myapplication.SwipeActionBar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hordesk.myapplication.R;

public class SwipeActionBarActivity  extends AppCompatActivity {

    private SwipeTabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_activity);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        adapter = new SwipeTabAdapter(getSupportFragmentManager());
        adapter.addFragment(new SwipeFragment(), "Tab 1");
        adapter.addFragment(new SwipeFragment(), "Tab 2");
        adapter.addFragment(new SwipeFragment(), "Tab 3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
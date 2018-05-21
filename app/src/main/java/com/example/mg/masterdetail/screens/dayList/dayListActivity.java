package com.example.mg.masterdetail.screens.dayList;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.WeatherApplication;
import com.squareup.leakcanary.RefWatcher;

import butterknife.BindView;
import butterknife.ButterKnife;

public class dayListActivity extends AppCompatActivity {
    @BindView(R.id.fragment_master_day)
    FrameLayout fragmentMasterDay;
    WeatherFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_list);
        ButterKnife.bind(this);

        assert fragmentMasterDay != null;
        FragmentManager fm = getSupportFragmentManager();
        myFragment = (WeatherFragment) fm.findFragmentByTag(WeatherFragment.class.getName());

        if (savedInstanceState == null) {
            if (myFragment == null) {
                myFragment = new WeatherFragment();
                fm.beginTransaction()
                        .add(fragmentMasterDay.getId(), myFragment, WeatherFragment.class.getName())
                        .commit();
            }
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = WeatherApplication.getRefWatcher(getBaseContext());
        refWatcher.watch(this);
    }

}

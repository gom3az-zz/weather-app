package com.example.mg.masterdetail.screens.dayList;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.WeatherApplication;
import com.squareup.leakcanary.RefWatcher;

import butterknife.BindView;
import butterknife.ButterKnife;

public class dayListActivity extends AppCompatActivity implements WeatherFragment.FragmentAction {
    @BindView(R.id.fragment_master_day)
    FrameLayout fragmentMasterDay;
    WeatherFragment mFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_list);
        ButterKnife.bind(this);

        assert fragmentMasterDay != null;
        if (savedInstanceState != null) {
            // The fragment manager will handle restoring them if we are being
            // restored from a saved state
        }
        // If this is the first creation of the activity, add fragments to it
        else {
            mFragment = new WeatherFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(fragmentMasterDay.getId(), mFragment, WeatherFragment.class.getName());
            ft.commit();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = WeatherApplication.getRefWatcher(getBaseContext());
        refWatcher.watch(this);
    }

    @Override
    public void done() {
        Toast.makeText(this, "done loading", Toast.LENGTH_SHORT).show();
    }
}

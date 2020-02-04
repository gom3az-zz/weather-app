package com.example.mg.masterdetail.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mg.masterdetail.R
import com.example.mg.masterdetail.WeatherApplication

class DayListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_list)

    }

    override fun onDestroy() {
        super.onDestroy()
        val refWatcher = WeatherApplication.getRefWatcher(baseContext)
        refWatcher?.watch(this)
    }
}
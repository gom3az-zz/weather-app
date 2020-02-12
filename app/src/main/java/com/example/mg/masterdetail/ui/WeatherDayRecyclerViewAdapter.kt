package com.example.mg.masterdetail.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.mg.masterdetail.R
import com.example.mg.masterdetail.data.model.WeatherDaysModel
import kotlinx.android.synthetic.main.day_list_content.view.*

class WeatherDayRecyclerViewAdapter(
        private val mGlide: RequestManager,
        private var mValues: List<WeatherDaysModel.Data>
) : RecyclerView.Adapter<WeatherDayRecyclerViewAdapter.ViewHolder>() {

    fun setData(values: List<WeatherDaysModel.Data>) {
        mValues = values
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.day_list_content,
                        parent,
                        false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.weatherDay.text = mValues[position].valid_date

        holder.itemView.weatherDegree.text = "${mValues[position].app_max_temp} / ${mValues[position].low_temp}"

        mValues[position].weather?.let {
            mGlide.load("https://www.weatherbit.io/static/img/icons/${it.icon}.png")
                    .into(holder.itemView.weatherIc)
        }

    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
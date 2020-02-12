package com.example.mg.masterdetail.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import com.bumptech.glide.RequestManager
import com.example.mg.masterdetail.R
import com.example.mg.masterdetail.data.Result
import com.example.mg.masterdetail.data.model.WeatherModel
import kotlinx.android.synthetic.main.day_list.*
import kotlinx.android.synthetic.main.fragment_weather.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.*

class WeatherFragment : Fragment() {
    private val glide: RequestManager by inject()

    private val viewModel: DayListViewModel by viewModel()

    private val adapter: WeatherDayRecyclerViewAdapter by lazy {
        WeatherDayRecyclerViewAdapter(glide, ArrayList())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(
                recyclerView.context,
                DividerItemDecoration.HORIZONTAL))

        viewModel.weatherObserver.observe(viewLifecycleOwner, Observer {
            hideLoading()
            it?.data?.let { list ->
                init(list[0])
            }
        })

        viewModel.weatherDaysObserver.observe(viewLifecycleOwner, Observer {
            hideLoading()
            it?.data?.let { list ->
                adapter.setData(list)
            }
        })

        viewModel.errorObserver.observe(viewLifecycleOwner, Observer {
            hideLoading()
            when (it) {
                Result.Error.ServerError(null) -> Toast.makeText(requireContext(), "error in server", LENGTH_SHORT).show()
                Result.Error.InvalidUser -> TODO()
                Result.Error.NetworkError -> showNoInternet()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recyclerView.adapter = null
    }


    @SuppressLint("SetTextI18n")
    private fun init(data: WeatherModel.Data) {
        textCityName.text = data.city_name
        textWeatherTemp.text = data.temp.toString()
        textWind.text = "wind speed\n${data.wind_spd} kph"
        textHumidity.text = "humidity\n${data.rh}"

        data.weather?.let {
            textCondition.text = "condition\n${it.description}"
            glide.load("https://www.weatherbit.io/static/img/icons/${it.icon}.png")
                    .into(imageWeatherCondition!!)
        }
    }

    private fun showNoInternet() {
        textNoInternet.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        progressCircular.visibility = View.GONE
    }
}
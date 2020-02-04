package com.example.mg.masterdetail.data.model

import android.os.Parcel
import android.os.Parcelable

data class WeatherModel(var count: Double,
                        var data: List<Data>?) : Parcelable {


    constructor(parcel: Parcel) : this(
            parcel.readDouble(),
            parcel.createTypedArrayList(Data)) {
    }

    data class Data(var rh: Double = 0.0,
                    var pod: String? = null,
                    var lon: Double = 0.0,
                    var pres: Double = 0.0,
                    var timezone: String? = null,
                    var ob_time: String? = null,
                    var country_code: String? = null,
                    var clouds: Double = 0.0,
                    var ts: Double = 0.0,
                    var solar_rad: Double,
                    var state_code: String? = null,
                    var city_name: String? = null,
                    var wind_spd: Double = 0.0,
                    var last_ob_time: String? = null,
                    var wind_cdir_full: String? = null,
                    var wind_cdir: String? = null,
                    var slp: Double = 0.0,
                    var vis: Double = 0.0,
                    var h_angle: Double = 0.0,
                    var sunset: String? = null,
                    var dni: Double = 0.0,
                    var dewpt: Double = 0.0,
                    var snow: Double = 0.0,
                    var uv: Double = 0.0,
                    var precip: Double = 0.0,
                    var wind_dir: Double = 0.0,
                    var sunrise: String? = null,
                    var ghi: Double = 0.0,
                    var dhi: Double = 0.0,
                    var aqi: Double = 0.0,
                    var lat: Double = 0.0,
                    var weather: Weather? = null,
                    var datetime: String? = null,
                    var temp: Double = 0.0,
                    var station: String? = null,
                    var elev_angle: Double = 0.0,
                    var app_temp: Double = 0.0) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readDouble(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readParcelable(Weather::class.java.classLoader),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble()) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeDouble(rh)
            parcel.writeString(pod)
            parcel.writeDouble(lon)
            parcel.writeDouble(pres)
            parcel.writeString(timezone)
            parcel.writeString(ob_time)
            parcel.writeString(country_code)
            parcel.writeDouble(clouds)
            parcel.writeDouble(ts)
            parcel.writeDouble(solar_rad)
            parcel.writeString(state_code)
            parcel.writeString(city_name)
            parcel.writeDouble(wind_spd)
            parcel.writeString(last_ob_time)
            parcel.writeString(wind_cdir_full)
            parcel.writeString(wind_cdir)
            parcel.writeDouble(slp)
            parcel.writeDouble(vis)
            parcel.writeDouble(h_angle)
            parcel.writeString(sunset)
            parcel.writeDouble(dni)
            parcel.writeDouble(dewpt)
            parcel.writeDouble(snow)
            parcel.writeDouble(uv)
            parcel.writeDouble(precip)
            parcel.writeDouble(wind_dir)
            parcel.writeString(sunrise)
            parcel.writeDouble(ghi)
            parcel.writeDouble(dhi)
            parcel.writeDouble(aqi)
            parcel.writeDouble(lat)
            parcel.writeParcelable(weather, flags)
            parcel.writeString(datetime)
            parcel.writeDouble(temp)
            parcel.writeString(station)
            parcel.writeDouble(elev_angle)
            parcel.writeDouble(app_temp)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Data> {
            override fun createFromParcel(parcel: Parcel): Data {
                return Data(parcel)
            }

            override fun newArray(size: Int): Array<Data?> {
                return arrayOfNulls(size)
            }
        }

    }

    data class Weather(var icon: String? = null,
                       var code: String? = null,
                       var description: String? = null) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readString(),
                parcel.readString(),
                parcel.readString()) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(icon)
            parcel.writeString(code)
            parcel.writeString(description)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Weather> {
            override fun createFromParcel(parcel: Parcel): Weather {
                return Weather(parcel)
            }

            override fun newArray(size: Int): Array<Weather?> {
                return arrayOfNulls(size)
            }
        }

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(count)
        parcel.writeTypedList(data)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<WeatherModel> {
        override fun createFromParcel(parcel: Parcel): WeatherModel {
            return WeatherModel(parcel)
        }

        override fun newArray(size: Int): Array<WeatherModel?> {
            return arrayOfNulls(size)
        }
    }

}

package com.example.mg.masterdetail.data.model

import android.os.Parcel
import android.os.Parcelable

data class WeatherDaysModel(var city_name: String? = null,
                            var lon: String? = null,
                            var timezone: String? = null,
                            var lat: String? = null,
                            var country_code: String? = null,
                            var state_code: String? = null,
                            var data: List<Data>?) : Parcelable {


    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.createTypedArrayList(Data))

    data class Data(var moonrise_ts: Int = 0,
                    var wind_cdir: String? = null,
                    var rh: Int = 0,
                    var pres: Double = 0.0,
                    var high_temp: Double = 0.0,
                    var sunset_ts: Int = 0,
                    var ozone: Double = 0.0,
                    var moon_phase: Double = 0.0,
                    var wind_gust_spd: Double = 0.0,
                    var snow_depth: Int = 0,
                    var clouds: Int = 0,
                    var ts: Int = 0,
                    var sunrise_ts: Int = 0,
                    var app_min_temp: Double = 0.0,
                    var wind_spd: Double = 0.0,
                    var pop: Int = 0,
                    var wind_cdir_full: String? = null,
                    var slp: Double = 0.0,
                    var valid_date: String? = null,
                    var app_max_temp: Double = 0.0,
                    var vis: Double = 0.0,
                    var dewpt: Double = 0.0,
                    var snow: Int = 0,
                    var uv: Double = 0.0,
                    var weather: WeatherModel.Weather? = null,
                    var wind_dir: Int = 0,
                    var clouds_hi: Int = 0,
                    var precip: Double = 0.0,
                    var low_temp: Double = 0.0,
                    var max_temp: Double = 0.0,
                    var moonset_ts: Int = 0,
                    var datetime: String? = null,
                    var temp: Double = 0.0,
                    var min_temp: Double = 0.0,
                    var clouds_mid: Int = 0,
                    var clouds_low: Int = 0) : Parcelable {
        /**
         * moonrise_ts : 1578425923
         * wind_cdir : SW
         * rh : 85
         * pres : 1006.12
         * high_temp : 10.8
         * sunset_ts : 1578435305
         * ozone : 298.007
         * moon_phase : 0.977702
         * wind_gust_spd : 15.8
         * snow_depth : 0
         * clouds : 43
         * ts : 1578373260
         * sunrise_ts : 1578399495
         * app_min_temp : -4.7
         * wind_spd : 3.34427
         * pop : 65
         * wind_cdir_full : southwest
         * slp : 1016.58
         * valid_date : 2020-01-07
         * app_max_temp : 10.8
         * vis : 17.0182
         * dewpt : 2.5
         * snow : 0
         * uv : 2.31698
         * weather : {"icon":"c03d","code":803,"description":"Broken clouds"}
         * wind_dir : 214
         * clouds_hi : 8
         * precip : 1.8125
         * low_temp : 3.1
         * max_temp : 10.8
         * moonset_ts : 1578395408
         * datetime : 2020-01-07
         * temp : 4.9
         * min_temp : 0.1
         * clouds_mid : 16
         * clouds_low : 38
         */
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readString(),
                parcel.readInt(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readInt(),
                parcel.readInt(),
                parcel.readInt(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readDouble(),
                parcel.readParcelable(WeatherModel.Weather::class.java.classLoader),
                parcel.readInt(),
                parcel.readInt(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readString(),
                parcel.readDouble(),
                parcel.readDouble(),
                parcel.readInt(),
                parcel.readInt())

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(moonrise_ts)
            parcel.writeString(wind_cdir)
            parcel.writeInt(rh)
            parcel.writeDouble(pres)
            parcel.writeDouble(high_temp)
            parcel.writeInt(sunset_ts)
            parcel.writeDouble(ozone)
            parcel.writeDouble(moon_phase)
            parcel.writeDouble(wind_gust_spd)
            parcel.writeInt(snow_depth)
            parcel.writeInt(clouds)
            parcel.writeInt(ts)
            parcel.writeInt(sunrise_ts)
            parcel.writeDouble(app_min_temp)
            parcel.writeDouble(wind_spd)
            parcel.writeInt(pop)
            parcel.writeString(wind_cdir_full)
            parcel.writeDouble(slp)
            parcel.writeString(valid_date)
            parcel.writeDouble(app_max_temp)
            parcel.writeDouble(vis)
            parcel.writeDouble(dewpt)
            parcel.writeInt(snow)
            parcel.writeDouble(uv)
            parcel.writeParcelable(weather, flags)
            parcel.writeInt(wind_dir)
            parcel.writeInt(clouds_hi)
            parcel.writeDouble(precip)
            parcel.writeDouble(low_temp)
            parcel.writeDouble(max_temp)
            parcel.writeInt(moonset_ts)
            parcel.writeString(datetime)
            parcel.writeDouble(temp)
            parcel.writeDouble(min_temp)
            parcel.writeInt(clouds_mid)
            parcel.writeInt(clouds_low)
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

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(city_name)
        parcel.writeString(lon)
        parcel.writeString(timezone)
        parcel.writeString(lat)
        parcel.writeString(country_code)
        parcel.writeString(state_code)
        parcel.writeTypedList(data)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<WeatherDaysModel> {
        override fun createFromParcel(parcel: Parcel): WeatherDaysModel {
            return WeatherDaysModel(parcel)
        }

        override fun newArray(size: Int): Array<WeatherDaysModel?> {
            return arrayOfNulls(size)
        }
    }
}
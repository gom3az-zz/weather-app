package com.example.mg.masterdetail.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

import java.io.Serializable;

public class WeatherModel implements Serializable {


    /**
     * response : {"version":"0.1","termsofService":"http://www.wunderground.com/weather/api/d/terms.html","features":{"conditions":1}}
     * current_observation : {"image":{"url":"http://icons.wxug.com/graphics/wu2/logo_130x80.png","title":"Weather Underground","link":"http://www.wunderground.com"},"display_location":{"full":"Cairo, Egypt","CITY":"Cairo","state":"KB","state_name":"Egypt","COUNTRY":"EG","country_iso3166":"EG","zip":"00000","magic":"1","wmo":"62375","latitude":"30.05999947","longitude":"31.25000000","elevation":"60.0"},"observation_location":{"full":"Cairo, ","CITY":"Cairo","state":"","COUNTRY":"EG","country_iso3166":"EG","latitude":"30.04","longitude":"31.24","elevation":"157 ft"},"estimated":{},"station_id":"ICAIRO11","observation_time":"Last Updated on May 12, 6:33 PM EET","observation_time_rfc822":"Sat, 12 May 2018 18:33:38 +0200","observation_epoch":"1526142818","local_time_rfc822":"Sat, 12 May 2018 18:33:57 +0200","local_epoch":"1526142837","local_tz_short":"EET","local_tz_long":"Africa/Cairo","local_tz_offset":"+0200","weather":"Mostly Cloudy","temperature_string":"79.2 F (26.2 C)","temp_f":79.2,"temp_c":26.2,"relative_humidity":"48%","wind_string":"From the North at 3.2 MPH","wind_dir":"North","wind_degrees":360,"wind_mph":3.2,"wind_gust_mph":0,"wind_kph":5.1,"wind_gust_kph":0,"pressure_mb":"1010","pressure_in":"29.83","pressure_trend":"0","dewpoint_string":"58 F (14 C)","dewpoint_f":58,"dewpoint_c":14,"heat_index_string":"NA","heat_index_f":"NA","heat_index_c":"NA","windchill_string":"NA","windchill_f":"NA","windchill_c":"NA","feelslike_string":"79.2 F (27 C)","feelslike_f":"79.2","feelslike_c":"27","visibility_mi":"6.2","visibility_km":"10.0","solarradiation":"--","UV":"0","precip_1hr_string":"-999.00 in ( 0 mm)","precip_1hr_in":"-999.00","precip_1hr_metric":" 0","precip_today_string":"0.00 in (0 mm)","precip_today_in":"0.00","precip_today_metric":"0","icon":"mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/mostlycloudy.gif","forecast_url":"http://www.wunderground.com/global/stations/62375.html","history_url":"http://www.wunderground.com/weatherstation/WXDailyHistory.asp?ID=ICAIRO11","ob_url":"http://www.wunderground.com/cgi-bin/findweather/getForecast?query=30.035122,31.237038","nowcast":""}
     */

    private ResponseBean response;
    private CurrentObservationBean current_observation;

    public static WeatherModel objectFromData(String str) {

        return new Gson().fromJson(str, WeatherModel.class);
    }

    public ResponseBean getResponse() {
        return response;
    }


    public CurrentObservationBean getCurrent_observation() {
        return current_observation;
    }


    public static class ResponseBean implements Serializable {
        /**
         * version : 0.1
         * termsofService : http://www.wunderground.com/weather/api/d/terms.html
         * features : {"conditions":1}
         */

        private String version;
        private String termsofService;
        private FeaturesBean features;

        public static ResponseBean objectFromData(String str) {

            return new Gson().fromJson(str, ResponseBean.class);
        }

        public String getVersion() {
            return version;
        }

        public String getTermsofService() {
            return termsofService;
        }

        public FeaturesBean getFeatures() {
            return features;
        }


        public static class FeaturesBean {

            private int conditions;

            public static FeaturesBean objectFromData(String str) {

                return new Gson().fromJson(str, FeaturesBean.class);
            }

            public int getConditions() {
                return conditions;
            }

        }
    }

    public static class CurrentObservationBean implements Parcelable {

        private ImageBean image;
        private DisplayLocationBean display_location;
        private ObservationLocationBean observation_location;
        private EstimatedBean estimated;
        private String station_id;
        private String observation_time;
        private String observation_time_rfc822;
        private String observation_epoch;
        private String local_time_rfc822;
        private String local_epoch;
        private String local_tz_short;
        private String local_tz_long;
        private String local_tz_offset;
        private String weather;
        private String temperature_string;
        private double temp_f;
        private double temp_c;
        private String relative_humidity;
        private String wind_string;
        private String wind_dir;
        private int wind_degrees;
        private double wind_mph;
        private String wind_gust_mph;
        private double wind_kph;
        private String wind_gust_kph;
        private String pressure_mb;
        private String pressure_in;
        private String pressure_trend;
        private String dewpoint_string;
        private int dewpoint_f;
        private int dewpoint_c;
        private String heat_index_string;
        private String heat_index_f;
        private String heat_index_c;
        private String windchill_string;
        private String windchill_f;
        private String windchill_c;
        private String feelslike_string;
        private String feelslike_f;
        private String feelslike_c;
        private String visibility_mi;
        private String visibility_km;
        private String solarradiation;
        private String UV;
        private String precip_1hr_string;
        private String precip_1hr_in;
        private String precip_1hr_metric;
        private String precip_today_string;
        private String precip_today_in;
        private String precip_today_metric;
        private String icon;
        private String icon_url;
        private String forecast_url;
        private String history_url;
        private String ob_url;
        private String nowcast;

        public static CurrentObservationBean objectFromData(String str) {

            return new Gson().fromJson(str, CurrentObservationBean.class);
        }

        public ImageBean getImage() {
            return image;
        }


        public DisplayLocationBean getDisplay_location() {
            return display_location;
        }


        public ObservationLocationBean getObservation_location() {
            return observation_location;
        }


        public EstimatedBean getEstimated() {
            return estimated;
        }


        public String getStation_id() {
            return station_id;
        }


        public String getObservation_time() {
            return observation_time;
        }


        public String getObservation_time_rfc822() {
            return observation_time_rfc822;
        }


        public String getObservation_epoch() {
            return observation_epoch;
        }


        public String getLocal_time_rfc822() {
            return local_time_rfc822;
        }

        public String getLocal_epoch() {
            return local_epoch;
        }


        public String getLocal_tz_short() {
            return local_tz_short;
        }


        public String getLocal_tz_long() {
            return local_tz_long;
        }


        public String getLocal_tz_offset() {
            return local_tz_offset;
        }


        public String getWeather() {
            return weather;
        }


        public String getTemperature_string() {
            return temperature_string;
        }


        public double getTemp_f() {
            return temp_f;
        }


        public double getTemp_c() {
            return temp_c;
        }


        public String getRelative_humidity() {
            return relative_humidity;
        }


        public String getWind_string() {
            return wind_string;
        }


        public String getWind_dir() {
            return wind_dir;
        }


        public int getWind_degrees() {
            return wind_degrees;
        }

        public void setWind_degrees(int wind_degrees) {
            this.wind_degrees = wind_degrees;
        }

        public double getWind_mph() {
            return wind_mph;
        }


        public String getWind_gust_mph() {
            return wind_gust_mph;
        }


        public double getWind_kph() {
            return wind_kph;
        }


        public String getWind_gust_kph() {
            return wind_gust_kph;
        }


        public String getPressure_mb() {
            return pressure_mb;
        }


        public String getPressure_in() {
            return pressure_in;
        }


        public String getPressure_trend() {
            return pressure_trend;
        }


        public String getDewpoint_string() {
            return dewpoint_string;
        }


        public int getDewpoint_f() {
            return dewpoint_f;
        }


        public int getDewpoint_c() {
            return dewpoint_c;
        }


        public String getHeat_index_string() {
            return heat_index_string;
        }


        public String getHeat_index_f() {
            return heat_index_f;
        }


        public String getHeat_index_c() {
            return heat_index_c;
        }


        public String getWindchill_string() {
            return windchill_string;
        }


        public String getWindchill_f() {
            return windchill_f;
        }


        public String getWindchill_c() {
            return windchill_c;
        }


        public String getFeelslike_string() {
            return feelslike_string;
        }


        public String getFeelslike_f() {
            return feelslike_f;
        }


        public String getFeelslike_c() {
            return feelslike_c;
        }


        public String getVisibility_mi() {
            return visibility_mi;
        }


        public String getVisibility_km() {
            return visibility_km;
        }


        public String getSolarradiation() {
            return solarradiation;
        }


        public String getUV() {
            return UV;
        }


        public String getPrecip_1hr_string() {
            return precip_1hr_string;
        }


        public String getPrecip_1hr_in() {
            return precip_1hr_in;
        }


        public String getPrecip_1hr_metric() {
            return precip_1hr_metric;
        }


        public String getPrecip_today_string() {
            return precip_today_string;
        }


        public String getPrecip_today_in() {
            return precip_today_in;
        }


        public String getPrecip_today_metric() {
            return precip_today_metric;
        }


        public String getIcon() {
            return icon;
        }


        public String getIcon_url() {
            return icon_url;
        }


        public String getForecast_url() {
            return forecast_url;
        }


        public String getHistory_url() {
            return history_url;
        }


        public String getOb_url() {
            return ob_url;
        }

        public String getNowcast() {
            return nowcast;
        }


        public static final Parcelable.Creator<CurrentObservationBean> CREATOR = new Parcelable.Creator<CurrentObservationBean>() {
            @Override
            public CurrentObservationBean createFromParcel(Parcel source) {
                return new CurrentObservationBean(source);
            }

            @Override
            public CurrentObservationBean[] newArray(int size) {
                return new CurrentObservationBean[size];
            }
        };

        public CurrentObservationBean() {
        }

        protected CurrentObservationBean(Parcel in) {
            this.image = (ImageBean) in.readSerializable();
            this.display_location = in.readParcelable(DisplayLocationBean.class.getClassLoader());
            this.observation_location = in.readParcelable(ObservationLocationBean.class.getClassLoader());
            this.estimated = in.readParcelable(EstimatedBean.class.getClassLoader());
            this.station_id = in.readString();
            this.observation_time = in.readString();
            this.observation_time_rfc822 = in.readString();
            this.observation_epoch = in.readString();
            this.local_time_rfc822 = in.readString();
            this.local_epoch = in.readString();
            this.local_tz_short = in.readString();
            this.local_tz_long = in.readString();
            this.local_tz_offset = in.readString();
            this.weather = in.readString();
            this.temperature_string = in.readString();
            this.temp_f = in.readDouble();
            this.temp_c = in.readDouble();
            this.relative_humidity = in.readString();
            this.wind_string = in.readString();
            this.wind_dir = in.readString();
            this.wind_degrees = in.readInt();
            this.wind_mph = in.readDouble();
            this.wind_gust_mph = in.readString();
            this.wind_kph = in.readDouble();
            this.wind_gust_kph = in.readString();
            this.pressure_mb = in.readString();
            this.pressure_in = in.readString();
            this.pressure_trend = in.readString();
            this.dewpoint_string = in.readString();
            this.dewpoint_f = in.readInt();
            this.dewpoint_c = in.readInt();
            this.heat_index_string = in.readString();
            this.heat_index_f = in.readString();
            this.heat_index_c = in.readString();
            this.windchill_string = in.readString();
            this.windchill_f = in.readString();
            this.windchill_c = in.readString();
            this.feelslike_string = in.readString();
            this.feelslike_f = in.readString();
            this.feelslike_c = in.readString();
            this.visibility_mi = in.readString();
            this.visibility_km = in.readString();
            this.solarradiation = in.readString();
            this.UV = in.readString();
            this.precip_1hr_string = in.readString();
            this.precip_1hr_in = in.readString();
            this.precip_1hr_metric = in.readString();
            this.precip_today_string = in.readString();
            this.precip_today_in = in.readString();
            this.precip_today_metric = in.readString();
            this.icon = in.readString();
            this.icon_url = in.readString();
            this.forecast_url = in.readString();
            this.history_url = in.readString();
            this.ob_url = in.readString();
            this.nowcast = in.readString();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeSerializable(this.image);
            dest.writeParcelable(this.display_location, flags);
            dest.writeParcelable(this.observation_location, flags);
            dest.writeParcelable(this.estimated, flags);
            dest.writeString(this.station_id);
            dest.writeString(this.observation_time);
            dest.writeString(this.observation_time_rfc822);
            dest.writeString(this.observation_epoch);
            dest.writeString(this.local_time_rfc822);
            dest.writeString(this.local_epoch);
            dest.writeString(this.local_tz_short);
            dest.writeString(this.local_tz_long);
            dest.writeString(this.local_tz_offset);
            dest.writeString(this.weather);
            dest.writeString(this.temperature_string);
            dest.writeDouble(this.temp_f);
            dest.writeDouble(this.temp_c);
            dest.writeString(this.relative_humidity);
            dest.writeString(this.wind_string);
            dest.writeString(this.wind_dir);
            dest.writeInt(this.wind_degrees);
            dest.writeDouble(this.wind_mph);
            dest.writeString(this.wind_gust_mph);
            dest.writeDouble(this.wind_kph);
            dest.writeString(this.wind_gust_kph);
            dest.writeString(this.pressure_mb);
            dest.writeString(this.pressure_in);
            dest.writeString(this.pressure_trend);
            dest.writeString(this.dewpoint_string);
            dest.writeInt(this.dewpoint_f);
            dest.writeInt(this.dewpoint_c);
            dest.writeString(this.heat_index_string);
            dest.writeString(this.heat_index_f);
            dest.writeString(this.heat_index_c);
            dest.writeString(this.windchill_string);
            dest.writeString(this.windchill_f);
            dest.writeString(this.windchill_c);
            dest.writeString(this.feelslike_string);
            dest.writeString(this.feelslike_f);
            dest.writeString(this.feelslike_c);
            dest.writeString(this.visibility_mi);
            dest.writeString(this.visibility_km);
            dest.writeString(this.solarradiation);
            dest.writeString(this.UV);
            dest.writeString(this.precip_1hr_string);
            dest.writeString(this.precip_1hr_in);
            dest.writeString(this.precip_1hr_metric);
            dest.writeString(this.precip_today_string);
            dest.writeString(this.precip_today_in);
            dest.writeString(this.precip_today_metric);
            dest.writeString(this.icon);
            dest.writeString(this.icon_url);
            dest.writeString(this.forecast_url);
            dest.writeString(this.history_url);
            dest.writeString(this.ob_url);
            dest.writeString(this.nowcast);
        }

        public static class ImageBean implements Serializable {

            private String url;
            private String title;
            private String link;

            public static ImageBean objectFromData(String str) {

                return new Gson().fromJson(str, ImageBean.class);
            }

            public String getUrl() {
                return url;
            }

            public String getTitle() {
                return title;
            }


            public String getLink() {
                return link;
            }

        }

        public static class DisplayLocationBean implements Parcelable {

            private String full;
            private String city;
            private String state;
            private String state_name;
            private String country;
            private String country_iso3166;
            private String zip;
            private String magic;
            private String wmo;
            private String latitude;
            private String longitude;
            private String elevation;

            public static final Creator<DisplayLocationBean> CREATOR = new Creator<DisplayLocationBean>() {
                @Override
                public DisplayLocationBean createFromParcel(Parcel in) {
                    return new DisplayLocationBean(in);
                }

                @Override
                public DisplayLocationBean[] newArray(int size) {
                    return new DisplayLocationBean[size];
                }
            };

            protected DisplayLocationBean(Parcel in) {
                full = in.readString();
                city = in.readString();
                state = in.readString();
                state_name = in.readString();
                country = in.readString();
                country_iso3166 = in.readString();
                zip = in.readString();
                magic = in.readString();
                wmo = in.readString();
                latitude = in.readString();
                longitude = in.readString();
                elevation = in.readString();
            }

            public static DisplayLocationBean objectFromData(String str) {

                return new Gson().fromJson(str, DisplayLocationBean.class);
            }

            public String getFull() {
                return full;
            }


            public String getCity() {
                return city;
            }


            public String getState() {
                return state;
            }


            public String getState_name() {
                return state_name;
            }


            public String getCountry() {
                return country;
            }


            public String getCountry_iso3166() {
                return country_iso3166;
            }


            public String getZip() {
                return zip;
            }


            public String getMagic() {
                return magic;
            }


            public String getWmo() {
                return wmo;
            }


            public String getLatitude() {
                return latitude;
            }


            public String getLongitude() {
                return longitude;
            }


            public String getElevation() {
                return elevation;
            }

            public void setElevation(String elevation) {
                this.elevation = elevation;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(full);
                parcel.writeString(city);
                parcel.writeString(state);
                parcel.writeString(state_name);
                parcel.writeString(country);
                parcel.writeString(country_iso3166);
                parcel.writeString(zip);
                parcel.writeString(magic);
                parcel.writeString(wmo);
                parcel.writeString(latitude);
                parcel.writeString(longitude);
                parcel.writeString(elevation);
            }
        }

        public static class ObservationLocationBean implements Parcelable {
            public static final Creator<ObservationLocationBean> CREATOR = new Creator<ObservationLocationBean>() {
                @Override
                public ObservationLocationBean createFromParcel(Parcel in) {
                    return new ObservationLocationBean(in);
                }

                @Override
                public ObservationLocationBean[] newArray(int size) {
                    return new ObservationLocationBean[size];
                }
            };

            protected ObservationLocationBean(Parcel in) {
            }

            public static ObservationLocationBean objectFromData(String str) {

                return new Gson().fromJson(str, ObservationLocationBean.class);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
            }
        }

        public static class EstimatedBean implements Parcelable {
            public static final Creator<EstimatedBean> CREATOR = new Creator<EstimatedBean>() {
                @Override
                public EstimatedBean createFromParcel(Parcel in) {
                    return new EstimatedBean(in);
                }

                @Override
                public EstimatedBean[] newArray(int size) {
                    return new EstimatedBean[size];
                }
            };

            protected EstimatedBean(Parcel in) {
            }

            public static EstimatedBean objectFromData(String str) {

                return new Gson().fromJson(str, EstimatedBean.class);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
            }
        }
    }
}

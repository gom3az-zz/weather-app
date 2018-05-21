package com.example.mg.masterdetail.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

public class Weather10daysModel implements Serializable {


    private ResponseBean response;
    private ForecastBean forecast;

    public static Weather10daysModel objectFromData(String str) {

        return new Gson().fromJson(str, Weather10daysModel.class);
    }

    public ResponseBean getResponse() {
        return response;
    }

    public ForecastBean getForecast() {
        return forecast;
    }

    public static class ResponseBean {
        /**
         * version : 0.1
         * termsofService : http://www.wunderground.com/weather/api/d/terms.html
         * features : {"forecast10day":1}
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

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTermsofService() {
            return termsofService;
        }

        public void setTermsofService(String termsofService) {
            this.termsofService = termsofService;
        }

        public FeaturesBean getFeatures() {
            return features;
        }

        public void setFeatures(FeaturesBean features) {
            this.features = features;
        }

        public static class FeaturesBean {
            /**
             * forecast10day : 1
             */

            private int forecast10day;

            public static FeaturesBean objectFromData(String str) {

                return new Gson().fromJson(str, FeaturesBean.class);
            }

            public int getForecast10day() {
                return forecast10day;
            }

            public void setForecast10day(int forecast10day) {
                this.forecast10day = forecast10day;
            }
        }
    }

    public static class ForecastBean implements Parcelable {

        private SimpleforecastBean simpleforecast;

        public static ForecastBean objectFromData(String str) {

            return new Gson().fromJson(str, ForecastBean.class);
        }


        public SimpleforecastBean getSimpleforecast() {
            return simpleforecast;
        }

        public static final Parcelable.Creator<ForecastBean> CREATOR = new Parcelable.Creator<ForecastBean>() {
            @Override
            public ForecastBean createFromParcel(Parcel source) {
                return new ForecastBean(source);
            }

            @Override
            public ForecastBean[] newArray(int size) {
                return new ForecastBean[size];
            }
        };

        public ForecastBean() {
        }

        protected ForecastBean(Parcel in) {
            this.simpleforecast = in.readParcelable(SimpleforecastBean.class.getClassLoader());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.simpleforecast, flags);
        }

        public static class SimpleforecastBean implements Parcelable {
            private List<ForecastdayBeanX> forecastday;

            public static final Creator<SimpleforecastBean> CREATOR = new Creator<SimpleforecastBean>() {
                @Override
                public SimpleforecastBean createFromParcel(Parcel in) {
                    return new SimpleforecastBean(in);
                }

                @Override
                public SimpleforecastBean[] newArray(int size) {
                    return new SimpleforecastBean[size];
                }
            };

            protected SimpleforecastBean(Parcel in) {
            }

            public static SimpleforecastBean objectFromData(String str) {

                return new Gson().fromJson(str, SimpleforecastBean.class);
            }

            public List<ForecastdayBeanX> getForecastday() {
                return forecastday;
            }

            public void setForecastday(List<ForecastdayBeanX> forecastday) {
                this.forecastday = forecastday;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
            }

            public static class ForecastdayBeanX implements Parcelable {

                private DateBean date;
                private int period;
                private HighBean high;
                private LowBean low;
                private String conditions;
                private String icon;
                private String icon_url;
                private String skyicon;
                private int pop;
                private MaxwindBean maxwind;
                private AvewindBean avewind;
                private int avehumidity;
                private int maxhumidity;
                private int minhumidity;

                public static ForecastdayBeanX objectFromData(String str) {

                    return new Gson().fromJson(str, ForecastdayBeanX.class);
                }

                public DateBean getDate() {
                    return date;
                }

                public HighBean getHigh() {
                    return high;
                }

                public LowBean getLow() {
                    return low;
                }

                public String getConditions() {
                    return conditions;
                }

                public String getIcon() {
                    return icon;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public String getSkyicon() {
                    return skyicon;
                }

                public MaxwindBean getMaxwind() {
                    return maxwind;
                }

                public AvewindBean getAvewind() {
                    return avewind;
                }

                public int getAvehumidity() {
                    return avehumidity;
                }

                public int getMaxhumidity() {
                    return maxhumidity;
                }

                public int getMinhumidity() {
                    return minhumidity;
                }

                public static final Creator<ForecastdayBeanX> CREATOR = new Creator<ForecastdayBeanX>() {
                    @Override
                    public ForecastdayBeanX createFromParcel(Parcel source) {
                        return new ForecastdayBeanX(source);
                    }

                    @Override
                    public ForecastdayBeanX[] newArray(int size) {
                        return new ForecastdayBeanX[size];
                    }
                };

                public ForecastdayBeanX() {
                }

                protected ForecastdayBeanX(Parcel in) {
                    this.date = in.readParcelable(DateBean.class.getClassLoader());
                    this.period = in.readInt();
                    this.high = in.readParcelable(HighBean.class.getClassLoader());
                    this.low = in.readParcelable(LowBean.class.getClassLoader());
                    this.conditions = in.readString();
                    this.icon = in.readString();
                    this.icon_url = in.readString();
                    this.skyicon = in.readString();
                    this.pop = in.readInt();
                    this.maxwind = in.readParcelable(MaxwindBean.class.getClassLoader());
                    this.avewind = in.readParcelable(AvewindBean.class.getClassLoader());
                    this.avehumidity = in.readInt();
                    this.maxhumidity = in.readInt();
                    this.minhumidity = in.readInt();
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeParcelable(this.date, flags);
                    dest.writeInt(this.period);
                    dest.writeParcelable(this.high, flags);
                    dest.writeParcelable(this.low, flags);
                    dest.writeString(this.conditions);
                    dest.writeString(this.icon);
                    dest.writeString(this.icon_url);
                    dest.writeString(this.skyicon);
                    dest.writeInt(this.pop);
                    dest.writeParcelable(this.maxwind, flags);
                    dest.writeParcelable(this.avewind, flags);
                    dest.writeInt(this.avehumidity);
                    dest.writeInt(this.maxhumidity);
                    dest.writeInt(this.minhumidity);
                }

                public static class DateBean implements Parcelable {
                    private String epoch;
                    private String pretty;
                    private int day;
                    private int month;
                    private int year;
                    private int yday;
                    private int hour;
                    private String min;
                    private int sec;
                    private String isdst;
                    private String monthname;
                    private String monthname_short;
                    private String weekday_short;
                    private String weekday;
                    private String ampm;
                    private String tz_short;
                    private String tz_long;

                    public static final Creator<DateBean> CREATOR = new Creator<DateBean>() {
                        @Override
                        public DateBean createFromParcel(Parcel in) {
                            return new DateBean(in);
                        }

                        @Override
                        public DateBean[] newArray(int size) {
                            return new DateBean[size];
                        }
                    };

                    protected DateBean(Parcel in) {
                        epoch = in.readString();
                        pretty = in.readString();
                        day = in.readInt();
                        month = in.readInt();
                        year = in.readInt();
                        yday = in.readInt();
                        hour = in.readInt();
                        min = in.readString();
                        sec = in.readInt();
                        isdst = in.readString();
                        monthname = in.readString();
                        monthname_short = in.readString();
                        weekday_short = in.readString();
                        weekday = in.readString();
                        ampm = in.readString();
                        tz_short = in.readString();
                        tz_long = in.readString();
                    }

                    public static DateBean objectFromData(String str) {

                        return new Gson().fromJson(str, DateBean.class);
                    }

                    public String getEpoch() {
                        return epoch;
                    }

                    public String getPretty() {
                        return pretty;
                    }

                    public int getDay() {
                        return day;
                    }

                    public int getMonth() {
                        return month;
                    }

                    public int getYear() {
                        return year;
                    }

                    public int getYday() {
                        return yday;
                    }

                    public int getHour() {
                        return hour;
                    }

                    public String getMin() {
                        return min;
                    }

                    public int getSec() {
                        return sec;
                    }

                    public String getIsdst() {
                        return isdst;
                    }

                    public String getMonthname() {
                        return monthname;
                    }

                    public String getMonthname_short() {
                        return monthname_short;
                    }

                    public String getWeekday_short() {
                        return weekday_short;
                    }

                    public String getWeekday() {
                        return weekday;
                    }

                    public String getAmpm() {
                        return ampm;
                    }

                    public String getTz_short() {
                        return tz_short;
                    }

                    public String getTz_long() {
                        return tz_long;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(epoch);
                        parcel.writeString(pretty);
                        parcel.writeInt(day);
                        parcel.writeInt(month);
                        parcel.writeInt(year);
                        parcel.writeInt(yday);
                        parcel.writeInt(hour);
                        parcel.writeString(min);
                        parcel.writeInt(sec);
                        parcel.writeString(isdst);
                        parcel.writeString(monthname);
                        parcel.writeString(monthname_short);
                        parcel.writeString(weekday_short);
                        parcel.writeString(weekday);
                        parcel.writeString(ampm);
                        parcel.writeString(tz_short);
                        parcel.writeString(tz_long);
                    }
                }

                public static class HighBean implements Parcelable {

                    private String fahrenheit;
                    private String celsius;

                    public static final Creator<HighBean> CREATOR = new Creator<HighBean>() {
                        @Override
                        public HighBean createFromParcel(Parcel in) {
                            return new HighBean(in);
                        }

                        @Override
                        public HighBean[] newArray(int size) {
                            return new HighBean[size];
                        }
                    };

                    protected HighBean(Parcel in) {
                        fahrenheit = in.readString();
                        celsius = in.readString();
                    }

                    public static HighBean objectFromData(String str) {

                        return new Gson().fromJson(str, HighBean.class);
                    }

                    public String getFahrenheit() {
                        return fahrenheit;
                    }

                    public String getCelsius() {
                        return celsius;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(fahrenheit);
                        parcel.writeString(celsius);
                    }
                }

                public static class LowBean implements Parcelable {

                    private String fahrenheit;
                    private String celsius;

                    public static final Creator<LowBean> CREATOR = new Creator<LowBean>() {
                        @Override
                        public LowBean createFromParcel(Parcel in) {
                            return new LowBean(in);
                        }

                        @Override
                        public LowBean[] newArray(int size) {
                            return new LowBean[size];
                        }
                    };

                    protected LowBean(Parcel in) {
                        fahrenheit = in.readString();
                        celsius = in.readString();
                    }

                    public static LowBean objectFromData(String str) {

                        return new Gson().fromJson(str, LowBean.class);
                    }

                    public String getFahrenheit() {
                        return fahrenheit;
                    }

                    public String getCelsius() {
                        return celsius;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(fahrenheit);
                        parcel.writeString(celsius);
                    }
                }

                public static class MaxwindBean implements Parcelable {

                    private int mph;
                    private int kph;
                    private String dir;
                    private int degrees;

                    public static final Creator<MaxwindBean> CREATOR = new Creator<MaxwindBean>() {
                        @Override
                        public MaxwindBean createFromParcel(Parcel in) {
                            return new MaxwindBean(in);
                        }

                        @Override
                        public MaxwindBean[] newArray(int size) {
                            return new MaxwindBean[size];
                        }
                    };

                    protected MaxwindBean(Parcel in) {
                        mph = in.readInt();
                        kph = in.readInt();
                        dir = in.readString();
                        degrees = in.readInt();
                    }

                    public static MaxwindBean objectFromData(String str) {

                        return new Gson().fromJson(str, MaxwindBean.class);
                    }

                    public int getMph() {
                        return mph;
                    }

                    public int getKph() {
                        return kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public int getDegrees() {
                        return degrees;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(mph);
                        parcel.writeInt(kph);
                        parcel.writeString(dir);
                        parcel.writeInt(degrees);
                    }
                }

                public static class AvewindBean implements Parcelable {

                    private int mph;
                    private int kph;
                    private String dir;
                    private int degrees;

                    public static final Creator<AvewindBean> CREATOR = new Creator<AvewindBean>() {
                        @Override
                        public AvewindBean createFromParcel(Parcel in) {
                            return new AvewindBean(in);
                        }

                        @Override
                        public AvewindBean[] newArray(int size) {
                            return new AvewindBean[size];
                        }
                    };

                    protected AvewindBean(Parcel in) {
                        mph = in.readInt();
                        kph = in.readInt();
                        dir = in.readString();
                        degrees = in.readInt();
                    }

                    public static AvewindBean objectFromData(String str) {

                        return new Gson().fromJson(str, AvewindBean.class);
                    }

                    public int getKph() {
                        return kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public int getDegrees() {
                        return degrees;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(mph);
                        parcel.writeInt(kph);
                        parcel.writeString(dir);
                        parcel.writeInt(degrees);
                    }
                }
            }
        }
    }
}

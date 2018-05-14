package com.example.mg.masterdetail.model;

import com.google.gson.Gson;

import java.util.List;

public class Weather10daysModel {

    /**
     * response : {"version":"0.1","termsofService":"http://www.wunderground.com/weather/api/d/terms.html","features":{"forecast10day":1}}
     * forecast : {"txt_forecast":{"date":"3:39 AM PDT","forecastday":[{"period":0,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Sunday","fcttext":"Partly cloudy. High near 60F. Winds SW at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 16C. Winds SW at 25 to 40 km/h.","pop":"10"},{"period":1,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy skies. Low 52F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Partly cloudy. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"10"},{"period":2,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Monday","fcttext":"Partly cloudy skies. High 59F. Winds WSW at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High around 15C. Winds WSW at 25 to 40 km/h.","pop":"10"},{"period":3,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Generally fair. Low 53F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Clear skies with a few passing clouds. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"20"},{"period":4,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Cloudy skies early will become partly cloudy later in the day. High 59F. Winds W at 10 to 20 mph.","fcttext_metric":"Cloudy skies early will become partly cloudy later in the day. High around 15C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":5,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Generally fair. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"Generally fair. Low 11C. Winds W at 15 to 30 km/h.","pop":"20"},{"period":6,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Wednesday","fcttext":"Partly cloudy. High around 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High around 15C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":7,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Wednesday Night","fcttext":"Mostly clear. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low around 10C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":8,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Thursday","fcttext":"A few clouds early, otherwise mostly sunny. High near 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Sun and a few passing clouds. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":9,"icon":"nt_mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_mostlycloudy.gif","title":"Thursday Night","fcttext":"Partly cloudy skies during the evening will give way to cloudy skies overnight. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy skies early will become overcast later during the night. Low around 10C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":10,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Friday","fcttext":"Cloudy early with partial sunshine expected late. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Cloudy skies early, then partly cloudy in the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":11,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Friday Night","fcttext":"Generally fair. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Mainly clear skies. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":12,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Saturday","fcttext":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":13,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Saturday Night","fcttext":"Mostly clear. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A mostly clear sky. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":14,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Sunday","fcttext":"Intervals of clouds and sunshine. High 63F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 17C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":15,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A few clouds from time to time. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":16,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Monday","fcttext":"Sunny skies. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Sunny skies. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":17,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Mainly clear early, then a few clouds later on. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"Clear to partly cloudy. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":18,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Sunshine and clouds mixed. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":19,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Clear skies. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"}]},"simpleforecast":{"forecastday":[{"date":{"epoch":"1526263200","pretty":"7:00 PM PDT on May 13, 2018","day":13,"month":5,"year":2018,"yday":132,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":1,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"SW","degrees":232},"avewind":{"mph":18,"kph":29,"dir":"SW","degrees":232},"avehumidity":77,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526349600","pretty":"7:00 PM PDT on May 14, 2018","day":14,"month":5,"year":2018,"yday":133,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Mon","weekday":"Monday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":2,"high":{"fahrenheit":"59","celsius":"15"},"low":{"fahrenheit":"53","celsius":"12"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"WSW","degrees":252},"avewind":{"mph":17,"kph":27,"dir":"WSW","degrees":252},"avehumidity":79,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526436000","pretty":"7:00 PM PDT on May 15, 2018","day":15,"month":5,"year":2018,"yday":134,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Tue","weekday":"Tuesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":3,"high":{"fahrenheit":"59","celsius":"15"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":20,"kph":32,"dir":"W","degrees":260},"avewind":{"mph":15,"kph":24,"dir":"W","degrees":260},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526522400","pretty":"7:00 PM PDT on May 16, 2018","day":16,"month":5,"year":2018,"yday":135,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Wed","weekday":"Wednesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":4,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":20,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":266},"avewind":{"mph":17,"kph":27,"dir":"W","degrees":266},"avehumidity":69,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526608800","pretty":"7:00 PM PDT on May 17, 2018","day":17,"month":5,"year":2018,"yday":136,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Thu","weekday":"Thursday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":5,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":270},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":270},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526695200","pretty":"7:00 PM PDT on May 18, 2018","day":18,"month":5,"year":2018,"yday":137,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Fri","weekday":"Friday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":6,"high":{"fahrenheit":"61","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":269},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":269},"avehumidity":79,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526781600","pretty":"7:00 PM PDT on May 19, 2018","day":19,"month":5,"year":2018,"yday":138,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sat","weekday":"Saturday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":7,"high":{"fahrenheit":"61","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":268},"avewind":{"mph":18,"kph":29,"dir":"W","degrees":268},"avehumidity":77,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526868000","pretty":"7:00 PM PDT on May 20, 2018","day":20,"month":5,"year":2018,"yday":139,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":8,"high":{"fahrenheit":"63","celsius":"17"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":265},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":265},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526954400","pretty":"7:00 PM PDT on May 21, 2018","day":21,"month":5,"year":2018,"yday":140,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Mon","weekday":"Monday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":9,"high":{"fahrenheit":"64","celsius":"18"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":272},"avewind":{"mph":18,"kph":29,"dir":"W","degrees":272},"avehumidity":70,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1527040800","pretty":"7:00 PM PDT on May 22, 2018","day":22,"month":5,"year":2018,"yday":141,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Tue","weekday":"Tuesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":10,"high":{"fahrenheit":"64","celsius":"18"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":272},"avewind":{"mph":17,"kph":27,"dir":"W","degrees":272},"avehumidity":74,"maxhumidity":0,"minhumidity":0}]}}
     */

    private ResponseBean response;
    private ForecastBean forecast;

    public static Weather10daysModel objectFromData(String str) {

        return new Gson().fromJson(str, Weather10daysModel.class);
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public ForecastBean getForecast() {
        return forecast;
    }

    public void setForecast(ForecastBean forecast) {
        this.forecast = forecast;
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

    public static class ForecastBean {
        /**
         * txt_forecast : {"date":"3:39 AM PDT","forecastday":[{"period":0,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Sunday","fcttext":"Partly cloudy. High near 60F. Winds SW at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 16C. Winds SW at 25 to 40 km/h.","pop":"10"},{"period":1,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy skies. Low 52F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Partly cloudy. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"10"},{"period":2,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Monday","fcttext":"Partly cloudy skies. High 59F. Winds WSW at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High around 15C. Winds WSW at 25 to 40 km/h.","pop":"10"},{"period":3,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Generally fair. Low 53F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Clear skies with a few passing clouds. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"20"},{"period":4,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Cloudy skies early will become partly cloudy later in the day. High 59F. Winds W at 10 to 20 mph.","fcttext_metric":"Cloudy skies early will become partly cloudy later in the day. High around 15C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":5,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Generally fair. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"Generally fair. Low 11C. Winds W at 15 to 30 km/h.","pop":"20"},{"period":6,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Wednesday","fcttext":"Partly cloudy. High around 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High around 15C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":7,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Wednesday Night","fcttext":"Mostly clear. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low around 10C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":8,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Thursday","fcttext":"A few clouds early, otherwise mostly sunny. High near 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Sun and a few passing clouds. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":9,"icon":"nt_mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_mostlycloudy.gif","title":"Thursday Night","fcttext":"Partly cloudy skies during the evening will give way to cloudy skies overnight. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy skies early will become overcast later during the night. Low around 10C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":10,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Friday","fcttext":"Cloudy early with partial sunshine expected late. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Cloudy skies early, then partly cloudy in the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":11,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Friday Night","fcttext":"Generally fair. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Mainly clear skies. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":12,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Saturday","fcttext":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":13,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Saturday Night","fcttext":"Mostly clear. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A mostly clear sky. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":14,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Sunday","fcttext":"Intervals of clouds and sunshine. High 63F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 17C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":15,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A few clouds from time to time. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":16,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Monday","fcttext":"Sunny skies. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Sunny skies. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":17,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Mainly clear early, then a few clouds later on. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"Clear to partly cloudy. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":18,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Sunshine and clouds mixed. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":19,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Clear skies. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"}]}
         * simpleforecast : {"forecastday":[{"date":{"epoch":"1526263200","pretty":"7:00 PM PDT on May 13, 2018","day":13,"month":5,"year":2018,"yday":132,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":1,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"SW","degrees":232},"avewind":{"mph":18,"kph":29,"dir":"SW","degrees":232},"avehumidity":77,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526349600","pretty":"7:00 PM PDT on May 14, 2018","day":14,"month":5,"year":2018,"yday":133,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Mon","weekday":"Monday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":2,"high":{"fahrenheit":"59","celsius":"15"},"low":{"fahrenheit":"53","celsius":"12"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"WSW","degrees":252},"avewind":{"mph":17,"kph":27,"dir":"WSW","degrees":252},"avehumidity":79,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526436000","pretty":"7:00 PM PDT on May 15, 2018","day":15,"month":5,"year":2018,"yday":134,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Tue","weekday":"Tuesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":3,"high":{"fahrenheit":"59","celsius":"15"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":20,"kph":32,"dir":"W","degrees":260},"avewind":{"mph":15,"kph":24,"dir":"W","degrees":260},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526522400","pretty":"7:00 PM PDT on May 16, 2018","day":16,"month":5,"year":2018,"yday":135,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Wed","weekday":"Wednesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":4,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":20,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":266},"avewind":{"mph":17,"kph":27,"dir":"W","degrees":266},"avehumidity":69,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526608800","pretty":"7:00 PM PDT on May 17, 2018","day":17,"month":5,"year":2018,"yday":136,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Thu","weekday":"Thursday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":5,"high":{"fahrenheit":"60","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":270},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":270},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526695200","pretty":"7:00 PM PDT on May 18, 2018","day":18,"month":5,"year":2018,"yday":137,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Fri","weekday":"Friday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":6,"high":{"fahrenheit":"61","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":269},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":269},"avehumidity":79,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526781600","pretty":"7:00 PM PDT on May 19, 2018","day":19,"month":5,"year":2018,"yday":138,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sat","weekday":"Saturday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":7,"high":{"fahrenheit":"61","celsius":"16"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":268},"avewind":{"mph":18,"kph":29,"dir":"W","degrees":268},"avehumidity":77,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526868000","pretty":"7:00 PM PDT on May 20, 2018","day":20,"month":5,"year":2018,"yday":139,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":8,"high":{"fahrenheit":"63","celsius":"17"},"low":{"fahrenheit":"51","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":265},"avewind":{"mph":19,"kph":31,"dir":"W","degrees":265},"avehumidity":75,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1526954400","pretty":"7:00 PM PDT on May 21, 2018","day":21,"month":5,"year":2018,"yday":140,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Mon","weekday":"Monday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":9,"high":{"fahrenheit":"64","celsius":"18"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Clear","icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":272},"avewind":{"mph":18,"kph":29,"dir":"W","degrees":272},"avehumidity":70,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1527040800","pretty":"7:00 PM PDT on May 22, 2018","day":22,"month":5,"year":2018,"yday":141,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Tue","weekday":"Tuesday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"},"period":10,"high":{"fahrenheit":"64","celsius":"18"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":25,"kph":40,"dir":"W","degrees":272},"avewind":{"mph":17,"kph":27,"dir":"W","degrees":272},"avehumidity":74,"maxhumidity":0,"minhumidity":0}]}
         */

        private TxtForecastBean txt_forecast;
        private SimpleforecastBean simpleforecast;

        public static ForecastBean objectFromData(String str) {

            return new Gson().fromJson(str, ForecastBean.class);
        }

        public TxtForecastBean getTxt_forecast() {
            return txt_forecast;
        }

        public void setTxt_forecast(TxtForecastBean txt_forecast) {
            this.txt_forecast = txt_forecast;
        }

        public SimpleforecastBean getSimpleforecast() {
            return simpleforecast;
        }

        public void setSimpleforecast(SimpleforecastBean simpleforecast) {
            this.simpleforecast = simpleforecast;
        }

        public static class TxtForecastBean {
            /**
             * date : 3:39 AM PDT
             * forecastday : [{"period":0,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Sunday","fcttext":"Partly cloudy. High near 60F. Winds SW at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 16C. Winds SW at 25 to 40 km/h.","pop":"10"},{"period":1,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy skies. Low 52F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Partly cloudy. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"10"},{"period":2,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Monday","fcttext":"Partly cloudy skies. High 59F. Winds WSW at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High around 15C. Winds WSW at 25 to 40 km/h.","pop":"10"},{"period":3,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Generally fair. Low 53F. Winds WSW at 10 to 20 mph.","fcttext_metric":"Clear skies with a few passing clouds. Low 11C. Winds WSW at 15 to 30 km/h.","pop":"20"},{"period":4,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Cloudy skies early will become partly cloudy later in the day. High 59F. Winds W at 10 to 20 mph.","fcttext_metric":"Cloudy skies early will become partly cloudy later in the day. High around 15C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":5,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Generally fair. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"Generally fair. Low 11C. Winds W at 15 to 30 km/h.","pop":"20"},{"period":6,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Wednesday","fcttext":"Partly cloudy. High around 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High around 15C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":7,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Wednesday Night","fcttext":"Mostly clear. Low 51F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low around 10C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":8,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Thursday","fcttext":"A few clouds early, otherwise mostly sunny. High near 60F. Winds W at 15 to 25 mph.","fcttext_metric":"Sun and a few passing clouds. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":9,"icon":"nt_mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_mostlycloudy.gif","title":"Thursday Night","fcttext":"Partly cloudy skies during the evening will give way to cloudy skies overnight. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy skies early will become overcast later during the night. Low around 10C. Winds W at 25 to 40 km/h.","pop":"20"},{"period":10,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Friday","fcttext":"Cloudy early with partial sunshine expected late. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Cloudy skies early, then partly cloudy in the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":11,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Friday Night","fcttext":"Generally fair. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"Mainly clear skies. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":12,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Saturday","fcttext":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 61F. Winds W at 15 to 25 mph.","fcttext_metric":"Some clouds in the morning will give way to mainly sunny skies for the afternoon. High 16C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":13,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Saturday Night","fcttext":"Mostly clear. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A mostly clear sky. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":14,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Sunday","fcttext":"Intervals of clouds and sunshine. High 63F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 17C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":15,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"Partly cloudy. Low 51F. Winds W at 15 to 25 mph.","fcttext_metric":"A few clouds from time to time. Low near 10C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":16,"icon":"clear","icon_url":"http://icons.wxug.com/i/c/k/clear.gif","title":"Monday","fcttext":"Sunny skies. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Sunny skies. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":17,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Monday Night","fcttext":"Mainly clear early, then a few clouds later on. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"Clear to partly cloudy. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"},{"period":18,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Sunshine and clouds mixed. High 64F. Winds W at 15 to 25 mph.","fcttext_metric":"Partly cloudy. High 18C. Winds W at 25 to 40 km/h.","pop":"10"},{"period":19,"icon":"nt_clear","icon_url":"http://icons.wxug.com/i/c/k/nt_clear.gif","title":"Tuesday Night","fcttext":"Clear skies. Low 52F. Winds W at 10 to 20 mph.","fcttext_metric":"A mostly clear sky. Low 11C. Winds W at 15 to 30 km/h.","pop":"10"}]
             */

            private String date;
            private List<ForecastdayBean> forecastday;

            public static TxtForecastBean objectFromData(String str) {

                return new Gson().fromJson(str, TxtForecastBean.class);
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public List<ForecastdayBean> getForecastday() {
                return forecastday;
            }

            public void setForecastday(List<ForecastdayBean> forecastday) {
                this.forecastday = forecastday;
            }

            public static class ForecastdayBean {
                /**
                 * period : 0
                 * icon : clear
                 * icon_url : http://icons.wxug.com/i/c/k/clear.gif
                 * title : Sunday
                 * fcttext : Partly cloudy. High near 60F. Winds SW at 15 to 25 mph.
                 * fcttext_metric : Partly cloudy. High 16C. Winds SW at 25 to 40 km/h.
                 * pop : 10
                 */

                private int period;
                private String icon;
                private String icon_url;
                private String title;
                private String fcttext;
                private String fcttext_metric;
                private String pop;

                public static ForecastdayBean objectFromData(String str) {

                    return new Gson().fromJson(str, ForecastdayBean.class);
                }

                public int getPeriod() {
                    return period;
                }

                public void setPeriod(int period) {
                    this.period = period;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getFcttext() {
                    return fcttext;
                }

                public void setFcttext(String fcttext) {
                    this.fcttext = fcttext;
                }

                public String getFcttext_metric() {
                    return fcttext_metric;
                }

                public void setFcttext_metric(String fcttext_metric) {
                    this.fcttext_metric = fcttext_metric;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }
            }
        }

        public static class SimpleforecastBean {
            private List<ForecastdayBeanX> forecastday;

            public static SimpleforecastBean objectFromData(String str) {

                return new Gson().fromJson(str, SimpleforecastBean.class);
            }

            public List<ForecastdayBeanX> getForecastday() {
                return forecastday;
            }

            public void setForecastday(List<ForecastdayBeanX> forecastday) {
                this.forecastday = forecastday;
            }

            public static class ForecastdayBeanX {
                /**
                 * date : {"epoch":"1526263200","pretty":"7:00 PM PDT on May 13, 2018","day":13,"month":5,"year":2018,"yday":132,"hour":19,"min":"00","sec":0,"isdst":"1","monthname":"May","monthname_short":"May","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"PDT","tz_long":"America/Los_Angeles"}
                 * period : 1
                 * high : {"fahrenheit":"60","celsius":"16"}
                 * low : {"fahrenheit":"52","celsius":"11"}
                 * conditions : Clear
                 * icon : clear
                 * icon_url : http://icons.wxug.com/i/c/k/clear.gif
                 * skyicon :
                 * pop : 10
                 * qpf_allday : {"in":0,"mm":0}
                 * qpf_day : {"in":0,"mm":0}
                 * qpf_night : {"in":0,"mm":0}
                 * snow_allday : {"in":0,"cm":0}
                 * snow_day : {"in":0,"cm":0}
                 * snow_night : {"in":0,"cm":0}
                 * maxwind : {"mph":25,"kph":40,"dir":"SW","degrees":232}
                 * avewind : {"mph":18,"kph":29,"dir":"SW","degrees":232}
                 * avehumidity : 77
                 * maxhumidity : 0
                 * minhumidity : 0
                 */

                private DateBean date;
                private int period;
                private HighBean high;
                private LowBean low;
                private String conditions;
                private String icon;
                private String icon_url;
                private String skyicon;
                private int pop;
                private QpfAlldayBean qpf_allday;
                private QpfDayBean qpf_day;
                private QpfNightBean qpf_night;
                private SnowAlldayBean snow_allday;
                private SnowDayBean snow_day;
                private SnowNightBean snow_night;
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

                public void setDate(DateBean date) {
                    this.date = date;
                }

                public int getPeriod() {
                    return period;
                }

                public void setPeriod(int period) {
                    this.period = period;
                }

                public HighBean getHigh() {
                    return high;
                }

                public void setHigh(HighBean high) {
                    this.high = high;
                }

                public LowBean getLow() {
                    return low;
                }

                public void setLow(LowBean low) {
                    this.low = low;
                }

                public String getConditions() {
                    return conditions;
                }

                public void setConditions(String conditions) {
                    this.conditions = conditions;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getSkyicon() {
                    return skyicon;
                }

                public void setSkyicon(String skyicon) {
                    this.skyicon = skyicon;
                }

                public int getPop() {
                    return pop;
                }

                public void setPop(int pop) {
                    this.pop = pop;
                }

                public QpfAlldayBean getQpf_allday() {
                    return qpf_allday;
                }

                public void setQpf_allday(QpfAlldayBean qpf_allday) {
                    this.qpf_allday = qpf_allday;
                }

                public QpfDayBean getQpf_day() {
                    return qpf_day;
                }

                public void setQpf_day(QpfDayBean qpf_day) {
                    this.qpf_day = qpf_day;
                }

                public QpfNightBean getQpf_night() {
                    return qpf_night;
                }

                public void setQpf_night(QpfNightBean qpf_night) {
                    this.qpf_night = qpf_night;
                }

                public SnowAlldayBean getSnow_allday() {
                    return snow_allday;
                }

                public void setSnow_allday(SnowAlldayBean snow_allday) {
                    this.snow_allday = snow_allday;
                }

                public SnowDayBean getSnow_day() {
                    return snow_day;
                }

                public void setSnow_day(SnowDayBean snow_day) {
                    this.snow_day = snow_day;
                }

                public SnowNightBean getSnow_night() {
                    return snow_night;
                }

                public void setSnow_night(SnowNightBean snow_night) {
                    this.snow_night = snow_night;
                }

                public MaxwindBean getMaxwind() {
                    return maxwind;
                }

                public void setMaxwind(MaxwindBean maxwind) {
                    this.maxwind = maxwind;
                }

                public AvewindBean getAvewind() {
                    return avewind;
                }

                public void setAvewind(AvewindBean avewind) {
                    this.avewind = avewind;
                }

                public int getAvehumidity() {
                    return avehumidity;
                }

                public void setAvehumidity(int avehumidity) {
                    this.avehumidity = avehumidity;
                }

                public int getMaxhumidity() {
                    return maxhumidity;
                }

                public void setMaxhumidity(int maxhumidity) {
                    this.maxhumidity = maxhumidity;
                }

                public int getMinhumidity() {
                    return minhumidity;
                }

                public void setMinhumidity(int minhumidity) {
                    this.minhumidity = minhumidity;
                }

                public static class DateBean {
                    /**
                     * epoch : 1526263200
                     * pretty : 7:00 PM PDT on May 13, 2018
                     * day : 13
                     * month : 5
                     * year : 2018
                     * yday : 132
                     * hour : 19
                     * min : 00
                     * sec : 0
                     * isdst : 1
                     * monthname : May
                     * monthname_short : May
                     * weekday_short : Sun
                     * weekday : Sunday
                     * ampm : PM
                     * tz_short : PDT
                     * tz_long : America/Los_Angeles
                     */

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

                    public static DateBean objectFromData(String str) {

                        return new Gson().fromJson(str, DateBean.class);
                    }

                    public String getEpoch() {
                        return epoch;
                    }

                    public void setEpoch(String epoch) {
                        this.epoch = epoch;
                    }

                    public String getPretty() {
                        return pretty;
                    }

                    public void setPretty(String pretty) {
                        this.pretty = pretty;
                    }

                    public int getDay() {
                        return day;
                    }

                    public void setDay(int day) {
                        this.day = day;
                    }

                    public int getMonth() {
                        return month;
                    }

                    public void setMonth(int month) {
                        this.month = month;
                    }

                    public int getYear() {
                        return year;
                    }

                    public void setYear(int year) {
                        this.year = year;
                    }

                    public int getYday() {
                        return yday;
                    }

                    public void setYday(int yday) {
                        this.yday = yday;
                    }

                    public int getHour() {
                        return hour;
                    }

                    public void setHour(int hour) {
                        this.hour = hour;
                    }

                    public String getMin() {
                        return min;
                    }

                    public void setMin(String min) {
                        this.min = min;
                    }

                    public int getSec() {
                        return sec;
                    }

                    public void setSec(int sec) {
                        this.sec = sec;
                    }

                    public String getIsdst() {
                        return isdst;
                    }

                    public void setIsdst(String isdst) {
                        this.isdst = isdst;
                    }

                    public String getMonthname() {
                        return monthname;
                    }

                    public void setMonthname(String monthname) {
                        this.monthname = monthname;
                    }

                    public String getMonthname_short() {
                        return monthname_short;
                    }

                    public void setMonthname_short(String monthname_short) {
                        this.monthname_short = monthname_short;
                    }

                    public String getWeekday_short() {
                        return weekday_short;
                    }

                    public void setWeekday_short(String weekday_short) {
                        this.weekday_short = weekday_short;
                    }

                    public String getWeekday() {
                        return weekday;
                    }

                    public void setWeekday(String weekday) {
                        this.weekday = weekday;
                    }

                    public String getAmpm() {
                        return ampm;
                    }

                    public void setAmpm(String ampm) {
                        this.ampm = ampm;
                    }

                    public String getTz_short() {
                        return tz_short;
                    }

                    public void setTz_short(String tz_short) {
                        this.tz_short = tz_short;
                    }

                    public String getTz_long() {
                        return tz_long;
                    }

                    public void setTz_long(String tz_long) {
                        this.tz_long = tz_long;
                    }
                }

                public static class HighBean {
                    /**
                     * fahrenheit : 60
                     * celsius : 16
                     */

                    private String fahrenheit;
                    private String celsius;

                    public static HighBean objectFromData(String str) {

                        return new Gson().fromJson(str, HighBean.class);
                    }

                    public String getFahrenheit() {
                        return fahrenheit;
                    }

                    public void setFahrenheit(String fahrenheit) {
                        this.fahrenheit = fahrenheit;
                    }

                    public String getCelsius() {
                        return celsius;
                    }

                    public void setCelsius(String celsius) {
                        this.celsius = celsius;
                    }
                }

                public static class LowBean {
                    /**
                     * fahrenheit : 52
                     * celsius : 11
                     */

                    private String fahrenheit;
                    private String celsius;

                    public static LowBean objectFromData(String str) {

                        return new Gson().fromJson(str, LowBean.class);
                    }

                    public String getFahrenheit() {
                        return fahrenheit;
                    }

                    public void setFahrenheit(String fahrenheit) {
                        this.fahrenheit = fahrenheit;
                    }

                    public String getCelsius() {
                        return celsius;
                    }

                    public void setCelsius(String celsius) {
                        this.celsius = celsius;
                    }
                }

                public static class QpfAlldayBean {
                    /**
                     * in : 0
                     * mm : 0
                     */

                    private int in;
                    private int mm;

                    public static QpfAlldayBean objectFromData(String str) {

                        return new Gson().fromJson(str, QpfAlldayBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getMm() {
                        return mm;
                    }

                    public void setMm(int mm) {
                        this.mm = mm;
                    }
                }

                public static class QpfDayBean {
                    /**
                     * in : 0
                     * mm : 0
                     */

                    private int in;
                    private int mm;

                    public static QpfDayBean objectFromData(String str) {

                        return new Gson().fromJson(str, QpfDayBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getMm() {
                        return mm;
                    }

                    public void setMm(int mm) {
                        this.mm = mm;
                    }
                }

                public static class QpfNightBean {
                    /**
                     * in : 0
                     * mm : 0
                     */

                    private int in;
                    private int mm;

                    public static QpfNightBean objectFromData(String str) {

                        return new Gson().fromJson(str, QpfNightBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getMm() {
                        return mm;
                    }

                    public void setMm(int mm) {
                        this.mm = mm;
                    }
                }

                public static class SnowAlldayBean {
                    /**
                     * in : 0
                     * cm : 0
                     */

                    private int in;
                    private int cm;

                    public static SnowAlldayBean objectFromData(String str) {

                        return new Gson().fromJson(str, SnowAlldayBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getCm() {
                        return cm;
                    }

                    public void setCm(int cm) {
                        this.cm = cm;
                    }
                }

                public static class SnowDayBean {
                    /**
                     * in : 0
                     * cm : 0
                     */

                    private int in;
                    private int cm;

                    public static SnowDayBean objectFromData(String str) {

                        return new Gson().fromJson(str, SnowDayBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getCm() {
                        return cm;
                    }

                    public void setCm(int cm) {
                        this.cm = cm;
                    }
                }

                public static class SnowNightBean {
                    /**
                     * in : 0
                     * cm : 0
                     */

                    private int in;
                    private int cm;

                    public static SnowNightBean objectFromData(String str) {

                        return new Gson().fromJson(str, SnowNightBean.class);
                    }

                    public int getIn() {
                        return in;
                    }

                    public void setIn(int in) {
                        this.in = in;
                    }

                    public int getCm() {
                        return cm;
                    }

                    public void setCm(int cm) {
                        this.cm = cm;
                    }
                }

                public static class MaxwindBean {
                    /**
                     * mph : 25
                     * kph : 40
                     * dir : SW
                     * degrees : 232
                     */

                    private int mph;
                    private int kph;
                    private String dir;
                    private int degrees;

                    public static MaxwindBean objectFromData(String str) {

                        return new Gson().fromJson(str, MaxwindBean.class);
                    }

                    public int getMph() {
                        return mph;
                    }

                    public void setMph(int mph) {
                        this.mph = mph;
                    }

                    public int getKph() {
                        return kph;
                    }

                    public void setKph(int kph) {
                        this.kph = kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public int getDegrees() {
                        return degrees;
                    }

                    public void setDegrees(int degrees) {
                        this.degrees = degrees;
                    }
                }

                public static class AvewindBean {
                    /**
                     * mph : 18
                     * kph : 29
                     * dir : SW
                     * degrees : 232
                     */

                    private int mph;
                    private int kph;
                    private String dir;
                    private int degrees;

                    public static AvewindBean objectFromData(String str) {

                        return new Gson().fromJson(str, AvewindBean.class);
                    }

                    public int getMph() {
                        return mph;
                    }

                    public void setMph(int mph) {
                        this.mph = mph;
                    }

                    public int getKph() {
                        return kph;
                    }

                    public void setKph(int kph) {
                        this.kph = kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public int getDegrees() {
                        return degrees;
                    }

                    public void setDegrees(int degrees) {
                        this.degrees = degrees;
                    }
                }
            }
        }
    }
}

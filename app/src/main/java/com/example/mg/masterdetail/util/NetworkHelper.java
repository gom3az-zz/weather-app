package com.example.mg.masterdetail.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkHelper {
    private static NetworkHelper sNetworkHelper;

    public static synchronized NetworkHelper getInstance() {
        if (sNetworkHelper == null) {
            sNetworkHelper = new NetworkHelper();
        }
        return sNetworkHelper;
    }

    public boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert connectivityManager != null;
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }
}

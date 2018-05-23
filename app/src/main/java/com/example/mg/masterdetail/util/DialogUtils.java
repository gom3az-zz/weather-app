package com.example.mg.masterdetail.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.example.mg.masterdetail.R;

public class DialogUtils {
    private DialogUtils() {
        // This utility class is not publicly instantiable
    }

    public static ProgressDialog showLoadingDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

  /*  public static void showNoInternet(Context context) {
        TextView noInternet = new TextView(context);
        FrameLayout fl = ((Activity) context).findViewById(R.id.frameLayout);
        noInternet.setVisibility(View.VISIBLE);
        noInternet.setText(R.string.error_internet_connection);
        fl.addView(noInternet);
    }*/
}

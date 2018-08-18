package com.example.mg.masterdetail.util;

import android.app.ProgressDialog;

import com.example.mg.masterdetail.UI.DI.IFragScope;
import com.example.mg.masterdetail.UI.WeatherFragment;

import javax.inject.Inject;

@IFragScope
public class DialogUtils {

    private final WeatherFragment context;

    @Inject
    public DialogUtils(WeatherFragment context) {
        this.context = context;
    }

    public ProgressDialog showLoadingDialog() {
        ProgressDialog progressDialog = new ProgressDialog(context.getContext());
        progressDialog.show();
        progressDialog.setMessage("Loading...");
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

}

package com.ushannlabs.doc.Model;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionDetector {
    Context context;

    //Constructor
    public ConnectionDetector(Context context) {
        this.context = context;
    }

    //methode check connection
    public boolean isConnected(){
        ConnectivityManager connectivity = (ConnectivityManager)context.getSystemService(Service.CONNECTIVITY_SERVICE);

        if (connectivity != null){
            NetworkInfo info = connectivity.getActiveNetworkInfo();

            if (info !=null){

                if (info.getState()== NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;

    }
}

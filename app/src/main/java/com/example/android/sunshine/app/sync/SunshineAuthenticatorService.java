package com.example.android.sunshine.app.sync;

import android.content.Intent;
import android.os.IBinder;
import android.app.Service;
/**
 * Created by shubham on 31/12/16.
 */

public class SunshineAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new SunshineAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}

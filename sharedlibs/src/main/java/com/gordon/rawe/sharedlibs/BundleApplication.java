package com.gordon.rawe.sharedlibs;

import android.app.Application;
import android.content.Context;

import com.gordon.rawe.sharedlibs.bundle.framework.initialize.BundleInitializer;

public class BundleApplication extends Application {

    @Override
    public void onCreate() {
        BundleInitializer.initialize(this);
    }
}

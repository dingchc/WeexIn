package com.dcc.weex.in;

import android.app.Application;

import com.library.weex.WeexController;

/**
 * @author Ding
 * Created by Ding on 2018/6/28.
 */

public class WeexApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        WeexController.INSTANCE.init(this);

    }
}

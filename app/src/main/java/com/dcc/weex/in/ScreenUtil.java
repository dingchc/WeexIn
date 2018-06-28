package com.dcc.weex.in;

import android.content.Context;

/**
 * @author Ding
 * Created by Ding on 2018/6/28.
 */

public class ScreenUtil {

    public static int getDisplayWidth(Context context) {

        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }

        return 0;
    }

    public static int getDisplayHeight(Context context) {

        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }

        return 0;
    }
}

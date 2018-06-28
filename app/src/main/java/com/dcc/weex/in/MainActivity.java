package com.dcc.weex.in;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXFileUtils;

/**
 *
 * @author Ding
 */
public class MainActivity extends AppCompatActivity implements IWXRenderListener{

    private final static String TAG = "dcc";
    WXSDKInstance mInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mInstance = new WXSDKInstance(this);

        mInstance.registerRenderListener(this);

        mInstance.render(getPackageName(), WXFileUtils.loadAsset("index.js", this), null, null, -1, -1, WXRenderStrategy.APPEND_ASYNC );
    }

    /**
     * If {@link WXRenderStrategy#APPEND_ASYNC} is applied, this method
     * will be invoked when the rendering of first view is finish.
     * If {@link WXRenderStrategy#APPEND_ONCE} is applied, this method will
     * be invoked when the rendering of the view tree is finished.
     *
     * @param instance
     * @param view
     */
    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {

        setContentView(view);
    }

    /**
     * Called when the render view phase of weex has finished.
     * It can be invoked at most once in the entire life of a {@link WXSDKInstance}
     *
     * @param instance
     * @param width
     * @param height
     */
    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

        Log.i(TAG, "onRenderSuccess");
    }

    /**
     * Callback method, called when refresh is finished
     *
     * @param instance
     * @param width
     * @param height
     */
    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

        Log.i(TAG, "onRefreshSuccess");
    }

    /**
     * Report exception occurred when weex instance is running. Exception <strong>may not</strong>
     * cause user-noticeable failure of weex.
     *
     * @param instance
     * @param errCode
     * @param msg
     */
    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

        Log.i(TAG, msg);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mInstance != null) {
            mInstance.onActivityStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mInstance != null) {
            mInstance.onActivityResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mInstance != null) {
            mInstance.onActivityPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mInstance != null) {
            mInstance.onActivityStop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mInstance != null) {
            mInstance.onActivityDestroy();
        }

    }


}

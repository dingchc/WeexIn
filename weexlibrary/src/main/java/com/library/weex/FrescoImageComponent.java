package com.library.weex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXImage;
import com.taobao.weex.ui.component.WXVContainer;

/**
 * @author Ding
 * Created by Ding on 2018/6/27.
 */

public class FrescoImageComponent extends WXImage {

    public FrescoImageComponent(WXSDKInstance instance, WXDomObject node, WXVContainer parent) {
        super(instance, node, parent);
    }

    @Override
    protected ImageView initComponentHostView(@NonNull Context context) {

        FrescoImageView imageView = new FrescoImageView(context);

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }
}

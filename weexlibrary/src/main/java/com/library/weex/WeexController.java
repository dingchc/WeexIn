package com.library.weex;

import android.app.Application;
import android.content.Context;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXGlobalEventModule;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXException;
import com.taobao.weex.dom.WXEvent;

import java.io.File;

/**
 * Weex类
 *
 * @author ding
 *         Created by Ding on 2018/6/27.
 */

public enum WeexController {

    /**
     * 单例
     */
    INSTANCE;

    /**
     * 目录
     */
    private String weexDir;

    WeexController() {

    }

    /**
     * 初始化
     *
     * @param application 应用
     */
    public void init(Application application) {

        if (application == null) {
            return;
        }

        File outputDir = application.getDir("weex", Context.MODE_PRIVATE);

        WXSDKEngine.initialize(application, new InitConfig.Builder()
                .setImgAdapter(new FrescoImageAdapter())
//                .setHttpAdapter(new OkHttpAdapter())
                .build());


        try {
            WXSDKEngine.registerComponent("image", FrescoImageComponent.class);
        } catch (WXException e) {
            e.printStackTrace();
        }

    }
}

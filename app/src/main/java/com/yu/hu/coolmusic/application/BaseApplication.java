package com.yu.hu.coolmusic.application;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.application
 * 文件名：BaseApplication
 * 创建者：HY
 * 创建时间：2019/4/20 9:03
 * 描述：  application基类
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化AndroidUtilCode
        Utils.init(this);
    }
}

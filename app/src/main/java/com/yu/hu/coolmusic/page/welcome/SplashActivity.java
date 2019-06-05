package com.yu.hu.coolmusic.page.welcome;

import android.content.Intent;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.activity.BaseActivity;
import com.yu.hu.coolmusic.page.login.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic
 * 文件名：SplashActivity
 * 创建者：HY
 * 创建时间：2019/4/20 9:22
 * 描述：  欢迎页/闪屏页
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onPrepare() {
        Timer mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                //主线程中进行
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, 3000);
    }

}

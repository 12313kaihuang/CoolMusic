package com.yu.hu.coolmusic.page.login;

import android.content.Intent;

import com.blankj.utilcode.util.ActivityUtils;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.page.register.RegisterActivity;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;

import butterknife.OnClick;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.login
 * 文件名：ToRegisterPresenter
 * 创建者：HY
 * 创建时间：2019/4/21 21:40
 * 描述：  点击 立即注册
 */
public class ToRegisterPresenter extends Presenter {

    @OnClick(R.id.tv_to_register)
    public void toRegister(){
        ActivityUtils.startActivity(new Intent(getCurrentActivity(), RegisterActivity.class));
    }

}

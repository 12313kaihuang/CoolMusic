package com.yu.hu.coolmusic.page.main;

import android.content.Intent;

import com.blankj.utilcode.util.ActivityUtils;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.page.personal.PersonalActivity;
import com.yu.hu.coolmusic.presenter.Presenter;

import butterknife.OnClick;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main
 * 文件名：ToPersonPresenter
 * 创建者：HY
 * 创建时间：2019/4/21 23:09
 * 描述：  跳转到个人中心页面
 */
public class ToPersonPresenter extends Presenter {

    @OnClick(R.id.iv_right)
    public void toPersonal() {
        ActivityUtils.startActivity(new Intent(getCurrentActivity(), PersonalActivity.class));
    }

}

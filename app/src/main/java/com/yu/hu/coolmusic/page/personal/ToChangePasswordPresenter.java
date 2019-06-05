package com.yu.hu.coolmusic.page.personal;

import android.content.Intent;

import com.blankj.utilcode.util.ActivityUtils;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.page.changepassword.ChangePasswordActivity;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;

import butterknife.OnClick;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.personal
 * 文件名：ToChangePasswordPresenter
 * 创建者：HY
 * 创建时间：2019/4/21 23:58
 * 描述：  跳转到修改密码页面
 */
public class ToChangePasswordPresenter extends Presenter {

    @OnClick(R.id.tv_change_password)
    public void toChangePassword(){
        ActivityUtils.startActivity(new Intent(getCurrentActivity(), ChangePasswordActivity.class));
    }

}

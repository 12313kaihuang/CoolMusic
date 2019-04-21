package com.yu.hu.coolmusic.page.personal;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.presenter.Presenter;
import com.yu.hu.coolmusic.util.UserUtil;

import butterknife.OnClick;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.personal
 * 文件名：LogoutPresenter
 * 创建者：HY
 * 创建时间：2019/4/21 23:37
 * 描述：  退出登录
 */
public class LogoutPresenter extends Presenter {

    @OnClick(R.id.btn_logout)
    public void logout() {
        UserUtil.logout(getCurrentActivity());
    }

}

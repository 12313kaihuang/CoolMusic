package com.yu.hu.coolmusic.page.login;

import android.content.Intent;

import com.blankj.utilcode.util.ActivityUtils;
import com.yu.hu.coolmusic.MainActivity;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.presenter.Presenter;
import com.yu.hu.coolmusic.util.UserUtil;
import com.yu.hu.coolmusic.widget.InputView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.login
 * 文件名：LoginPresenter
 * 创建者：HY
 * 创建时间：2019/4/21 19:56
 * 描述：  LoginPresenter
 */
public class LoginPresenter extends Presenter {

    @BindView(R.id.iv_phone)
    InputView mPhoneInputView;

    @BindView(R.id.iv_password)
    InputView mPasswordInputView;

    @OnClick(R.id.btn_login)
    public void login() {
        ActivityUtils.startActivity(new Intent(getCurrentActivity(), MainActivity.class));
        ActivityUtils.finishActivity(getCurrentActivity(),true);
        //        if (UserUtil.validateLogin(mPhoneInputView.getInputContent(),
        //                mPasswordInputView.getInputContent())) {
        //            ActivityUtils.startActivity(new Intent(getCurrentActivity(), MainActivity.class));
        //            ActivityUtils.finishActivity(getCurrentActivity(),true);
        //        }
    }

}

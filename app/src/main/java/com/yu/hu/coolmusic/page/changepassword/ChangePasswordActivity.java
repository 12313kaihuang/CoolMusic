package com.yu.hu.coolmusic.page.changepassword;

import com.yu.hu.coolmusic.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.register.RegisterFragment;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.register
 * 文件名：RegisterActivity
 * 创建者：HY
 * 创建时间：2019/4/21 21:16
 * 描述：  修改密码
 */
public class ChangePasswordActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return ChangePasswordFragment.newInstance();
    }
}

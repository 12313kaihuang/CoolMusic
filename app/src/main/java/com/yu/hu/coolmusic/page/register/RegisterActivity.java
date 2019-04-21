package com.yu.hu.coolmusic.page.register;

import com.yu.hu.coolmusic.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.register
 * 文件名：RegisterActivity
 * 创建者：HY
 * 创建时间：2019/4/21 21:16
 * 描述：  注册页面
 */
public class RegisterActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return RegisterFragment.newInstance();
    }
}

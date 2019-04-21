package com.yu.hu.coolmusic.page.personal;

import com.yu.hu.coolmusic.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.personal
 * 文件名：PersonalActivity
 * 创建者：HY
 * 创建时间：2019/4/21 23:14
 * 描述：  个人中心
 */
public class PersonalActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return PersonalFragment.newInstance();
    }
}

package com.yu.hu.coolmusic.page.main;


import com.yu.hu.coolmusic.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;

public class MainActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildCurrentFragment() {
        return MainFragment.newInstance();
    }
}

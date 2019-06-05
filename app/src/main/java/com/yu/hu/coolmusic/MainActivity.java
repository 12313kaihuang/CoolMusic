package com.yu.hu.coolmusic;


import com.yu.hu.coolmusic.mvp.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.main.MainFragment;

public class MainActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return MainFragment.newInstance();
    }
}

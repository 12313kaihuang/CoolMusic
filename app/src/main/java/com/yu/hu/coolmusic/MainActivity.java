package com.yu.hu.coolmusic;


import com.yu.hu.coolmusic.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.main.fragment.MainFragment;

public class MainActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return MainFragment.newInstance();
    }
}

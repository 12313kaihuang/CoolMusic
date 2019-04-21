package com.yu.hu.coolmusic.page.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.presenter.Presenter;

import butterknife.BindView;

import static android.view.View.VISIBLE;
import static android.view.View.INVISIBLE;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main
 * 文件名：TitleBarPresenter
 * 创建者：HY
 * 创建时间：2019/4/20 14:11
 * 描述：  TitleBarPresenter  标题栏
 */
public class TitleBarPresenter extends Presenter {

    @BindView(R.id.iv_left)
    ImageView mLeftImageView;

    @BindView(R.id.tv_title)
    TextView mTitleTextView;

    @BindView(R.id.iv_right)
    ImageView mRightImageView;

    private String mTitle;
    private boolean mLeftImgVisible;
    private boolean mRightImgVisible;

    @SuppressWarnings("unused")
    public TitleBarPresenter(boolean leftImgVisible, boolean rightImgVisible, String title) {
        this.mTitle = title;
        this.mLeftImgVisible = leftImgVisible;
        this.mRightImgVisible = rightImgVisible;
    }

    @Override
    protected void onBind() {
        if (mTitle != null) {
            mTitleTextView.setText(mTitle);
            mLeftImageView.setVisibility(mLeftImgVisible ? VISIBLE : INVISIBLE);
            mRightImageView.setVisibility(mRightImgVisible ? VISIBLE : INVISIBLE);
        }
    }
}

package com.yu.hu.coolmusic.page.main;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main
 * 文件名：GridSpaceItemDecoration
 * 创建者：HY
 * 创建时间：2019/4/23 19:26
 * 描述：  GridSpaceItemDecoration
 */
public class GridSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int mSpace;

    public GridSpaceItemDecoration(int space, RecyclerView parent) {
        this.mSpace = space;
        //由于在getItemOffsets设置了每个item向右偏移，
        //所以需要将整个RecyclerView向左偏移回来
        //否则第一个Item也会有间隔
        setRecyclerViewOffsets(parent);
    }

    /**
     * @param outRect Item的矩边界
     * @param view    ItemView
     * @param parent  RecyclerView
     * @param state   RecyclerView的状态
     */
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        //这个方法会导致中间的View宽度变窄，同时由于布局要求高度也会变窄
        //判断是否为每行第一个Item
        //        if (parent.getChildAdapterPosition(view) % 3 == 0) {
        //            outRect.left = 0;
        //        }else {
        //            outRect.left = mSpace;
        //        }

        outRect.left = mSpace;


    }

    /**
     * 将RecyclerView偏移回来
     */
    private void setRecyclerViewOffsets(RecyclerView parent) {
        /*View margin
         * margin 为正，则View 会距离边界产生一个距离
         * margin 为负，则View会超出边界产生一个距离
         */
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) parent.getLayoutParams();
        layoutParams.leftMargin = -mSpace;
        parent.requestLayout();
    }
}

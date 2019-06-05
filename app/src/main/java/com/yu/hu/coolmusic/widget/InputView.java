package com.yu.hu.coolmusic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.widget.BaseCustomView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.widget
 * 文件名：InputView
 * 创建者：HY
 * 创建时间：2019/4/20 16:28
 * 描述：  自定义输入控件
 */
public class InputView extends BaseCustomView {

    @BindView(R.id.iv_input_icon)
    ImageView mImageIcon;

    @BindView(R.id.et_input)
    EditText mEditText;

    public InputView(@NonNull Context context) {
        super(context);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_input_view;
    }

    @Override
    protected int[] getStyleable() {
        return R.styleable.InputView;
    }

    @Override
    protected void initParams(TypedArray typedArray, AttributeSet attrs) {
        int inputIcon = typedArray.getResourceId(R.styleable.InputView_ivIcon, R.mipmap.ic_launcher);
        //如果布局文件中没有设置该属性将返回的是空字符串""
        String inputHint = typedArray.getString(R.styleable.InputView_ivHint);
        int inputType = typedArray.getInt(R.styleable.InputView_ivInputType, 0);

        mImageIcon.setImageResource(inputIcon);
        mEditText.setHint(inputHint);
        switch (inputType) {
            case 0:
                mEditText.setInputType(InputType.TYPE_CLASS_PHONE);
                break;
            case 1:
                mEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                break;
            default:
                mEditText.setInputType(InputType.TYPE_CLASS_TEXT);
                break;
        }
    }

    /**
     * 获取输入框的内容
     *
     * @return 输入框的内容
     */
    @SuppressWarnings("unused")
    public String getInputContent() {
        return mEditText.getText().toString();
    }
}

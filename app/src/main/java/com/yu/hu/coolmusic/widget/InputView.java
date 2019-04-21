package com.yu.hu.coolmusic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.yu.hu.coolmusic.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.widget
 * 文件名：InputView
 * 创建者：HY
 * 创建时间：2019/4/20 16:28
 * 描述：  自定义输入控件
 */
public class InputView extends FrameLayout {

    private int inputIcon;
    private String inputHint;
    private int inputType;

    private View mView;

    @BindView(R.id.iv_input_icon)
    ImageView mImageIcon;

    @BindView(R.id.et_input)
    EditText mEditText;

    public InputView(@NonNull Context context) {
        this(context, null);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        mView = LayoutInflater.from(context).inflate(R.layout.layout_input_view, this, false);
        ButterKnife.bind(this, mView);

        initParams(context, attrs);
    }

    /**
     * 初始化自定义参数
     *
     * @param context attrs
     * @param attrs   attrs
     */
    private void initParams(Context context, AttributeSet attrs) {
        if (null != attrs) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.InputView);
            inputIcon = typedArray.getResourceId(R.styleable.InputView_input_icon, R.mipmap.ic_launcher);
            inputHint = typedArray.getString(R.styleable.InputView_input_hint);
            inputType = typedArray.getInt(R.styleable.InputView_input_type, 0);
            typedArray.recycle();
        }

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
        addView(mView);
    }

    /**
     * 获取输入框的内容
     *
     * @return 输入框的内容
     */
    public String getInputContent() {
        return mEditText.getText().toString();
    }
}

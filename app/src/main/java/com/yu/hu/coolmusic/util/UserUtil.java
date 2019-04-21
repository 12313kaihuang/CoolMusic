package com.yu.hu.coolmusic.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.page.login.LoginActivity;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.util
 * 文件名：UserUtil
 * 创建者：HY
 * 创建时间：2019/4/21 19:47
 * 描述：  用户相关
 */
public class UserUtil {

    /**
     * 判断输入是否合法
     *
     * @param phoneNumber phoneNumber
     * @param password    password
     * @return 是否合法
     */
    public static boolean validateLogin(String phoneNumber, String password) {
        //简单的
        //        RegexUtils.isMobileSimple(phoneNumber);
        //精确的
        if (!RegexUtils.isMobileExact(phoneNumber)) {
            ToastUtils.showShort("无效的手机号");
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            ToastUtils.showShort("密码不能为空");
            return false;
        }
        return true;
    }

    /**
     * 退出登录
     *
     * @param context context
     */
    public static void logout(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        //清空task栈 | 创建新的task栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        ActivityUtils.startActivity(intent);
        //        ActivityUtils.startActivity(intent,R.anim.open_enter,R.anim.open_exit)
        //定义动画效果  由于清空了栈并重新创建了栈所以动画需重新定义
        ((Activity) context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}

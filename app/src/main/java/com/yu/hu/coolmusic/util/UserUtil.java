package com.yu.hu.coolmusic.util;

import android.content.Context;
import android.text.TextUtils;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;

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
}

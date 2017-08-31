package com.lawyee.celvmodel.tv;

import android.util.Log;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.tv
 * @Description: 关机状态
 * @author: YFL
 * @date: 2017/8/31 16:58
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class PowerOffState implements TVState {
    public static final String TAG = "未开机";
    @Override
    public void nextChannel() {
        Log.e(TAG, "nextChannel: " );
    }

    @Override
    public void prevChannel() {
        Log.e(TAG, "prevChannel: " );
    }

    @Override
    public void turnUp() {
        Log.e(TAG, "turnUp: " );
    }

    @Override
    public void turnDown() {
        Log.e(TAG, "turnDown: " );
    }
}

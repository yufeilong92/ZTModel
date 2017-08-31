package com.lawyee.celvmodel.tv;

import android.util.Log;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.tv
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/8/31 16:41
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class TvController {
    public static final String TAG = "电视";
    //开机状态
    private final static int POWER_ON = 1;
    //关机状态
    private final static int POWER_OFF = 2;

    private int mState = POWER_OFF;

    public void poweron() {
        mState=POWER_ON;
        if (mState == POWER_ON) {
            Log.e(TAG, "开机；了 ");
        }
    }

    public void powerOff() {
        mState=POWER_OFF;
        if (mState==POWER_OFF){
            Log.e(TAG, "关机" );
        }
    }
    public void nextChannel(){
        if (mState==POWER_ON){
            Log.e(TAG, "下一个频道" );
        }else {
            Log.e(TAG, "提示没有开机" );
        }
    }
    public void prevChannel(){
        if (mState==POWER_ON){
            Log.e(TAG, "上一个频道" );
        }else {
            Log.e(TAG, "提示没有开机" );
        }
    }
}

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
 * @date: 2017/8/31 17:09
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class TvContoller implements PowerController {
    private TVState mState;
    private boolean mIsBegin = true;

    @Override
    public void powerON() {
        if (mIsBegin) {
            setmState(new PowerOnState());
            Log.e("====", "开机啦");
            mIsBegin = false;
        }
    }

    @Override
    public void powerOff() {
        if (!mIsBegin) {
            setmState(new PowerOffState());
            Log.e("===", "关机啦");
            mIsBegin = true;
        }
    }


    private void setmState(TVState mState) {
        this.mState = mState;
    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void turnUp() {
        mState.turnUp();
    }

    public void turnDown() {
        mState.turnDown();
    }

}

package com.lawyee.celvmodel.zf;

import android.content.Context;
import android.content.Intent;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.zf
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/8/31 17:57
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class LogoutStatus implements UserState {
    @Override
    public void forward(Context context) {

    }

    @Override
    public void commetn(Context context) {

    }
    private void gotoLoginActivity(Context context){
        Intent intent = new Intent(context,.class);
         startActivity(intent);
    }
}

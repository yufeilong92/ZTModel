package com.lawyee.celvmodel.celu;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.celu
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/8/31 11:10
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class SubwayStrategy implements CalculateStrategy {
    /**
     *  6公里内三元，6-12公里（含）4元 ，12-22公里（含）5元；22-32公里6元；
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        }
        return 7;
    }
}

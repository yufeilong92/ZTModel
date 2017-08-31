package com.lawyee.celvmodel.celu;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.celu
 * @Description: 价格
 * @author: YFL
 * @date: 2017/8/31 9:45
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class PriceCalculator {
    /**
     * 公交车
     */
    public static final int Bus = 1;
    /**
     * 地铁
     */
    public static final int SubWAK = 2;

    /**
     * 10公里一元钱，超过10公里，每5 公里多加一元
     *
     * @param km
     * @return
     */
    private int busPrice(int km) {
        //超过十公里的总距离
        int extratotal = km - 10;

        //超过的总距离是5的倍数
        int extrafactor = extratotal / 5;

        //超过的总距离对5求余

        int fracton = extrafactor % 5;
        int price = 1 + extrafactor * 1;
        return fracton > 0 ? ++price : price;
    }

    /**
     * 6公里内三元，6-12公里（含）4元 ，12-22公里（含）5元；22-32公里6元；
     *
     * @param km
     * @return
     */
    private int subwayprice(int km) {
        if (km < 6) {
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

    public int caluclteprice(int km, int type) {
        if (type == Bus) {
            return busPrice(km);
        } else if (type == SubWAK) {
            return subwayprice(km);
        }
        return 0;
    }
}

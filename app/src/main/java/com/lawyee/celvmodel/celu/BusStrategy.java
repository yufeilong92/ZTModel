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
public class BusStrategy implements CalculateStrategy {
    /**
     * 10公里一元钱，超过10公里，每5 公里多加一元
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        int extro = km - 10;//超出距离

        int extrot = extro / 5;//商 商为0,则没有超出，

        int i = extrot % 5;//余数 余数为零是，没有超出

        int price = 1 + i * 1;

        return i > 0 ? price : price;

    }
}

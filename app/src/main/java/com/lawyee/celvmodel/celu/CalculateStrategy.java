package com.lawyee.celvmodel.celu;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyApplication3
 * @Package com.lawyee.celvmodel.celu
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/8/31 11:08
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface CalculateStrategy {
    /**
     * 按距离算价
     * @param km
     * @return
     */
    int calculatePrice(int km);

}

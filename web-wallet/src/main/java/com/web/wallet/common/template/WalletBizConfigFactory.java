/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.enums.BizTypeEnum;

/**
 *
 * @author wuxianxin
 * @version WalletBizConfigFactory.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public interface WalletBizConfigFactory {

    /**
     * 获取对应的校验器
     * @param bizTypeEnum
     * @return
     */
    RequestValidator getValidator(BizTypeEnum bizTypeEnum);

    /**
     * 根据场景查询对应流程处理器
     * @param bizTypeEnum
     * @return
     */
    WalletBizProcessor getProcessor(BizTypeEnum bizTypeEnum);
}
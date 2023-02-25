/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.model.BaseRequest;
import com.web.wallet.common.model.BaseResult;

/**
 * @author wuxianxin
 * @version BizCallback.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public interface BizCallback {

    /**
     * 检查入参数
     */
    void checkParam();

    /**
     * 核心罗技处理
     */
    void process();

    BaseResult initResult();

    BaseRequest getRequest();
}
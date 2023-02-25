/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.model.BaseRequest;

/**
 * @author wuxianxin
 * @version RequestValidator.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public interface RequestValidator<T extends BaseRequest> {

    /**
     * 验证执行方法
     * @param baseRequest
     * @param inputParams
     */
    void validate(T baseRequest, Object... inputParams);
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.model.BaseRequest;
import com.web.wallet.common.model.BaseResult;

import javax.servlet.http.HttpServletRequest;


/**
 * @author wuxianxin
 * @version WalletBizProcessor.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public interface WalletBizProcessor<T extends BaseRequest, R extends BaseResult> {

    /**
     * 执行处理器
     * @param request
     * @param result
     * @param httpServletRequest
     * @param inputParams
     */
    void process(T request, R result, HttpServletRequest httpServletRequest, Object... inputParams);
}
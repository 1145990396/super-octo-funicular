/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.alibaba.fastjson.JSON;
import com.web.wallet.common.enums.BizTypeEnum;
import com.web.wallet.common.model.BaseRequest;
import com.web.wallet.common.model.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.web.wallet.marketing.util.LogConstants;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * rest接口执行模版
 * @author wuxianxin
 * @version RestTemplate.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class RestTemplate {

    /**
     * rest请求日志
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(RestTemplate.class);

    private final static Logger LOGGER_WALLET_REST_WEB_DETAIL = LoggerFactory.getLogger(LogConstants.LOGGER_WALLET_REST_WEB_DETAIL);

    /**
     * 模版方法
     * @param callback
     * @param bizTypeEnum
     * @param httpServletRequest
     * @param inputParams
     */
    public static void execute(BizCallback callback, BizTypeEnum bizTypeEnum, HttpServletRequest httpServletRequest,
                               Object... inputParams) {

        long start = System.currentTimeMillis();

        final BaseResult result = callback.initResult();
        final BaseRequest request = callback.getRequest();
        String requestStr = null;

        if (null != request) {
            requestStr = request.toString();
        } else {
            requestStr = Arrays.toString(inputParams);
        }

        try {
            // 业务前置校验
            callback.checkParam();

            // 业务核心逻辑
            callback.process();

            buildSuccess(result);
        } catch (Throwable ue) {
            LOGGER.error(LOGGER_WALLET_REST_WEB_DETAIL.toString(), ue, "Unknown Exception!");
        } finally {
            // web日志
            addDigestLog(requestStr, bizTypeEnum, result, start, httpServletRequest);
        }

    }

    /**
     * 摘要日志
     * @param requestStr
     * @param bizTypeEnum
     * @param result
     * @param start
     * @param httpServletRequest
     */
    private static void addDigestLog(String requestStr, BizTypeEnum bizTypeEnum, BaseResult result, long start, HttpServletRequest httpServletRequest) {
        try {
            LOGGER.info(String.format("[(%s)(%s)][(%s)(%s)(%s)(%dms))][request = %s[result = %s]"), bizTypeEnum.getCode(), bizTypeEnum.getDescription(), result.isSuccess(),
                    result.getErrorCode(), result.getErrorMessage(), System.currentTimeMillis() - start, JSON.toJSONString(requestStr), JSON.toJSONString(result));
        } catch (Exception e) {

        }
    }

    /**
     * 构造正常信息
     * @param result
     */
    private static void buildSuccess(BaseResult result) {
        result.setSuccess(true);
        result.setErrorCode("200");
        result.setErrorMessage("SUCCESS");
    }
}
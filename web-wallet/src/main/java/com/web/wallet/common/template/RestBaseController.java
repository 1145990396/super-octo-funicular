/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.enums.BizTypeEnum;
import com.web.wallet.common.model.BaseRequest;
import com.web.wallet.common.model.BaseResult;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * resultful接口基类
 * @author wuxianxin
 * @version RestBaseController.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@Controller
public class RestBaseController {

    /**
     * 场景相关配置路由
     */
    @Resource
    private WalletBizConfigFactory walletBizConfigFactory;

    protected <T extends BaseRequest, R extends BaseResult> R process(final BizTypeEnum bizTypeEnum,
                                                                      final T request,
                                                                      final R result,
                                                                      final HttpServletRequest httpServletRequest,
                                                                      Object... inputParams) {
        RestTemplate.execute(new BizCallback() {
            @Override
            public void checkParam() {
                walletBizConfigFactory.getValidator(bizTypeEnum).validate(request, inputParams);
            }

            @Override
            public void process() {
                walletBizConfigFactory.getProcessor(bizTypeEnum).process(request, result, httpServletRequest, inputParams);
            }

            @Override
            public BaseResult initResult() {
                return result;
            }

            @Override
            public BaseRequest getRequest() {
                return request;
            }
        }, bizTypeEnum, httpServletRequest, inputParams);

        return result;

    }

}
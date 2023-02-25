/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.template;

import com.web.wallet.common.enums.BizTypeEnum;

import java.util.Map;

/**
 * @author wuxianxin
 * @version WalletBizConfigFactoryImpl.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class WalletBizConfigFactoryImpl implements WalletBizConfigFactory{

    /**
     * 校验器集合
     * @param bizTypeEnum
     * @return
     */
    private Map<BizTypeEnum, RequestValidator> validatorMap;

    /**
     * 场景对应流程处理器映射关系
     * @param bizTypeEnum
     * @return
     */
    private Map<BizTypeEnum, WalletBizProcessor> processorMap;

    /**
     * Setter method for property <tt>validatorMap</tt>.
     *
     * @param validatorMap value to be assigned to property validatorMap
     */
    public void setValidatorMap(Map<BizTypeEnum, RequestValidator> validatorMap) {
        this.validatorMap = validatorMap;
    }

    /**
     * Setter method for property <tt>processorMap</tt>.
     *
     * @param processorMap value to be assigned to property processorMap
     */
    public void setProcessorMap(Map<BizTypeEnum, WalletBizProcessor> processorMap) {
        this.processorMap = processorMap;
    }

    @Override
    public RequestValidator getValidator(BizTypeEnum bizTypeEnum) {
        return validatorMap.get(bizTypeEnum);
    }

    @Override
    public WalletBizProcessor getProcessor(BizTypeEnum bizTypeEnum) {
        return processorMap.get(bizTypeEnum);
    }
}
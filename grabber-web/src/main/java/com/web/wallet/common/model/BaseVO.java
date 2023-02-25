/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 基本的VO
 * @author wuxianxin
 * @version BaseVO.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class BaseVO implements Serializable {
    private static final long serialVersionUID = -2302639231659792021L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
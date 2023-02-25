/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.enums;

/**
 * rest接口前端错误展示类型
 * @author wuxianxin
 * @version ErrorShowType.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public enum ErrorShowType {

    /**
     * 前端不提示错误（前端不处理）
     */
    SILENT(0),

    /**
     * 告警信息提示（toast 告警类）
     */
    WARN_MESSAGE(1),

    /**
     * 错误信息提示（toast 错误类）
     */
    ERROR_MESSAGE(2),

    /**
     * 通知提示
     */
    NOTIFICATION(3),

    /**
     * 页面跳转
     */
    REDIRECT(9);

    private int type;

    /**
     * 构造
     * @param type
     */
    ErrorShowType(int type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public int getType() {
        return type;
    }
}
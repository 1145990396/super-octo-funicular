/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.model;

import com.web.wallet.common.enums.ErrorShowType;

import java.io.Serializable;

/**
 * @author wuxianxin
 * @version BaseResult.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 865119202191037237L;

    /**
     * 业务处理是否成功
     */
    private boolean success;

    /**
     * 业务处理结果码
     */
    private String errorCode;

    /**
     * 业务结果描述
     */
    private String errorMessage;

    /**
     * 错误展示类型
     * @see ErrorShowType
     */
    private int showType;

    /**
     * 重定向地址，当showType=9,才有这个值
     */
    private String redirectUrl;

    /**
     * Getter method for property <tt>serialVersionUID</tt>.
     *
     * @return property value of serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for property <tt>success</tt>.
     *
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>errorCode</tt>.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>errorMessage</tt>.
     *
     * @return property value of errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setter method for property <tt>errorMessage</tt>.
     *
     * @param errorMessage value to be assigned to property errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Getter method for property <tt>showType</tt>.
     *
     * @return property value of showType
     */
    public int getShowType() {
        return showType;
    }

    /**
     * Setter method for property <tt>showType</tt>.
     *
     * @param showType value to be assigned to property showType
     */
    public void setShowType(int showType) {
        this.showType = showType;
    }

    /**
     * Getter method for property <tt>redirectUrl</tt>.
     *
     * @return property value of redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Setter method for property <tt>redirectUrl</tt>.
     *
     * @param redirectUrl value to be assigned to property redirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
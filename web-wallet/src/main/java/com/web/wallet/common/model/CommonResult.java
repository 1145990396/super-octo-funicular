/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果
 * @author wuxianxin
 * @version CommonPageResult.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class CommonResult<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = -1632365864974079964L;


    /**
     * 分页数据
     */
    private T data;

    /**
     * 设置正常的数据
     * @param data 数据
     * @param <T> 返回值类型
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> pageResult = new CommonResult<>();
        pageResult.setSuccess(true);
        pageResult.setErrorCode("200");
        pageResult.setErrorMessage("SUCCESS");
        pageResult.setData(data);
        return pageResult;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(T data) {
        this.data = data;
    }
}
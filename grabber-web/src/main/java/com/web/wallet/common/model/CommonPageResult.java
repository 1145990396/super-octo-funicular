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
public class CommonPageResult<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = -1632365864974079964L;

    /**
     * 当前页数
     */
    private int currentPage = 1;

    /**
     * 每页大小
     */
    private int pageSize = 0;

    /**
     * 总页数
     */
    private int pageCount = 0;

    /**
     * 总数量
     */
    private long totalCount = 0;

    /**
     * 分页数据
     */
    private List<T> data;

    /**
     * 设置正常的数据
     * @param data 数据
     * @param <T> 返回值类型
     * @return
     */
    public static <T> CommonPageResult<T> success(List<T> data) {
        CommonPageResult<T> pageResult = new CommonPageResult<>();
        pageResult.setSuccess(true);
        pageResult.setErrorCode("200");
        pageResult.setErrorMessage("SUCCESS");
        pageResult.setData(data);
        return pageResult;
    }

    /**
     * Getter method for property <tt>currentPage</tt>.
     *
     * @return property value of currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter method for property <tt>currentPage</tt>.
     *
     * @param currentPage value to be assigned to property currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Getter method for property <tt>pageSize</tt>.
     *
     * @return property value of pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter method for property <tt>pageSize</tt>.
     *
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property <tt>pageCount</tt>.
     *
     * @return property value of pageCount
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Setter method for property <tt>pageCount</tt>.
     *
     * @param pageCount value to be assigned to property pageCount
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * Getter method for property <tt>totalCount</tt>.
     *
     * @return property value of totalCount
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * Setter method for property <tt>totalCount</tt>.
     *
     * @param totalCount value to be assigned to property totalCount
     */
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(List<T> data) {
        this.data = data;
    }
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.common.enums;

/**
 * @author wuxianxin
 * @version BizTypeEnum.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public enum  BizTypeEnum {

    TIKTOK_VIDEO_LIST("TIKTOK_VIDEO_LIST","查询抖音视频列表"),
    TIKTOK_VIDEO_DETAIL("TIKTOK_VIDEO_DETAIL","查询抖音视频详情"),
    TIKTOK_VIDEO_DOWNLOAD("TIKTOK_VIDEO_DOWNLOAD","下载抖音视频");

    /**
     * 枚举码
     */
    private final String code;

    /**
     * 枚举值说明
     */
    private final String description;

    BizTypeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.request;

import com.web.wallet.common.model.BaseRequest;

/**
 * @author wuxianxin
 * @version TikTokVideoListRequest.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class TikTokVideoDetailRequest extends BaseRequest {
    private static final long serialVersionUID = -200310087015042297L;

    /**
     * 视频Id
     */
    private String videoId;

    /**
     * Getter method for property <tt>videoId</tt>.
     *
     * @return property value of videoId
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * Setter method for property <tt>videoId</tt>.
     *
     * @param videoId value to be assigned to property videoId
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.response;

import com.web.wallet.common.model.BaseVO;


/**
 * @author wuxianxin
 * @version VideoVO.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class VideoVO extends BaseVO {

    private static final long serialVersionUID = -7303355438905604314L;

    private String videoId;
    private String title;
    private String coverUrl;
    private String playUrl;

    public VideoVO(String videoId, String title, String coverUrl, String playUrl) {
        this.videoId = videoId;
        this.title = title;
        this.coverUrl = coverUrl;
        this.playUrl = playUrl;
    }

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

    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>coverUrl</tt>.
     *
     * @return property value of coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * Setter method for property <tt>coverUrl</tt>.
     *
     * @param coverUrl value to be assigned to property coverUrl
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * Getter method for property <tt>playUrl</tt>.
     *
     * @return property value of playUrl
     */
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * Setter method for property <tt>playUrl</tt>.
     *
     * @param playUrl value to be assigned to property playUrl
     */
    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }
}
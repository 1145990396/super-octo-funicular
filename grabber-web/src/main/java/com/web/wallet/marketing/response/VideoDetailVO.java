/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.response;

import com.web.wallet.common.model.BaseVO;


/**
 * @author wuxianxin
 * @version VideoDetailVO.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class VideoDetailVO extends BaseVO{

    private static final long serialVersionUID = 175417551652554037L;

    private String videoId;
    private String title;
    private String coverUrl;
    private String playUrl;
    private String authorName;
    private String authorAvatar;
    private int likeCount;
    private int commentCount;
    private int shareCount;
    private int duration;

    /**
     * Getter method for property <tt>serialVersionUID</tt>.
     *
     * @return property value of serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    /**
     * Getter method for property <tt>authorName</tt>.
     *
     * @return property value of authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Setter method for property <tt>authorName</tt>.
     *
     * @param authorName value to be assigned to property authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * Getter method for property <tt>authorAvatar</tt>.
     *
     * @return property value of authorAvatar
     */
    public String getAuthorAvatar() {
        return authorAvatar;
    }

    /**
     * Setter method for property <tt>authorAvatar</tt>.
     *
     * @param authorAvatar value to be assigned to property authorAvatar
     */
    public void setAuthorAvatar(String authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    /**
     * Getter method for property <tt>likeCount</tt>.
     *
     * @return property value of likeCount
     */
    public int getLikeCount() {
        return likeCount;
    }

    /**
     * Setter method for property <tt>likeCount</tt>.
     *
     * @param likeCount value to be assigned to property likeCount
     */
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * Getter method for property <tt>commentCount</tt>.
     *
     * @return property value of commentCount
     */
    public int getCommentCount() {
        return commentCount;
    }

    /**
     * Setter method for property <tt>commentCount</tt>.
     *
     * @param commentCount value to be assigned to property commentCount
     */
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * Getter method for property <tt>shareCount</tt>.
     *
     * @return property value of shareCount
     */
    public int getShareCount() {
        return shareCount;
    }

    /**
     * Setter method for property <tt>shareCount</tt>.
     *
     * @param shareCount value to be assigned to property shareCount
     */
    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * Getter method for property <tt>duration</tt>.
     *
     * @return property value of duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Setter method for property <tt>duration</tt>.
     *
     * @param duration value to be assigned to property duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
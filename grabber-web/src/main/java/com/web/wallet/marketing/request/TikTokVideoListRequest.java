/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.request;

import com.web.wallet.common.model.BasePageRequest;

/**
 * @author wuxianxin
 * @version TikTokVideoListRequest.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public class TikTokVideoListRequest extends BasePageRequest {
    private static final long serialVersionUID = -200310087015042297L;

    /**
     * 主題
     */
    private String topic;

    /**
     * 地区
     */
    private String region;

    /**
     * 性別
     */
    private String gender;

    /**
     * 年齡
     */
    private int age;

    /**
     * Getter method for property <tt>serialVersionUID</tt>.
     *
     * @return property value of serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for property <tt>topic</tt>.
     *
     * @return property value of topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Setter method for property <tt>topic</tt>.
     *
     * @param topic value to be assigned to property topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Getter method for property <tt>region</tt>.
     *
     * @return property value of region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Setter method for property <tt>region</tt>.
     *
     * @param region value to be assigned to property region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     *
     * @return property value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

}
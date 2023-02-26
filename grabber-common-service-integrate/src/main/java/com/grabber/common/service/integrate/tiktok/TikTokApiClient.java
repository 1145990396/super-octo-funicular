/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.tiktok;


/**
 * @author wuxianxin
 * @version TikTokApilient.java, v 0.1 2023年02月23日 Administrator Exp $
 */
public interface TikTokApiClient {

    String queryVideoList(String topic, String region, String gender, int age, int page, int count);

    String queryVideoDetail(String videoId);

}
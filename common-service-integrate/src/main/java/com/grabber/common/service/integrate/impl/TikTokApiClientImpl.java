/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.impl;

import com.grabber.common.service.integrate.TikTokApiClient;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;

/**
 * @author wuxianxin
 * @version TikTokApiClientImpl.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@Component
public class TikTokApiClientImpl implements TikTokApiClient {

    private OkHttpClient httpClient = new OkHttpClient();

    private String listApiUrl;

    private String detailApiUrl;

    @Override
    public String queryVideoList(String topic, String region, String gender, int age, int page, int count) {
        String videoList = null;
        try {
            HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(listApiUrl)).newBuilder();
            urlBuilder.addQueryParameter("topic", topic);
            urlBuilder.addQueryParameter("region", region);
            urlBuilder.addQueryParameter("gender", gender);
            urlBuilder.addQueryParameter("age", String.valueOf(age));
            urlBuilder.addQueryParameter("page", String.valueOf(page));
            urlBuilder.addQueryParameter("count", String.valueOf(count));
            Request request = new Request.Builder()
                    .url(urlBuilder.build().toString())
                    .build();
            Response response = httpClient.newCall(request).execute();
            videoList = Objects.requireNonNull(response.body()).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return videoList;
    }

    @Override
    public String queryVideoDetail(String videoId){
        String videoDetail = null;
        try {
            HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(detailApiUrl)).newBuilder();
            urlBuilder.addQueryParameter("video_id", videoId);
            Request request = new Request.Builder()
                    .url(urlBuilder.build().toString())
                    .build();
            Response response = httpClient.newCall(request).execute();
            videoDetail = Objects.requireNonNull(response.body()).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return videoDetail;
    }

    /**
     * Setter method for property <tt>listApiUrl</tt>.
     *
     * @param listApiUrl value to be assigned to property listApiUrl
     */
    public void setListApiUrl(String listApiUrl) {
        this.listApiUrl = listApiUrl;
    }

    /**
     * Setter method for property <tt>detailApiUrl</tt>.
     *
     * @param detailApiUrl value to be assigned to property detailApiUrl
     */
    public void setDetailApiUrl(String detailApiUrl) {
        this.detailApiUrl = detailApiUrl;
    }
}
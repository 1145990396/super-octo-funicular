/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grabber.common.service.integrate.TikTokApiClient;
import com.web.wallet.common.model.CommonPageResult;
import com.web.wallet.common.template.WalletBizProcessor;
import com.web.wallet.marketing.request.TikTokVideoListRequest;
import com.web.wallet.marketing.response.TikTokVideoListVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wuxianxin
 * @version QueryVideoListProcessor.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@Service
public class QueryVideoListProcessor extends BaseProcessor implements WalletBizProcessor<TikTokVideoListRequest, CommonPageResult<TikTokVideoListVO>> {

    @Resource
    private TikTokApiClient tikTokApiClient;

    @Override
    public void process(TikTokVideoListRequest request, CommonPageResult<TikTokVideoListVO> result, HttpServletRequest httpServletRequest, Object... inputParams) {

        String response  = tikTokApiClient.queryVideoList(request.getTopic(), request.getRegion(), request.getGender(), request.getAge(), request.getPageSize(), request.getPageNum());
        // 解析JSON字符串，将结果转换成VideoListResponse对象
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(response);
            int totalCount = rootNode.path("total_count").asInt();
            int pageCount = rootNode.path("page_count").asInt();
            List<TikTokVideoListVO> videoList = new ArrayList<>();
            JsonNode itemListNode = rootNode.path("aweme_list");
            if (itemListNode.isArray()) {
                for (JsonNode itemNode : itemListNode) {
                    String videoId = itemNode.path("aweme_id").asText();
                    String title = itemNode.path("desc").asText();
                    String coverUrl = itemNode.path("video").path("cover").path("url_list").get(0).asText();
                    String playUrl = itemNode.path("video").path("play_addr").path("url_list").get(0).asText();
                    TikTokVideoListVO videoItem = new TikTokVideoListVO(videoId, title, coverUrl, playUrl);
                    videoList.add(videoItem);
                }
            }

            result.setData(videoList);
            result.setTotalCount(totalCount);
            result.setPageCount(pageCount);
            result.setPageSize(request.getPageSize());
            result.setCurrentPage(request.getPageNum());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
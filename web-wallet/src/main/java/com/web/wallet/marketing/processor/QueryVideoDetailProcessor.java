/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grabber.common.service.integrate.TikTokApiClient;
import com.web.wallet.common.model.CommonResult;
import com.web.wallet.common.template.WalletBizProcessor;
import com.web.wallet.marketing.request.TikTokVideoDetailRequest;
import com.web.wallet.marketing.response.VideoDetailVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author wuxianxin
 * @version QueryVideoDetailProcessor.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@Service
public class QueryVideoDetailProcessor extends BaseProcessor implements WalletBizProcessor<TikTokVideoDetailRequest, CommonResult<VideoDetailVO>> {

    @Resource
    private TikTokApiClient tikTokApiClient;

    @Override
    public void process(TikTokVideoDetailRequest request, CommonResult<VideoDetailVO> result, HttpServletRequest httpServletRequest, Object... inputParams) {
        String response = tikTokApiClient.queryVideoDetail(request.getVideoId());
        // 解析JSON字符串，将结果转换成VideoDetailResponse对象
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = objectMapper.readTree(response);
            JsonNode videoNode = rootNode.path("aweme_detail").path("video");
            String title = rootNode.path("aweme_detail").path("desc").asText();
            String coverUrl = videoNode.path("cover").path("url_list").get(0).asText();
            String playUrl = videoNode.path("play_addr").path("url_list").get(0).asText();
            String authorName = rootNode.path("aweme_detail").path("author").path("nickname").asText();
            String authorAvatar = rootNode.path("aweme_detail").path("author").path("avatar_larger").asText();

            VideoDetailVO videoDetailVO = new VideoDetailVO();
            videoDetailVO.setTitle(title);
            videoDetailVO.setCoverUrl(coverUrl);
            videoDetailVO.setPlayUrl(playUrl);
            videoDetailVO.setAuthorName(authorName);
            videoDetailVO.setAuthorAvatar(authorAvatar);
            result.setData(videoDetailVO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.controller;


import com.grabber.common.service.integrate.aspect.RdsCaptcha;
import com.web.wallet.common.enums.BizTypeEnum;
import com.web.wallet.common.model.CommonResult;
import com.web.wallet.marketing.request.TikTokVideoDetailRequest;
import com.web.wallet.marketing.request.TikTokVideoListRequest;
import com.web.wallet.marketing.response.TikTokVideoListVO;
import com.web.wallet.common.model.CommonPageResult;
import com.web.wallet.common.template.RestBaseController;
import com.web.wallet.marketing.response.VideoDetailVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wuxianxin
 * @version TikTokController.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@RestController
@RequestMapping(value = "api/v1/marking/tiktok")
public class TikTokController extends RestBaseController {

    @RdsCaptcha
    @GetMapping(value = "videList")
    public CommonPageResult<TikTokVideoListVO> getVideoList(HttpServletRequest request, TikTokVideoListRequest tikTokVideoListRequest) {

        return this.process(BizTypeEnum.TIKTOK_VIDEO_LIST, tikTokVideoListRequest, new CommonPageResult<>(), request, request);
    }

    @GetMapping(value = "videDetail")
    public CommonResult<VideoDetailVO> getVideoDetail(HttpServletRequest request, TikTokVideoDetailRequest tikTokVideoDetailRequest) {

        return this.process(BizTypeEnum.TIKTOK_VIDEO_DETAIL, tikTokVideoDetailRequest, new CommonResult<>(), request, request);
    }

    @GetMapping(value = "downloadVideo")
    public void downloadVideo(HttpServletRequest request, @PathVariable String downloadUrl) {

        this.process(BizTypeEnum.TIKTOK_VIDEO_DOWNLOAD, null, new CommonResult<>(), request, downloadUrl);
    }
}
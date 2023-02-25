/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.web.wallet.marketing.processor;

import com.web.wallet.common.model.BaseRequest;
import com.web.wallet.common.model.CommonResult;
import com.web.wallet.common.template.WalletBizProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author wuxianxin
 * @version QueryVideoDownloadProcessor.java, v 0.1 2023年02月23日 Administrator Exp $
 */
@Service
public class QueryVideoDownloadProcessor extends BaseProcessor implements WalletBizProcessor<BaseRequest, CommonResult<Object>> {

    private final static Logger LOGGER = LoggerFactory.getLogger(QueryVideoDownloadProcessor.class);

    @Override
    public void process(BaseRequest request, CommonResult<Object> result, HttpServletRequest httpServletRequest, Object... inputParams) {
        String videoUrl = (String)inputParams[0];
        try {
            URL url = new URL(videoUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            // 判断HTTP响应码是否为200
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 获取文件名
                String disposition = conn.getHeaderField("Content-Disposition");
                String fileName = "";
                if (disposition != null) {
                    int index = disposition.indexOf("filename=");
                    if (index > 0) {
                        fileName = disposition.substring(index + 10, disposition.length() - 1);
                    }
                }

                // 获取文件类型
                String contentType = conn.getContentType();

                // 获取文件大小
                int contentLength = conn.getContentLength();

                // 输出文件信息
                System.out.println("文件名：" + fileName);
                System.out.println("文件类型：" + contentType);
                System.out.println("文件大小：" + contentLength);

                // 使用浏览器默认下载路径下载文件
                String saveFilePath = System.getProperty("user.home") + "/Downloads/" + fileName;
                InputStream inputStream = conn.getInputStream();
                FileOutputStream outputStream = new FileOutputStream(saveFilePath);

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();
                inputStream.close();
                LOGGER.info("文件已下载至：" + saveFilePath);
            } else {
                LOGGER.error("无法下载该视频：" + videoUrl);
            }
        } catch (IOException e) {
            LOGGER.error("无法下载该视频：" + videoUrl);
        }

    }
}
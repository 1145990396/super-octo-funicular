/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.shiny.impl;

import com.grabber.common.service.integrate.shiny.UserServiceClient;
import com.shiny.common.service.facade.api.User.UserService;
import com.shiny.common.service.facade.request.UserQueryRequest;
import com.shiny.common.service.facade.result.UserQueryResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wuxianxin
 * @version UserServiceClient.java, v 0.1 2023年02月26日 Administrator Exp $
 */
@Component
public class UserServiceClientImpl implements UserServiceClient {

    @Resource
    private UserService userService;

    @Override
    public UserQueryResult query(UserQueryRequest request) {
        return userService.query(request);
    }

}
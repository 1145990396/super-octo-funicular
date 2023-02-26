/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.shiny.impl;

import com.grabber.common.service.integrate.shiny.UserServiceClient;
import com.shiny.common.service.facade.api.User.UserServiceFacade;
import com.shiny.common.service.facade.request.UserQueryRequest;
import com.shiny.common.service.facade.result.UserQueryResult;

import javax.annotation.Resource;

/**
 * @author wuxianxin
 * @version UserServiceClient.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class UserServiceClientImpl implements UserServiceClient {

    @Resource
    private UserServiceFacade userServiceFacade;

    @Override
    public UserQueryResult query(UserQueryRequest request) {
        return userServiceFacade.query(request);
    }

}
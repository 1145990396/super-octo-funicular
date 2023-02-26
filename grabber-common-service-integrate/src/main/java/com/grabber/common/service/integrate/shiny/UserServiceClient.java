/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.shiny;

import com.shiny.common.service.facade.request.UserQueryRequest;
import com.shiny.common.service.facade.result.UserQueryResult;

/**
 * @author wuxianxin
 * @version UserServiceClient.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public interface UserServiceClient {


    UserQueryResult query(UserQueryRequest request);
}
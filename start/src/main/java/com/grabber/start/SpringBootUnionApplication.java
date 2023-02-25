/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wuxianxin
 * @version SpringBootUnionApplication.java, v 0.1 2023年02月25日 Administrator Exp $
 */
@SpringBootApplication
@ImportResource(locations = {"classpath*:META-INF/spring/*.xml"})
public class SpringBootUnionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUnionApplication.class, args);
    }

}
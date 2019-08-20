package com.ims.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ims.dubbo.api.service.ServiceApi;
import org.springframework.stereotype.Component;

/**
 * Created by xianpeng.xia
 * on 2019-08-21 00:06
 */
@Component
public class QuickstartConsumer {

    @Reference(url = "dubbo://localhost:20880")
    ServiceApi serviceApi;

    public void sendMessage(String msg) {
        System.out.println(serviceApi.sendMessage(msg));
    }
}

package com.ims.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.ims.dubbo.api.service.ServiceApi;
import org.springframework.stereotype.Component;

/**
 * Created by xianpeng.xia
 * on 2019-08-20 23:51
 */
@Component
@Service(interfaceClass = ServiceApi.class)
public class QuickstartServiceImpl implements ServiceApi {

    @Override
    public String sendMessage(String msg) {
        return "quick start service message: " + msg;
    }
}

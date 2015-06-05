package com.otw1248.ppp.dict.config;

import com.otw1248.ppp.dict.d.Constants;
import com.otw1248.ppp.dict.s.NCService;
import com.otw1248.ppp.dict.s.impl.NCServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * Created by Stephen Xianwei Zhang on 6/4/2015.
 */
@Configuration
@ComponentScan(basePackages = {"com.otw1248.ppp.dict"})
@PropertySource("classpath:/app.properties")
public class RootConfig {

    @Autowired
    Environment env;

    @Bean
    public NCService ncService() {
        return new NCServiceImpl();
    }

    @Bean
    @Profile("dev")
    public Constants devC() {
        Constants constants = new Constants();
        setConstants(constants);
        return constants;
    }

    @Bean
    @Profile("prd")
    public Constants prdC() {
        Constants constants = new Constants();
        setConstants(constants);
        constants.setToken(env.getProperty("token"));
        constants.setEncrypt(env.getProperty("encrypt"));
        constants.setTuling123apikey(env.getProperty("tuling123apikey"));
        return constants;
    }

    private void setConstants(Constants constants) {
        constants.setAppname(env.getProperty("appname"));
        constants.setImgPath(env.getProperty("imgPath"));
        constants.setDictwxpBig(env.getProperty("dictwxpBig"));
        constants.setWxDefaultResponseNotice(env.getProperty("wxDefaultResponseNotice"));
        constants.setDefaultResponseNotice(env.getProperty("defaultResponseNotice"));
        constants.setWxArticleMaxCounts(Integer.parseInt(env.getProperty("wx.article.max.counts")));
    }
}

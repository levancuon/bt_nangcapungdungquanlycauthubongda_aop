package org.example.bt_nangcapungdungquanlycauthubongda_aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @After("execution(* org.example.bt_nangcapungdungquanlycauthubongda_aop.service.impl.PlayerService.save()")
    public void logBorrow() {
        logger.info("Một cầu thủ được thêm mới");
    }

    @After("execution(* org.example.bt_nangcapungdungquanlycauthubongda_aop.service.impl.PlayerService.remove()")
    public void logReturn() {
        logger.info(" Một cầu thủ bị xóa");
    }
}

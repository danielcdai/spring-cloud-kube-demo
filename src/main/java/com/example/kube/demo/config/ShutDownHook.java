package com.example.kube.demo.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@SuppressWarnings({"UnusedDeclaration"})
public class ShutDownHook {

    private final static Logger LOGGER = LogManager.getLogger(ShutDownHook.class);

    @PreDestroy
    public void destroy() {
        LOGGER.info("Gracefully shutdown KUBE-DEMO...");
    }
}

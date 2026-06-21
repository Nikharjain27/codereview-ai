package com.codereview.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import jakarta.annotation.PostConstruct;

@Slf4j
@Component
public class RequestLoggingFilter implements GlobalFilter, Ordered {

 

        @PostConstruct
        public void init() {
            log.info("RequestLoggingFilter Loaded");
        }

    @Override
    public Mono<Void> filter(
            org.springframework.web.server.ServerWebExchange exchange,
            org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {

        String correlationId =
        exchange.getRequest()
                .getHeaders()
                .getFirst("X-Correlation-Id");

        log.info(
                "CorrelationId={} Method={} Path={}",
                correlationId,
                exchange.getRequest().getMethod(),
                exchange.getRequest().getURI()
        );

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
package org.example.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.example.common.utils.GsonUtil;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created by myy on 2021/11/12.
 */
@Slf4j
@Component
public class GlobalCacheRequestBodyFilter  implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        log.info("url: {}",request.getURI());
        log.info("method: {}",request.getMethod());

        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
//        return response.setComplete();

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

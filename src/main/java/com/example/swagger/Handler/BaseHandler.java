package com.example.swagger.Handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public abstract class BaseHandler {
    protected abstract Mono<ServerResponse> apply (ServerRequest serverRequest);

    public Mono<ServerResponse> handle(ServerRequest serverRequest) {
        return this.apply(serverRequest);
    }
}

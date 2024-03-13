package com.example.swagger.Handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GetNameHandler extends BaseHandler{
    @Override
    protected Mono<ServerResponse> apply(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue("Name API is called");
    }

    // Since handle function is present in the BaseHandler class so it is not able to detect but it should

    // Uncommenting below code will work as expected since now explicitly handle is declared here

//    @Override
//    public Mono<ServerResponse> handle(ServerRequest serverRequest) {
//        return super.handle(serverRequest);
//    }
}

//package com.example.appy.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableSimpleBroker("/topic"); // 클라이언트가 구독할 prefix
//        config.setApplicationDestinationPrefixes("/app"); // 서버로 메시지 보낼 때 prefix
//    }
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/ws") // WebSocket 엔드포인트
//                .withSockJS(); // 브라우저 호환성을 위한 SockJS 지원
//    }
//}

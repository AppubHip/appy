package com.example.appy.controller;

import com.example.appy.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appy.vo.messageVO;
import com.example.appy.vo.responseVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private final MessageService messageService;

    @PostMapping("/message")
    public responseVO processMessage(@RequestBody messageVO messageVO) {
        log.warn("get processMessage!!! >>> {}", messageVO);
        responseVO response = new responseVO();

        try {
            messageService.saveMessage(messageVO);
            response.setStatus("success");
            response.setReason(null);

        } catch (Exception e) {
            log.error("processMessage error", e);
            response.setStatus("error");
            response.setReason(e.getMessage());
        }

        return response;
    }
}

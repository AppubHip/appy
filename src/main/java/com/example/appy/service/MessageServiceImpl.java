package com.example.appy.service;

import com.example.appy.vo.messageVO;
import com.example.appy.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageMapper messageMapper;

//    private final SimpMessagingTemplate messagingTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void saveMessage(messageVO messageVO) {
        messageMapper.insertMessage(messageVO);

//        messagingTemplate.convertAndSend("/topic/messages", messageVO);
    }
}

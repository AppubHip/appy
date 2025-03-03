package com.example.appy.mapper;

import com.example.appy.vo.messageVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    void insertMessage(messageVO message);
}

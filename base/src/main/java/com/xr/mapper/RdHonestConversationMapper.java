package com.xr.mapper;

import com.xr.entity.RdHonestConversation;

public interface RdHonestConversationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdHonestConversation record);

    int insertSelective(RdHonestConversation record);

    RdHonestConversation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdHonestConversation record);

    int updateByPrimaryKeyWithBLOBs(RdHonestConversation record);

    int updateByPrimaryKey(RdHonestConversation record);
}
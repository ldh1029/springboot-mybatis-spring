package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.example.demo.vo.resp.VoWrapOrderResp;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUserByIn(List<Integer> ids);

    VoWrapOrderResp findOrderById(int id);

    User findById(int id);

    List<User> selectVagueUser(String username);
}
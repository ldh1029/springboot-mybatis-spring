package com.example.demo.service.impl;

import com.example.demo.core.VoBaseResp;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.vo.resp.VoUserListResp;
import com.example.demo.vo.resp.VoWrapOrderResp;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by ldh on 2018/6/18.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseEntity<VoUserListResp> listUser(int id) {
//        User user = userMapper.selectByPrimaryKey(1);
        User user = userMapper.findById(id);
        List<User> userList = Lists.newArrayList();
        if (ObjectUtils.isEmpty(user)) {
            log.info("查询用户失败");
            return ResponseEntity.badRequest().body(VoBaseResp.error(VoBaseResp.ERROR, "查询用户失败", VoUserListResp.class));
        }
        userList.add(user);
        VoUserListResp userListResp = VoBaseResp.ok("查询成功", VoUserListResp.class);
        userListResp.setList(userList);
        return ResponseEntity.ok(userListResp);
    }

    public ResponseEntity<VoBaseResp> insertUser() {
        User user = new User();
        user.setUsername("563770183");
        user.setPassword("123456");
        int insert = userMapper.insert(user);
        if (insert != 0) {
            log.info("添加用户成功!");
            return ResponseEntity.ok(VoBaseResp.ok("添加成功", VoBaseResp.class));
        } else {
            log.info("添加用户失败");
            return ResponseEntity.badRequest().body(VoBaseResp.error(VoBaseResp.ERROR, "添加用户失败", VoBaseResp.class));
        }
    }

    @Override
    public ResponseEntity<VoBaseResp> deleteUser(int id) {
        int result = userMapper.deleteByPrimaryKey(id);
        if (result != 0) {
            log.info("删除用户成功");
            return ResponseEntity.ok(VoBaseResp.ok("添加成功", VoBaseResp.class));
        } else {
            log.info("删除用户失败");
            return ResponseEntity.badRequest().body(VoBaseResp.error(VoBaseResp.ERROR, "添加用户失败", VoBaseResp.class));
        }
    }

    @Override
    public ResponseEntity<VoUserListResp> vagueUser(String username) {
        List<User> userList = userMapper.selectVagueUser(username);
        VoUserListResp voUserListResp = VoUserListResp.ok("查询成功", VoUserListResp.class);
        voUserListResp.setList(userList);
        return ResponseEntity.ok(voUserListResp);
    }

    @Override
    public ResponseEntity<VoUserListResp> findByIn() {
        List<Integer> ids = Lists.newArrayList();
        ids.add(1);
        ids.add(3);
        List<User> userList = userMapper.findUserByIn(ids);
        VoUserListResp voUserListResp = VoUserListResp.ok("查询成功", VoUserListResp.class);
        voUserListResp.setList(userList);
        return ResponseEntity.ok(voUserListResp);
    }

    @Override
    public ResponseEntity<VoWrapOrderResp> listOrderDetail(int id) {
        VoWrapOrderResp voWrapOrderResp;
        voWrapOrderResp = userMapper.findOrderById(id);
        log.info(voWrapOrderResp.getUsername());
        return ResponseEntity.ok(voWrapOrderResp);
    }
}

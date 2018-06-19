package com.example.demo.service;

import com.example.demo.core.VoBaseResp;
import com.example.demo.vo.resp.VoUserListResp;
import com.example.demo.vo.resp.VoWrapOrderResp;
import org.springframework.http.ResponseEntity;

/**
 * Created by ldh on 2018/6/18.
 */
public interface UserService {
    /**
     * 查找用户
     * @return
     * @param id
     */
    public ResponseEntity<VoUserListResp> listUser(int id);

    /**
     * 添加用户
     * @return
     */
    ResponseEntity<VoBaseResp> insertUser();

    /**
     * 删除用户
     * @param id
     * @return
     */
    ResponseEntity<VoBaseResp> deleteUser(int id);

    /**
     * 模糊查询用户
     * @param username
     * @return
     */
    ResponseEntity<VoUserListResp> vagueUser(String username);

    /**
     * 查询一定范围用户
     * @return
     */
    ResponseEntity<VoUserListResp> findByIn();

    /**
     * 根据用户ID查询订单信息
     * @param id
     * @return
     */
    ResponseEntity<VoWrapOrderResp> listOrderDetail(int id);
}

package com.example.demo.controller;

import com.example.demo.core.VoBaseResp;
import com.example.demo.service.UserService;
import com.example.demo.vo.resp.VoUserListResp;
import com.example.demo.vo.resp.VoWrapOrderResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ldh on 2018/6/18.
 */
@RestController
@RequestMapping("/index")
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping("/hello")
    public String index(){
        return "hello";
    }

    @GetMapping("/listUser/{id}")
    public ResponseEntity<VoUserListResp> listUser(@PathVariable(value = "id") int id){
        return userService.listUser(id);
    }

    @GetMapping("/listVagueUser/{username}")
    public ResponseEntity<VoUserListResp> vagueUser(@PathVariable(value = "username") String username){
        return userService.vagueUser(username);
    }

    @GetMapping("/insertUser")
    public ResponseEntity<VoBaseResp> insertUser(){
        return userService.insertUser();
    }

    @GetMapping("deleteUser/{id}")
    public ResponseEntity<VoBaseResp> deleteUser(@PathVariable(value = "id") int id){
        return userService.deleteUser(id);
    }

    @GetMapping("/listByIn")
    public ResponseEntity<VoUserListResp> listUserByIn(){
        return userService.findByIn();
    }

    @GetMapping("/listOrderDetail/{id}")
    public ResponseEntity<VoWrapOrderResp> listOrderDetail(@PathVariable("id") int id){
        return userService.listOrderDetail(id);
    }
}

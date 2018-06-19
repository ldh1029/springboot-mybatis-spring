package com.example.demo.vo.resp;

import com.example.demo.core.VoBaseResp;
import com.example.demo.entity.Orders;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * Created by ldh on 2018/6/19.
 */
@Data
public class VoWrapOrderResp extends VoBaseResp {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private List<Orders> ordersList = Lists.newArrayList();
}

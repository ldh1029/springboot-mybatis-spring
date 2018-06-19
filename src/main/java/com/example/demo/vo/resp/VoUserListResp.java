package com.example.demo.vo.resp;

import com.example.demo.core.VoBaseResp;
import com.example.demo.entity.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldh on 2018/6/18.
 */
@Data
public class VoUserListResp extends VoBaseResp {
    private List<User> list = new ArrayList<>();
}

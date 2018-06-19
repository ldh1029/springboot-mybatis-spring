package com.example.demo.core;

import com.example.demo.helper.DateHelper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Max on 17/5/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class VoBaseResp implements Serializable {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class State {
        private long code ;
        private String msg ;
        private String time ;
    }

    /**
     * 返回信息
     */
    private State state;

    public static final long OK = 0;
    public static final long ERROR = 1;
    public static final long RELOGIN = 5;

    public static VoBaseResp ok(String msg){
        return ok(msg, VoBaseResp.class);
    }

    public static <T extends VoBaseResp> T ok(String msg, Class<T> clazz){
        State state =  new State(OK, msg, DateHelper.dateToString(new Date()));
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (Throwable e) {
            log.error("VoBaseResp ok init exception" , e);
            throw new RuntimeException(e) ;
        }
        t.setState(state);
        return t ;
    }


    public static VoBaseResp  error(long code, String msg ){
         return error(code, msg, VoBaseResp.class) ;
    }


    public static <T extends VoBaseResp> T error(long code, String msg, Class<T> clazz){
        State state =  new State(code, msg, DateHelper.dateToString(new Date()));
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (Throwable e) {
            log.error("VoBaseResp error init exception" , e);
            throw new RuntimeException(e) ;
        }

        t.setState(state);
        return t ;
    }
}

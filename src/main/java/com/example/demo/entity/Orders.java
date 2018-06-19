package com.example.demo.entity;

public class Orders {
    private Integer oid;

    private Integer uid;

    private String oname;

    private String address;

    private String ocoment;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOcoment() {
        return ocoment;
    }

    public void setOcoment(String ocoment) {
        this.ocoment = ocoment == null ? null : ocoment.trim();
    }
}
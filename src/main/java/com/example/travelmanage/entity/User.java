package com.example.travelmanage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/*
 * @Time 2021-06-23 21:04
 * @Author huangshaowu
 *
 */
@TableName("emp")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableId(value = "eid")
    private String eid;

    /**
     * 职务id
     */
    @TableField(value = "lid")
    private String lid;

    /**
     * 部门id
     */
    @TableField(value = "did")
    private Long did;

    /**
     * 员工姓名
     */
    @TableField(value = "ename")
    private String ename;

    /**
     * 薪资
     */
    @TableField(value = "sal")
    private Double sal;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 登陆密码
     */
    @TableField(value = "password")
    @JsonIgnore
    private String password;

    /**
     * 相片
     */
    @TableField(value = "photo")
    private String photo;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;

    /**
     * 入职日期
     */
    @TableField(value = "hiredate")
    @JsonFormat(locale = "yyyy-MM-dd HH:mm:ss")
    private Date hiredate;

    /**
     * ineid
     */
    @TableField(value = "ineid")
    private String ineid;

    /**
     * 员工编号
     */
    @TableField(value = "enum")
    private String eNum;

    /**
     * locked = 0 正常 locked = 1 锁定 locked = 2 停用
     */
    @TableField(value = "locked")
    private Integer locked;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getIneid() {
        return ineid;
    }

    public void setIneid(String ineid) {
        this.ineid = ineid;
    }

    public String geteNum() {
        return eNum;
    }

    public void seteNum(String eNum) {
        this.eNum = eNum;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}

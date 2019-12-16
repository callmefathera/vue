package com.by.entity;

import java.io.Serializable;

/**
 * (TStu)实体类
 *
 * @author makejava
 * @since 2019-12-12 20:53:02
 */
public class TStu implements Serializable {
    private static final long serialVersionUID = 230392846261424292L;
    
    private Integer stuId;
    
    private String stuName;
    
    private Integer stuAge;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

}
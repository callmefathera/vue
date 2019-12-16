package com.by.controller;

import com.by.entity.TStu;
import com.by.service.TStuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TStu)表控制层
 *
 * @author makejava
 * @since 2019-12-12 20:53:02
 */
@Controller
@RequestMapping("aaa")
public class TStuController {
    /**
     * 服务对象
     */
    @Resource
    private TStuService tStuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TStu selectOne(Integer id) {
        return this.tStuService.queryById(id);
    }

    @RequestMapping("bb")
    public  String bb(){
        return "bb";
    }
    @RequestMapping("aa")
    public  String aa(){
        return "aa";
    }
    @RequestMapping("findAll")
    @ResponseBody
    public List<TStu> findAll(){
        List<TStu> tStus = tStuService.queryAllByLimit(0, 10000);
        return tStus;
    }
    @ResponseBody
    @RequestMapping("delete")
    public String delete( Integer id){
        tStuService.deleteById(id);
        return "success";
    }
    @ResponseBody
    @RequestMapping("add")
    public String add(TStu stu){
        tStuService.insert(stu);
        return "success";
    }
    @ResponseBody
    @RequestMapping("update")
    public String update(TStu stu){
        tStuService.update(stu);
        return "success";
    }



}
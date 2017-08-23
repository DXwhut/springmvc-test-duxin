package com.duxin.controller;

import com.duxin.annotation.*;
import com.duxin.service.impl.MyService;
import com.duxin.service.impl.SpringmvcService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by duxin on 2017/8/23.
 */
@Controller("duxin")
public class SpringmvcController {
    @Quatifier("MyServiceImpl")
    MyService myService;
    @Quatifier("SpringmvcServiceImpl")
    SpringmvcService smService;

    public void test(){
        System.out.println(myService);
    }

    @RequestMapping("insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        smService.insert(null);
        return null;
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        smService.delete(null);
        return null;
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        smService.update(null);
        return null;
    }

    @RequestMapping("select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        smService.select(null);
        return null;
    }
}


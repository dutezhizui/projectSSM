package com.seed.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 视图控制器,返回jsp视图给前端
 *
 * @author StarZou
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {

        System.out.println("userName=");
        return "index";
    }
    @RequestMapping("/customers")
    @ResponseBody
    @CrossOrigin
    public Object getCustomer(@RequestParam("page") int page,@RequestParam("size") int size){
        List list=new ArrayList();
        for (int i=0;i<15;i++){
            CustomerEntity customerEntity=new CustomerEntity(i,"yky","yy","yky","yy","15989510269","yy"
                    ,"Shenzhen","Guangdong","0001","China");
            list.add(customerEntity);
        }
        PageData pageData=new PageData();
        if (page==0){
            List listSub=new ArrayList();
            for (int i=0;i<size;i++)
                listSub.add(list.get(i));
            pageData.setItems(listSub);
            pageData.setLast(false);
            pageData.setCurrentPageNumber(1);
        }else {
            List listSub=new ArrayList();
            for (int i=page*size;i<size;i++)
                listSub.add(list.get(i));
            pageData.setItems(listSub);
            pageData.setLast(true);
            pageData.setCurrentPageNumber(page);
        }


        return pageData;
    }

    @RequestMapping("/delCustomers")
    @ResponseBody
    @CrossOrigin
    public Object delCustomer(HttpServletRequest request){

        List list=new ArrayList();
        for (int i=0;i<15;i++){
            CustomerEntity customerEntity=new CustomerEntity(i,"yky","yy","yky","yy","15989510269","yy"
                    ,"Shenzhen","Guangdong","0001","China");
            list.add(customerEntity);
        }
        PageData pageData=new PageData();
        pageData.setCurrentPageNumber(1);
        pageData.setLast(false);
        pageData.setItems(list);


        return pageData;
    }
    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}
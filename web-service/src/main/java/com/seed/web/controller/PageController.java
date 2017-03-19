package com.seed.web.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.seed.domain.po.Result;
import com.seed.web.model.Permission;
import com.seed.web.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Result getResult(@RequestParam(value = "test",defaultValue = "1") Long test, HttpServletRequest request){
        Result result=new Result();
        List list=permissionService.selectPermissionsByRoleId(1L);
        Permission permission=new Permission();
        permission.setPageNum(1);
        permission.setPageSize(2);
        List listPage=permissionService.selectByPage(permission);
        PageInfo pageInfo=new PageInfo(list);
        result.setStatusCode(0);
        result.setMessage("select success");
        result.setData(pageInfo);

        return result;
    }

}
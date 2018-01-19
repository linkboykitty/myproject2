package com.linkboy.myproject.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Title: LoginController</p>
 * <p>Description: </p>
 *
 * @author Linkboy
 * @version 1.0.0
 * @date 2018/1/18 18:21
 */
@Controller
public class LoginController {
    @RequestMapping(value = {"login", ""}, method = RequestMethod.GET)
    public String login() {


        return "modules/sys/login";
    }
}

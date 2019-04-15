package com.jilinwula.springcloud.zuul.handler;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ErrorHandler implements ErrorController {

    @RequestMapping(value = "/error")
    public Object error(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", -1);
        map.put("msg", "系统异常");
        return map;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

package com.bbs.domitory.controller;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    private static Logger LOG = Logger.getLogger(IndexController.class);

    @RequestMapping("/{page}")
    public String toPage(@PathVariable @Param("page")  String page) {
        LOG.info("________________________请求进来了,请求的页面是"+page+"_______________________");
        return page;
    }
}

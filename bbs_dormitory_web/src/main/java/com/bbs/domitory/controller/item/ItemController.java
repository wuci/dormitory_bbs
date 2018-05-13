package com.bbs.domitory.controller.item;

import com.bbs.domitory.pojo.TbItem;
import com.bbs.domitory.service.ItemService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/getItem/{itemId}", method = RequestMethod.GET)
    @ResponseBody
    public TbItem getTbItemById(@PathVariable @Param("itemId") Long itemId) {

        return itemService.getItemById(itemId);
    }
}

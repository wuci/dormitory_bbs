package com.bbs.domitory.controller.item;

import com.bbs.domitory.pojo.TbItem;
import com.bbs.domitory.pojo.common.EasyUiResultParams;
import com.bbs.domitory.service.ItemService;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    private static Logger LOG = Logger.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/getItem/{itemId}", method = RequestMethod.GET)
    @ResponseBody
    public TbItem getTbItemById(@PathVariable @Param("itemId") Long itemId) {

        return itemService.getItemById(itemId);
    }

    @RequestMapping(value = "/getItem/list", method = RequestMethod.GET)
    @ResponseBody
    public EasyUiResultParams getTbItemList(int page, int rows) {
        LOG.info("page>>>>>>>>>>>>>>>>>>>>>:" + page);
        LOG.info("rows>>>>>>>>>>>>>>>>>>>>>>:" + rows);
        return itemService.getItemList(page, rows);
    }

}

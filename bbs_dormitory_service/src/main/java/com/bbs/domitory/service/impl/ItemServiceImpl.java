package com.bbs.domitory.service.impl;

import com.bbs.domitory.dao.TbItemMapper;
import com.bbs.domitory.pojo.TbItem;
import com.bbs.domitory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}

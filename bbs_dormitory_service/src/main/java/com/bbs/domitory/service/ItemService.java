package com.bbs.domitory.service;

import com.bbs.domitory.pojo.TbItem;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
public interface ItemService {
    /**
     * 通过itemId获取Item
     * @param itemId
     * @return
     */
    TbItem getItemById(long itemId);
}

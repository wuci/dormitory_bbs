package com.bbs.domitory.service.impl;

import com.bbs.domitory.dao.TbItemMapper;
import com.bbs.domitory.pojo.TbItem;
import com.bbs.domitory.pojo.TbItemExample;
import com.bbs.domitory.pojo.common.EasyUiResultParams;
import com.bbs.domitory.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    private static Logger LOG = Logger.getLogger(ItemServiceImpl.class);
    @Resource
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EasyUiResultParams getItemList(int page, int rows) {
        //设置分页数
        PageHelper.startPage(page, rows);
        //执行查询
        TbItemExample itemExample = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(itemExample);
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);
        EasyUiResultParams easyUiResultParams = new EasyUiResultParams();
        easyUiResultParams.setRows(tbItems);
        easyUiResultParams.setTotal(pageInfo.getTotal());
        LOG.info("easyUiResultParams>>>>>>>>>>>>>>>>>:" + easyUiResultParams);
        return easyUiResultParams;
    }
}

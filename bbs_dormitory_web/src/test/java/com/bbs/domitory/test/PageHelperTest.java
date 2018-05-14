package com.bbs.domitory.test;

import com.bbs.domitory.dao.TbItemMapper;
import com.bbs.domitory.pojo.TbItem;
import com.bbs.domitory.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
public class PageHelperTest {
    @Test
    public void testPageHelper() {
        PageHelper.startPage(1,10);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/db.xml");
        TbItemMapper tbItemMapper = applicationContext.getBean(TbItemMapper.class);
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        System.out.println("tbItems>>>>>>>>>>>>>>>>>>>>:"+tbItems);
//        PageInfo<TbItem> pageInfo = new PageInfo();
    }
}

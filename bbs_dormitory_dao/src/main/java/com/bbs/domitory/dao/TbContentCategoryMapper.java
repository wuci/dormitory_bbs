package com.bbs.domitory.dao;

import com.bbs.domitory.pojo.TbContentCategory;
import com.bbs.domitory.pojo.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
* @author :wuci
* @date :2018/5/12
* @time :23:37
* @version :V1.0
*/
public interface TbContentCategoryMapper {
    int countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}
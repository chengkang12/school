package com.lenovo.mt.mapper;

import com.lenovo.mt.model.Grade;
import com.lenovo.mt.model.GradeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    long countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    List<Grade> getGradeListClasses();

    List<Grade> getGradeListClassesUseStatement(Map<String,Integer> pamar);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}
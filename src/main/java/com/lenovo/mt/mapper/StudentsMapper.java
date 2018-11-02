package com.lenovo.mt.mapper;

import com.lenovo.mt.model.Students;
import com.lenovo.mt.model.StudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {
    long countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByExample(StudentsExample example);

    Students getStudentsDetail(Integer id);

    Students selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}
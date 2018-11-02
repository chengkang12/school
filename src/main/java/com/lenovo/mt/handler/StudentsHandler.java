package com.lenovo.mt.handler;

import com.lenovo.mt.handler.api.IStudentsHander;
import com.lenovo.mt.mapper.StudentsMapper;
import com.lenovo.mt.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames="students")
@Service
public class StudentsHandler implements IStudentsHander {

    @Autowired
    private StudentsMapper studentsMapper;

    @CacheEvict(value = "#p0")
    @Override
    public Students getAllStudents(Integer id) {
        return studentsMapper.getStudentsDetail(id);
    }
}

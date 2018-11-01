package com.lenovo.mt;

import com.lenovo.mt.mapper.StudentsMapper;
import com.lenovo.mt.model.Students;
import com.lenovo.mt.model.StudentsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolApplicationTests {

    @Autowired
    private StudentsMapper studentsMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLoadStudents() {
        StudentsExample example = new StudentsExample();
        example.setOrderByClause("id desc");
        List<Students> list = studentsMapper.selectByExample(example);
    }

    @Test
    public void testLoadStudentsDetail() {
        StudentsExample example = new StudentsExample();
        example.setOrderByClause("id desc");
        List<Students> list = studentsMapper.selectByExample(example);
    }

}

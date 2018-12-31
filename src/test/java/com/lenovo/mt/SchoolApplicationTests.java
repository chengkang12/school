package com.lenovo.mt;

import com.lenovo.mt.handler.api.IStudentsHander;
import com.lenovo.mt.mapper.ClassesMapper;
import com.lenovo.mt.mapper.GradeMapper;
import com.lenovo.mt.mapper.StudentsMapper;
import com.lenovo.mt.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolApplicationTests {

    @Autowired
    private StudentsMapper studentsMapper;
    @Autowired
    private ClassesMapper classesMapper;
    @Autowired
    private GradeMapper gradeMapper;
    @Autowired
    private IStudentsHander studentsHander;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLoadStudents() {
        StudentsExample example = new StudentsExample();
        example.setOrderByClause("id desc");
        //Students stu = studentsMapper.getStudentsDetail(1);
        List<Students> list = studentsMapper.getList();
    }

    @Test
    public void testLoadStudentsDetail() {
        Students list = studentsMapper.getStudentsDetail(1);
    }

    @Test
    public void testgetGradeListClasses() {
        List<Grade> list = gradeMapper.getGradeListClasses();
    }

    @Test
    public void getGradeListClassesUseStatement() {
        Map<String,Integer> pamar = new HashMap<>();
        pamar.put("gid",1);
        List<Grade> list = gradeMapper.getGradeListClassesUseStatement(pamar);
    }

    @Test
    public void testLoadClassesDetail() {
        ClassesExample example = new ClassesExample();
        example.setOrderByClause("id desc");
        List<Classes> list = classesMapper.selectByExample(example);
    }

    @Test
    public void testCache() {
        Students list = studentsHander.getAllStudents(1);
        Students list2 = studentsHander.getAllStudents(2);
        Students list1 = studentsHander.getAllStudents(1);
    }

}

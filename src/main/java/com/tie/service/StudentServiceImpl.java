package com.tie.service;

import com.tie.mapper.StudentMapper;
import com.tie.mapper.TeacherMapper;
import com.tie.model.PageInfo;
import com.tie.model.Student;
import com.tie.model.Teacher;
import com.tie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {


    @Override
    public PageInfo getStudentPageInfo(String sName, String tName, int pageSize, int pageNumber) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageNumber(pageNumber);
        pageInfo.setPageSize(pageSize);

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        List<Student> students = studentMapper.selectByPageInfo(pageSize, (pageNumber - 1) * pageSize, sName, tName);
        for (Student student : students) {
            int tid = student.getTid();
            Teacher teacher = teacherMapper.selectById(tid);
            student.setTeacher(teacher);
        }
        pageInfo.setList(students);

        int total = studentMapper.selectCountByPageInfo(sName, tName);
        pageInfo.setTotal(total%pageSize==0? total/pageSize : total / pageSize + 1);

        return pageInfo;
    }
}

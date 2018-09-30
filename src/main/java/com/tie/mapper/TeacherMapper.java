package com.tie.mapper;

import com.tie.model.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    Teacher selectById(@Param("id") int id);
}

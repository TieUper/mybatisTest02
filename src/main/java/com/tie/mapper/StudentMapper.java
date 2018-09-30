package com.tie.mapper;

import com.tie.model.PageInfo;
import com.tie.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> selectByPageInfo(@Param("pageSize") int pageSize, @Param("pageNumber") int pageNumber, @Param("sName") String sName, @Param("tName") String tName);

    int selectCountByPageInfo(@Param("sName") String sName, @Param("tName") String tName);
}

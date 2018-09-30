package com.tie.mapper;

import com.tie.model.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {

    List<Log> select();

    List<Log> selectByNo(@Param("inNo") String inNo, @Param("outNo") String outNo);
}

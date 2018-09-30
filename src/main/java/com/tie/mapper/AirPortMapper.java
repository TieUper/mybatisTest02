package com.tie.mapper;

import com.tie.model.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirPortMapper {

    @Select("select * from airport where id in (select distinct takeid from airplane)")
    List<Airport> selectTakePort();

    @Select("select * from airport where id in (select distinct landid from airplane)")
    List<Airport> selectLandPort();
}

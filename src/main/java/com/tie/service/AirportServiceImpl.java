package com.tie.service;

import com.tie.mapper.AirPortMapper;
import com.tie.model.Airport;
import com.tie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirportServiceImpl implements AirportService {

    @Override
    public List<Airport> showTakePort() {

        SqlSession session = MyBatisUtil.getSqlSession();
        AirPortMapper mapper = session.getMapper(AirPortMapper.class);

        List<Airport> airports = mapper.selectTakePort();
        return airports;
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession session = MyBatisUtil.getSqlSession();
        AirPortMapper mapper = session.getMapper(AirPortMapper.class);

        List<Airport> airports = mapper.selectLandPort();
        return airports;
    }
}

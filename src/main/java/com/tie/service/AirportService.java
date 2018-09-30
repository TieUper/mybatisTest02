package com.tie.service;

import com.tie.model.Airport;

import java.util.List;

public interface AirportService {

    /**
     * 显示所有起飞机场
     * @return
     */
    List<Airport> showTakePort();

    /**
     * 显示降落机场
     * @return
     */
    List<Airport> showLandPort();
}

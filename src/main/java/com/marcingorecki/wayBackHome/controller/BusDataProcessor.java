package com.marcingorecki.wayBackHome.controller;

import com.marcingorecki.wayBackHome.model.dto.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.marcingorecki.wayBackHome.model.application.TransitData;



@Component
public class BusDataProcessor {

    private final DataFetchService dataService;
    private final TransitDataMapper transitDataMapper;

    @Autowired
    public BusDataProcessor(TransitDataMapper transitDataMapper, DataFetchService dataService) {
        this.transitDataMapper = transitDataMapper;
        this.dataService = dataService;
    }

    public TransitData getProcessedData() {
        Data data = dataService.fetchData();
        return transitDataMapper.map(data);

    }




}

package com.marcingorecki.wayBackHome.controller;

import com.marcingorecki.wayBackHome.model.application.Ride;
import com.marcingorecki.wayBackHome.model.application.TransitData;
import com.marcingorecki.wayBackHome.model.dto.Data;
import org.springframework.stereotype.Component;

@Component
public class TransitDataMapper {

    public TransitData map(Data data) {
        return new TransitData(
                new Ride.Builder().withDelayInSeconds(data.getDelay())
        )


        return null;
    }
}

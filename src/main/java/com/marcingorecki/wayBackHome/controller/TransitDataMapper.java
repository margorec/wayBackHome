package com.marcingorecki.wayBackHome.controller;

import com.marcingorecki.wayBackHome.model.application.Ride;
import com.marcingorecki.wayBackHome.model.application.TransitData;
import com.marcingorecki.wayBackHome.model.dto.Data;
import com.marcingorecki.wayBackHome.model.dto.Delay;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class TransitDataMapper {

    public TransitData map(Data data) {
        List<Ride> incomingRides = data.getDelay()
                .stream()
                .map(mapDelayToRide)
                .collect(Collectors.toList());

        return new TransitData(null, null, incomingRides);
    }

    Function<Delay, Ride> mapDelayToRide = r -> new Ride.Builder()
            .withDelayInSeconds(r.getDelayInSeconds())
            .withTheoreticalTime(r.getTheoreticalTime())
            .withEstimatedTime(r.getEstimatedTime())
            .withHeadsign(r.getHeadsign())
            .build();
}

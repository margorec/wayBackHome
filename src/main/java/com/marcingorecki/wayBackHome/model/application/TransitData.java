package com.marcingorecki.wayBackHome.model.application;

import java.util.List;

public class TransitData {
    private Busstop initialBusstop;
    private Busstop finalBusstop;
    private List<Ride> rides;

    public TransitData(Busstop initialBusstop, Busstop finalBusstop, List<Ride> rides) {
        this.initialBusstop = initialBusstop;
        this.finalBusstop = finalBusstop;
        this.rides = rides;
    }

    public Busstop getInitialBusstop() {
        return initialBusstop;
    }

    public Busstop getFinalBusstop() {
        return finalBusstop;
    }

    public List<Ride> getRides() {
        return rides;
    }
}

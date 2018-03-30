package com.marcingorecki.wayBackHome.model.application;

import java.time.LocalTime;
import java.util.Objects;

public class Ride {
    // TODO: apply defensive copying
    private final int delayInSeconds;
    private final LocalTime estimatedTime;
    private final LocalTime theoreticalTime;
    private final int etaInMinutes;
    private final String headsign;
    private final String routeId;
    private final String trip;

    public Ride(Builder builder) {
        this.delayInSeconds = builder.delayInSeconds;
        this.estimatedTime = builder.estimatedTime;
        this.theoreticalTime = builder.theoreticalTime;
        this.etaInMinutes = builder.etaInMinutes;
        this.headsign = builder.headsign;
        this.routeId = builder.routeId;
        this.trip = builder.trip;
    }

    public int getDelayInSeconds() {
        return delayInSeconds;
    }

    public LocalTime getEstimatedTime() {
        return estimatedTime;
    }

    public LocalTime getTheoreticalTime() {
        return theoreticalTime;
    }

    public int getEtaInMinutes() {
        return etaInMinutes;
    }

    public String getHeadsign() {
        return headsign;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getTrip() {
        return trip;
    }

    public static class Builder {
        private int delayInSeconds;
        private LocalTime estimatedTime;
        private LocalTime theoreticalTime;
        private int etaInMinutes;
        private String headsign;
        private String routeId;
        private String trip;

        public Builder withDelayInSeconds(int delayInSeconds) {
            this.delayInSeconds = delayInSeconds;
            return this;
        }

        public Builder withEstimatedTime(String estimatedTime) {
            this.estimatedTime = LocalTime.parse(estimatedTime);
            return this;
        }

        public Builder withTheoreticalTime(String theoreticalTime) {
            this.theoreticalTime = LocalTime.parse(theoreticalTime);
            return this;
        }

        public Builder withEtaInMinutes(String theoreticalTime) {
            this.theoreticalTime = LocalTime.parse(theoreticalTime);
            return this;
        }

        public Builder withHeadsign(String headSign) {
            this.headsign = headsign;
            return this;
        }

        public Builder withRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        public Builder withTrip(String trip) {
            this.trip = trip;
            return this;
        }

        public Ride build() {
            return new Ride(this);
        }
    }

    @Override
    public String toString() {
        return "Ride{" +
                "delayInSeconds=" + delayInSeconds +
                ", estimatedTime=" + estimatedTime +
                ", theoreticalTime=" + theoreticalTime +
                ", etaInMinutes=" + etaInMinutes +
                ", headsign='" + headsign + '\'' +
                ", routeId='" + routeId + '\'' +
                ", trip='" + trip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ride ride = (Ride) o;
        return delayInSeconds == ride.delayInSeconds &&
                Objects.equals(estimatedTime, ride.estimatedTime) &&
                Objects.equals(theoreticalTime, ride.theoreticalTime) &&
                Objects.equals(etaInMinutes, ride.etaInMinutes) &&
                Objects.equals(headsign, ride.headsign) &&
                Objects.equals(routeId, ride.routeId) &&
                Objects.equals(trip, ride.trip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delayInSeconds, estimatedTime, theoreticalTime, etaInMinutes, headsign, routeId, trip);
    }
}

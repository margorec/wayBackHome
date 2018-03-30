package com.marcingorecki.wayBackHome.model.dto;

import java.util.Objects;

public class Delay {
    private String id;
    private int delayInSeconds;
    private String estimatedTime;
    private String headsign;
    private String routeId;
    private String tripId;
    private String status;
    private String theoreticalTime;
    private String timestamp;
    private String trip;
    private String vehicleCode;
    private String vehicleId;

    public Delay(String id, int delayInSeconds, String estimatedTime, String headsign, String routeId, String tripId, String status, String theoreticalTime, String timestamp, String trip, String vehicleCode, String vehicleId) {
        this.id = id;
        this.delayInSeconds = delayInSeconds;
        this.estimatedTime = estimatedTime;
        this.headsign = headsign;
        this.routeId = routeId;
        this.tripId = tripId;
        this.status = status;
        this.theoreticalTime = theoreticalTime;
        this.timestamp = timestamp;
        this.trip = trip;
        this.vehicleCode = vehicleCode;
        this.vehicleId = vehicleId;
    }

    public Delay() {
    }

    public String getId() {
        return id;
    }

    public int getDelayInSeconds() {
        return delayInSeconds;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public String getHeadsign() {
        return headsign;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getTripId() {
        return tripId;
    }

    public String getStatus() {
        return status;
    }

    public String getTheoreticalTime() {
        return theoreticalTime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTrip() {
        return trip;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Delay{" +
                "id=" + id +
                ", delayInSeconds=" + delayInSeconds +
                ", estimatedTime='" + estimatedTime + '\'' +
                ", headsign='" + headsign + '\'' +
                ", routeId='" + routeId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", status='" + status + '\'' +
                ", theoreticalTime='" + theoreticalTime + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", trip='" + trip + '\'' +
                ", vehicleCode='" + vehicleCode + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delay that = (Delay) o;
        return id == that.id &&
                delayInSeconds == that.delayInSeconds &&
                Objects.equals(estimatedTime, that.estimatedTime) &&
                Objects.equals(headsign, that.headsign) &&
                Objects.equals(routeId, that.routeId) &&
                Objects.equals(tripId, that.tripId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(theoreticalTime, that.theoreticalTime) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(trip, that.trip) &&
                Objects.equals(vehicleCode, that.vehicleCode) &&
                Objects.equals(vehicleId, that.vehicleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, delayInSeconds, estimatedTime, headsign, routeId, tripId, status, theoreticalTime, timestamp, trip, vehicleCode, vehicleId);
    }
}

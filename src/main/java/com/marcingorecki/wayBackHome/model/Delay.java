package com.marcingorecki.wayBackHome.model;

import java.util.Objects;

public class Delay {
    private long id;
    private int delayInSeconds;
    private String estimatedTime;
    private String headSign;
    private String routeId;
    private String tripId;
    private String status;
    private String theoreticalDate;
    private String timestamp;
    private String trip;
    private String vehicleCode;
    private String vehicleId;

    public Delay(long id, int delayInSeconds, String estimatedTime, String headSign, String routeId, String tripId, String status, String theoreticalDate, String timestamp, String trip, String vehicleCode, String vehicleId) {
        this.id = id;
        this.delayInSeconds = delayInSeconds;
        this.estimatedTime = estimatedTime;
        this.headSign = headSign;
        this.routeId = routeId;
        this.tripId = tripId;
        this.status = status;
        this.theoreticalDate = theoreticalDate;
        this.timestamp = timestamp;
        this.trip = trip;
        this.vehicleCode = vehicleCode;
        this.vehicleId = vehicleId;
    }

    public Delay() {
    }

    public long getId() {
        return id;
    }

    public int getDelayInSeconds() {
        return delayInSeconds;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public String getHeadSign() {
        return headSign;
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

    public String getTheoreticalDate() {
        return theoreticalDate;
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
                ", headSign='" + headSign + '\'' +
                ", routeId='" + routeId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", status='" + status + '\'' +
                ", theoreticalDate='" + theoreticalDate + '\'' +
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
                Objects.equals(headSign, that.headSign) &&
                Objects.equals(routeId, that.routeId) &&
                Objects.equals(tripId, that.tripId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(theoreticalDate, that.theoreticalDate) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(trip, that.trip) &&
                Objects.equals(vehicleCode, that.vehicleCode) &&
                Objects.equals(vehicleId, that.vehicleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, delayInSeconds, estimatedTime, headSign, routeId, tripId, status, theoreticalDate, timestamp, trip, vehicleCode, vehicleId);
    }
}

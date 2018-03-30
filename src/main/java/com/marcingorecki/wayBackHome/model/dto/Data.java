package com.marcingorecki.wayBackHome.model.dto;

import java.util.List;
import java.util.Objects;

public class Data {

    private String lastUpdate;
    private List<Delay> delay;

    public Data(String lastUpdate, List<Delay> delay) {
        this.lastUpdate = lastUpdate;
        this.delay = delay;
    }

    public Data() {
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public List<Delay> getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return "Data{" +
                "lastUpdate='" + lastUpdate + '\'' +
                ", delay=" + delay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(lastUpdate, data.lastUpdate) &&
                Objects.equals(delay, data.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdate, delay);
    }
}

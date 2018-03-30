package com.marcingorecki.wayBackHome.model.application;

import java.util.Objects;

public class Busstop {

    private final String name;
    private final String id;

    public Busstop(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Busstop busstop = (Busstop) o;
        return Objects.equals(name, busstop.name) &&
                Objects.equals(id, busstop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Busstop{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

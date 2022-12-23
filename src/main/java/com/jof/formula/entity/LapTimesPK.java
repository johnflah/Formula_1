package com.jof.formula.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class LapTimesPK implements Serializable {
    @Column(name = "raceId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int raceId;
    @Column(name = "driverId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    @Column(name = "lap")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lap;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LapTimesPK that = (LapTimesPK) o;

        if (raceId != that.raceId) return false;
        if (driverId != that.driverId) return false;
        if (lap != that.lap) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId;
        result = 31 * result + driverId;
        result = 31 * result + lap;
        return result;
    }
}

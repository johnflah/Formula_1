package com.jof.formula.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PitStopsPK implements Serializable {
    @Column(name = "raceId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int raceId;
    @Column(name = "driverId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    @Column(name = "stop")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stop;

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

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PitStopsPK that = (PitStopsPK) o;

        if (raceId != that.raceId) return false;
        if (driverId != that.driverId) return false;
        if (stop != that.stop) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId;
        result = 31 * result + driverId;
        result = 31 * result + stop;
        return result;
    }
}

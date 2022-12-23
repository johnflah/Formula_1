package com.jof.formula.entity;

import javax.persistence.*;

@Entity
@IdClass(LapTimesPK.class)
public class LapTimes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "raceId")
    private int raceId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "driverId")
    private int driverId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lap")
    private int lap;
    @Basic
    @Column(name = "position")
    private Integer position;
    @Basic
    @Column(name = "time")
    private String time;
    @Basic
    @Column(name = "milliseconds")
    private Integer milliseconds;

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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LapTimes lapTimes = (LapTimes) o;

        if (raceId != lapTimes.raceId) return false;
        if (driverId != lapTimes.driverId) return false;
        if (lap != lapTimes.lap) return false;
        if (position != null ? !position.equals(lapTimes.position) : lapTimes.position != null) return false;
        if (time != null ? !time.equals(lapTimes.time) : lapTimes.time != null) return false;
        if (milliseconds != null ? !milliseconds.equals(lapTimes.milliseconds) : lapTimes.milliseconds != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId;
        result = 31 * result + driverId;
        result = 31 * result + lap;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (milliseconds != null ? milliseconds.hashCode() : 0);
        return result;
    }
}

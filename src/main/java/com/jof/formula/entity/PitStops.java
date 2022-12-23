package com.jof.formula.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
@IdClass(PitStopsPK.class)
public class PitStops {
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
    @Column(name = "stop")
    private int stop;
    @Basic
    @Column(name = "lap")
    private int lap;
    @Basic
    @Column(name = "time")
    private Time time;
    @Basic
    @Column(name = "duration")
    private String duration;
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

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

        PitStops pitStops = (PitStops) o;

        if (raceId != pitStops.raceId) return false;
        if (driverId != pitStops.driverId) return false;
        if (stop != pitStops.stop) return false;
        if (lap != pitStops.lap) return false;
        if (time != null ? !time.equals(pitStops.time) : pitStops.time != null) return false;
        if (duration != null ? !duration.equals(pitStops.duration) : pitStops.duration != null) return false;
        if (milliseconds != null ? !milliseconds.equals(pitStops.milliseconds) : pitStops.milliseconds != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId;
        result = 31 * result + driverId;
        result = 31 * result + stop;
        result = 31 * result + lap;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (milliseconds != null ? milliseconds.hashCode() : 0);
        return result;
    }
}

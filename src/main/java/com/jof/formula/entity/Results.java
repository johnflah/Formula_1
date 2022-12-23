package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class Results {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "resultId")
    private int resultId;
    @Basic
    @Column(name = "raceId")
    private int raceId;
    @Basic
    @Column(name = "driverId")
    private int driverId;
    @Basic
    @Column(name = "constructorId")
    private int constructorId;
    @Basic
    @Column(name = "number")
    private int number;
    @Basic
    @Column(name = "grid")
    private int grid;
    @Basic
    @Column(name = "position")
    private Integer position;
    @Basic
    @Column(name = "positionText")
    private String positionText;
    @Basic
    @Column(name = "positionOrder")
    private int positionOrder;
    @Basic
    @Column(name = "points")
    private double points;
    @Basic
    @Column(name = "laps")
    private int laps;
    @Basic
    @Column(name = "time")
    private String time;
    @Basic
    @Column(name = "milliseconds")
    private Integer milliseconds;
    @Basic
    @Column(name = "fastestLap")
    private Integer fastestLap;
    @Basic
    @Column(name = "rank")
    private Integer rank;
    @Basic
    @Column(name = "fastestLapTime")
    private String fastestLapTime;
    @Basic
    @Column(name = "fastestLapSpeed")
    private String fastestLapSpeed;
    @Basic
    @Column(name = "statusId")
    private int statusId;

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

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

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public int getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(int positionOrder) {
        this.positionOrder = positionOrder;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
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

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public String getFastestLapSpeed() {
        return fastestLapSpeed;
    }

    public void setFastestLapSpeed(String fastestLapSpeed) {
        this.fastestLapSpeed = fastestLapSpeed;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Results results = (Results) o;

        if (resultId != results.resultId) return false;
        if (raceId != results.raceId) return false;
        if (driverId != results.driverId) return false;
        if (constructorId != results.constructorId) return false;
        if (number != results.number) return false;
        if (grid != results.grid) return false;
        if (positionOrder != results.positionOrder) return false;
        if (Double.compare(results.points, points) != 0) return false;
        if (laps != results.laps) return false;
        if (statusId != results.statusId) return false;
        if (position != null ? !position.equals(results.position) : results.position != null) return false;
        if (positionText != null ? !positionText.equals(results.positionText) : results.positionText != null)
            return false;
        if (time != null ? !time.equals(results.time) : results.time != null) return false;
        if (milliseconds != null ? !milliseconds.equals(results.milliseconds) : results.milliseconds != null)
            return false;
        if (fastestLap != null ? !fastestLap.equals(results.fastestLap) : results.fastestLap != null) return false;
        if (rank != null ? !rank.equals(results.rank) : results.rank != null) return false;
        if (fastestLapTime != null ? !fastestLapTime.equals(results.fastestLapTime) : results.fastestLapTime != null)
            return false;
        if (fastestLapSpeed != null ? !fastestLapSpeed.equals(results.fastestLapSpeed) : results.fastestLapSpeed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = resultId;
        result = 31 * result + raceId;
        result = 31 * result + driverId;
        result = 31 * result + constructorId;
        result = 31 * result + number;
        result = 31 * result + grid;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (positionText != null ? positionText.hashCode() : 0);
        result = 31 * result + positionOrder;
        temp = Double.doubleToLongBits(points);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + laps;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (milliseconds != null ? milliseconds.hashCode() : 0);
        result = 31 * result + (fastestLap != null ? fastestLap.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (fastestLapTime != null ? fastestLapTime.hashCode() : 0);
        result = 31 * result + (fastestLapSpeed != null ? fastestLapSpeed.hashCode() : 0);
        result = 31 * result + statusId;
        return result;
    }
}

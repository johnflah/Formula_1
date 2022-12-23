package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class ConstructorResults {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "constructorResultsId")
    private int constructorResultsId;
    @Basic
    @Column(name = "raceId")
    private int raceId;
    @Basic
    @Column(name = "constructorId")
    private int constructorId;
    @Basic
    @Column(name = "points")
    private Double points;
    @Basic
    @Column(name = "status")
    private String status;

    public int getConstructorResultsId() {
        return constructorResultsId;
    }

    public void setConstructorResultsId(int constructorResultsId) {
        this.constructorResultsId = constructorResultsId;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConstructorResults that = (ConstructorResults) o;

        if (constructorResultsId != that.constructorResultsId) return false;
        if (raceId != that.raceId) return false;
        if (constructorId != that.constructorId) return false;
        if (points != null ? !points.equals(that.points) : that.points != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constructorResultsId;
        result = 31 * result + raceId;
        result = 31 * result + constructorId;
        result = 31 * result + (points != null ? points.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

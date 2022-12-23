package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class Qualifying {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "qualifyId")
    private int qualifyId;
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
    @Column(name = "position")
    private Integer position;
    @Basic
    @Column(name = "q1")
    private String q1;
    @Basic
    @Column(name = "q2")
    private String q2;
    @Basic
    @Column(name = "q3")
    private String q3;

    public int getQualifyId() {
        return qualifyId;
    }

    public void setQualifyId(int qualifyId) {
        this.qualifyId = qualifyId;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Qualifying that = (Qualifying) o;

        if (qualifyId != that.qualifyId) return false;
        if (raceId != that.raceId) return false;
        if (driverId != that.driverId) return false;
        if (constructorId != that.constructorId) return false;
        if (number != that.number) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (q1 != null ? !q1.equals(that.q1) : that.q1 != null) return false;
        if (q2 != null ? !q2.equals(that.q2) : that.q2 != null) return false;
        if (q3 != null ? !q3.equals(that.q3) : that.q3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qualifyId;
        result = 31 * result + raceId;
        result = 31 * result + driverId;
        result = 31 * result + constructorId;
        result = 31 * result + number;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (q1 != null ? q1.hashCode() : 0);
        result = 31 * result + (q2 != null ? q2.hashCode() : 0);
        result = 31 * result + (q3 != null ? q3.hashCode() : 0);
        return result;
    }
}

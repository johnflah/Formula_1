package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class ConstructorStandings {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "constructorStandingsId")
    private int constructorStandingsId;
    @Basic
    @Column(name = "raceId")
    private int raceId;
    @Basic
    @Column(name = "constructorId")
    private int constructorId;
    @Basic
    @Column(name = "points")
    private double points;
    @Basic
    @Column(name = "position")
    private Integer position;
    @Basic
    @Column(name = "positionText")
    private String positionText;
    @Basic
    @Column(name = "wins")
    private int wins;

    public int getConstructorStandingsId() {
        return constructorStandingsId;
    }

    public void setConstructorStandingsId(int constructorStandingsId) {
        this.constructorStandingsId = constructorStandingsId;
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

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConstructorStandings that = (ConstructorStandings) o;

        if (constructorStandingsId != that.constructorStandingsId) return false;
        if (raceId != that.raceId) return false;
        if (constructorId != that.constructorId) return false;
        if (Double.compare(that.points, points) != 0) return false;
        if (wins != that.wins) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (positionText != null ? !positionText.equals(that.positionText) : that.positionText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = constructorStandingsId;
        result = 31 * result + raceId;
        result = 31 * result + constructorId;
        temp = Double.doubleToLongBits(points);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (positionText != null ? positionText.hashCode() : 0);
        result = 31 * result + wins;
        return result;
    }
}

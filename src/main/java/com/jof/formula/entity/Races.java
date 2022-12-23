package com.jof.formula.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Races {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "raceId")
    private int raceId;
    @Basic
    @Column(name = "year")
    private int year;
    @Basic
    @Column(name = "round")
    private int round;
    @Basic
    @Column(name = "circuitId")
    private int circuitId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "time")
    private Time time;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "fp1_date")
    private Date fp1Date;
    @Basic
    @Column(name = "fp1_time")
    private Time fp1Time;
    @Basic
    @Column(name = "fp2_date")
    private Date fp2Date;
    @Basic
    @Column(name = "fp2_time")
    private Time fp2Time;
    @Basic
    @Column(name = "fp3_date")
    private Date fp3Date;
    @Basic
    @Column(name = "fp3_time")
    private Time fp3Time;
    @Basic
    @Column(name = "quali_date")
    private Date qualiDate;
    @Basic
    @Column(name = "quali_time")
    private Time qualiTime;
    @Basic
    @Column(name = "sprint_date")
    private Date sprintDate;
    @Basic
    @Column(name = "sprint_time")
    private Time sprintTime;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(int circuitId) {
        this.circuitId = circuitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFp1Date() {
        return fp1Date;
    }

    public void setFp1Date(Date fp1Date) {
        this.fp1Date = fp1Date;
    }

    public Time getFp1Time() {
        return fp1Time;
    }

    public void setFp1Time(Time fp1Time) {
        this.fp1Time = fp1Time;
    }

    public Date getFp2Date() {
        return fp2Date;
    }

    public void setFp2Date(Date fp2Date) {
        this.fp2Date = fp2Date;
    }

    public Time getFp2Time() {
        return fp2Time;
    }

    public void setFp2Time(Time fp2Time) {
        this.fp2Time = fp2Time;
    }

    public Date getFp3Date() {
        return fp3Date;
    }

    public void setFp3Date(Date fp3Date) {
        this.fp3Date = fp3Date;
    }

    public Time getFp3Time() {
        return fp3Time;
    }

    public void setFp3Time(Time fp3Time) {
        this.fp3Time = fp3Time;
    }

    public Date getQualiDate() {
        return qualiDate;
    }

    public void setQualiDate(Date qualiDate) {
        this.qualiDate = qualiDate;
    }

    public Time getQualiTime() {
        return qualiTime;
    }

    public void setQualiTime(Time qualiTime) {
        this.qualiTime = qualiTime;
    }

    public Date getSprintDate() {
        return sprintDate;
    }

    public void setSprintDate(Date sprintDate) {
        this.sprintDate = sprintDate;
    }

    public Time getSprintTime() {
        return sprintTime;
    }

    public void setSprintTime(Time sprintTime) {
        this.sprintTime = sprintTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Races races = (Races) o;

        if (raceId != races.raceId) return false;
        if (year != races.year) return false;
        if (round != races.round) return false;
        if (circuitId != races.circuitId) return false;
        if (name != null ? !name.equals(races.name) : races.name != null) return false;
        if (date != null ? !date.equals(races.date) : races.date != null) return false;
        if (time != null ? !time.equals(races.time) : races.time != null) return false;
        if (url != null ? !url.equals(races.url) : races.url != null) return false;
        if (fp1Date != null ? !fp1Date.equals(races.fp1Date) : races.fp1Date != null) return false;
        if (fp1Time != null ? !fp1Time.equals(races.fp1Time) : races.fp1Time != null) return false;
        if (fp2Date != null ? !fp2Date.equals(races.fp2Date) : races.fp2Date != null) return false;
        if (fp2Time != null ? !fp2Time.equals(races.fp2Time) : races.fp2Time != null) return false;
        if (fp3Date != null ? !fp3Date.equals(races.fp3Date) : races.fp3Date != null) return false;
        if (fp3Time != null ? !fp3Time.equals(races.fp3Time) : races.fp3Time != null) return false;
        if (qualiDate != null ? !qualiDate.equals(races.qualiDate) : races.qualiDate != null) return false;
        if (qualiTime != null ? !qualiTime.equals(races.qualiTime) : races.qualiTime != null) return false;
        if (sprintDate != null ? !sprintDate.equals(races.sprintDate) : races.sprintDate != null) return false;
        if (sprintTime != null ? !sprintTime.equals(races.sprintTime) : races.sprintTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceId;
        result = 31 * result + year;
        result = 31 * result + round;
        result = 31 * result + circuitId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (fp1Date != null ? fp1Date.hashCode() : 0);
        result = 31 * result + (fp1Time != null ? fp1Time.hashCode() : 0);
        result = 31 * result + (fp2Date != null ? fp2Date.hashCode() : 0);
        result = 31 * result + (fp2Time != null ? fp2Time.hashCode() : 0);
        result = 31 * result + (fp3Date != null ? fp3Date.hashCode() : 0);
        result = 31 * result + (fp3Time != null ? fp3Time.hashCode() : 0);
        result = 31 * result + (qualiDate != null ? qualiDate.hashCode() : 0);
        result = 31 * result + (qualiTime != null ? qualiTime.hashCode() : 0);
        result = 31 * result + (sprintDate != null ? sprintDate.hashCode() : 0);
        result = 31 * result + (sprintTime != null ? sprintTime.hashCode() : 0);
        return result;
    }
}

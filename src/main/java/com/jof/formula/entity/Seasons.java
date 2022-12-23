package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class Seasons {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "year")
    private int year;
    @Basic
    @Column(name = "url")
    private String url;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seasons seasons = (Seasons) o;

        if (year != seasons.year) return false;
        if (url != null ? !url.equals(seasons.url) : seasons.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}

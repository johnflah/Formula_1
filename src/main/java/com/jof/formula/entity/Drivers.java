package com.jof.formula.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Drivers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "driverId")
    private int driverId;
    @Basic
    @Column(name = "driverRef")
    private String driverRef;
    @Basic
    @Column(name = "number")
    private Integer number;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "forename")
    private String forename;
    @Basic
    @Column(name = "surname")
    private String surname;
    @Basic
    @Column(name = "dob")
    private Date dob;
    @Basic
    @Column(name = "nationality")
    private String nationality;
    @Basic
    @Column(name = "url")
    private String url;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverRef() {
        return driverRef;
    }

    public void setDriverRef(String driverRef) {
        this.driverRef = driverRef;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

        Drivers drivers = (Drivers) o;

        if (driverId != drivers.driverId) return false;
        if (driverRef != null ? !driverRef.equals(drivers.driverRef) : drivers.driverRef != null) return false;
        if (number != null ? !number.equals(drivers.number) : drivers.number != null) return false;
        if (code != null ? !code.equals(drivers.code) : drivers.code != null) return false;
        if (forename != null ? !forename.equals(drivers.forename) : drivers.forename != null) return false;
        if (surname != null ? !surname.equals(drivers.surname) : drivers.surname != null) return false;
        if (dob != null ? !dob.equals(drivers.dob) : drivers.dob != null) return false;
        if (nationality != null ? !nationality.equals(drivers.nationality) : drivers.nationality != null) return false;
        if (url != null ? !url.equals(drivers.url) : drivers.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId;
        result = 31 * result + (driverRef != null ? driverRef.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (forename != null ? forename.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}

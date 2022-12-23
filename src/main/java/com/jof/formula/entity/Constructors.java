package com.jof.formula.entity;

import javax.persistence.*;

@Entity
public class Constructors {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "constructorId")
    private int constructorId;
    @Basic
    @Column(name = "constructorRef")
    private String constructorRef;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "nationality")
    private String nationality;
    @Basic
    @Column(name = "url")
    private String url;

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public String getConstructorRef() {
        return constructorRef;
    }

    public void setConstructorRef(String constructorRef) {
        this.constructorRef = constructorRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        Constructors that = (Constructors) o;

        if (constructorId != that.constructorId) return false;
        if (constructorRef != null ? !constructorRef.equals(that.constructorRef) : that.constructorRef != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constructorId;
        result = 31 * result + (constructorRef != null ? constructorRef.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}

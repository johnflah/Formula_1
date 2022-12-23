package com.jof.formula.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Slf4j
@Getter
@Setter
public class Circuits {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "circuitId")
    private int circuitId;
    
    @Column(name = "circuitRef")
    private String circuitRef;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "lat")
    private Double lat;
    
    @Column(name = "lng")
    private Double lng;
    
    @Column(name = "alt")
    private Integer alt;
    
    @Column(name = "url")
    private String url;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circuits circuits = (Circuits) o;

        if (circuitId != circuits.circuitId) return false;
        if (circuitRef != null ? !circuitRef.equals(circuits.circuitRef) : circuits.circuitRef != null) return false;
        if (name != null ? !name.equals(circuits.name) : circuits.name != null) return false;
        if (location != null ? !location.equals(circuits.location) : circuits.location != null) return false;
        if (country != null ? !country.equals(circuits.country) : circuits.country != null) return false;
        if (lat != null ? !lat.equals(circuits.lat) : circuits.lat != null) return false;
        if (lng != null ? !lng.equals(circuits.lng) : circuits.lng != null) return false;
        if (alt != null ? !alt.equals(circuits.alt) : circuits.alt != null) return false;
        if (url != null ? !url.equals(circuits.url) : circuits.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = circuitId;
        result = 31 * result + (circuitRef != null ? circuitRef.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (alt != null ? alt.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}

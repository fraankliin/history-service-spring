package com.carbonfoodprint.service_history.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "transports")
public class TransportsEntity {
    @Id
    private Long id;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "car_km")
    private Integer carKm;

    @Column(name = "public_km")
    private Integer publicKm;

    @Column(name = "domestic_flights")
    private Integer domesticFlights;

    @Column(name = "international_flights")
    private Integer internationalFlights;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getCarKm() {
        return carKm;
    }

    public void setCarKm(Integer carKm) {
        this.carKm = carKm;
    }

    public Integer getPublicKm() {
        return publicKm;
    }

    public void setPublicKm(Integer publicKm) {
        this.publicKm = publicKm;
    }

    public Integer getDomesticFlights() {
        return domesticFlights;
    }

    public void setDomesticFlights(Integer domesticFlights) {
        this.domesticFlights = domesticFlights;
    }

    public Integer getInternationalFlights() {
        return internationalFlights;
    }

    public void setInternationalFlights(Integer internationalFlights) {
        this.internationalFlights = internationalFlights;
    }
}

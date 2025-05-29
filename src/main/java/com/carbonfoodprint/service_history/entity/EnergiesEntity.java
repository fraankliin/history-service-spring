package com.carbonfoodprint.service_history.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;


@Entity
@Table(name = "energies")
public class EnergiesEntity {

    @Id
    private Long id;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "appliance_hours")
    private Integer applianceHours;

    @Column(name = "light_bulbs")
    private Integer lightBulbs;

    @Column(name = "gas_tanks")
    private Integer gasTanks;

    @Column(name = "hvac_hours")
    private Integer hvacHours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getApplianceHours() {
        return applianceHours;
    }

    public void setApplianceHours(Integer applianceHours) {
        this.applianceHours = applianceHours;
    }

    public Integer getLightBulbs() {
        return lightBulbs;
    }

    public void setLightBulbs(Integer lightBulbs) {
        this.lightBulbs = lightBulbs;
    }

    public Integer getGasTanks() {
        return gasTanks;
    }

    public void setGasTanks(Integer gasTanks) {
        this.gasTanks = gasTanks;
    }

    public Integer getHvacHours() {
        return hvacHours;
    }

    public void setHvacHours(Integer hvacHours) {
        this.hvacHours = hvacHours;
    }
}



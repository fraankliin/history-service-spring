package com.carbonfoodprint.service_history.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "wastes")
public class WastesEntity {
    @Id
    private Long id;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "trash_bags")
    private Integer trashBags;

    @Column(name = "food_waste")
    private Integer foodWaste;

    @Column(name = "plastic_bottles")
    private Integer plasticBottles;

    @Column(name = "paper_packages")
    private Integer paperPackages;

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

    public Integer getTrashBags() {
        return trashBags;
    }

    public void setTrashBags(Integer trashBags) {
        this.trashBags = trashBags;
    }

    public Integer getFoodWaste() {
        return foodWaste;
    }

    public void setFoodWaste(Integer foodWaste) {
        this.foodWaste = foodWaste;
    }

    public Integer getPlasticBottles() {
        return plasticBottles;
    }

    public void setPlasticBottles(Integer plasticBottles) {
        this.plasticBottles = plasticBottles;
    }

    public Integer getPaperPackages() {
        return paperPackages;
    }

    public void setPaperPackages(Integer paperPackages) {
        this.paperPackages = paperPackages;
    }
}

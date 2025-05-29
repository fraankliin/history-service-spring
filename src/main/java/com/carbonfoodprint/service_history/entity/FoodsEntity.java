package com.carbonfoodprint.service_history.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "foods")
public class FoodsEntity {

    @Id
    private Long id;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "red_meat")
    private Integer redMeat;

    @Column(name = "white_meat")
    private Integer whiteMeat;

    @Column(name = "dairy")
    private Integer dairy;

    @Column(name = "vegetarian")
    private Integer vegetarian;

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

    public Integer getRedMeat() {
        return redMeat;
    }

    public void setRedMeat(Integer redMeat) {
        this.redMeat = redMeat;
    }

    public Integer getWhiteMeat() {
        return whiteMeat;
    }

    public void setWhiteMeat(Integer whiteMeat) {
        this.whiteMeat = whiteMeat;
    }

    public Integer getDairy() {
        return dairy;
    }

    public void setDairy(Integer dairy) {
        this.dairy = dairy;
    }

    public Integer getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Integer vegetarian) {
        this.vegetarian = vegetarian;
    }
}

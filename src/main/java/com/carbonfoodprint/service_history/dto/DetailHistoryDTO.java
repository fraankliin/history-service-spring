package com.carbonfoodprint.service_history.dto;

import com.carbonfoodprint.service_history.entity.EnergiesEntity;
import com.carbonfoodprint.service_history.entity.FoodsEntity;
import com.carbonfoodprint.service_history.entity.TransportsEntity;
import com.carbonfoodprint.service_history.entity.WastesEntity;

public class DetailHistoryDTO {

    private EnergiesEntity energy;
    private FoodsEntity food;
    private TransportsEntity transport;
    private WastesEntity waste;





    public DetailHistoryDTO(EnergiesEntity energy, FoodsEntity food,
                                TransportsEntity transport, WastesEntity waste) {
        this.energy = energy;
        this.food = food;
        this.transport = transport;
        this.waste = waste;

    }

    public EnergiesEntity getEnergy() {
        return energy;
    }

    public void setEnergy(EnergiesEntity energy) {
        this.energy = energy;
    }

    public FoodsEntity getFood() {
        return food;
    }

    public void setFood(FoodsEntity food) {
        this.food = food;
    }

    public TransportsEntity getTransport() {
        return transport;
    }

    public void setTransport(TransportsEntity transport) {
        this.transport = transport;
    }

    public WastesEntity getWaste() {
        return waste;
    }

    public void setWaste(WastesEntity waste) {
        this.waste = waste;
    }

}

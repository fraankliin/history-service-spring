package com.carbonfoodprint.service_history.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class SummaryHistoryDTO {
    private Long calculoId;
    private Instant fecha;
    private BigDecimal totalGeneral;

    public SummaryHistoryDTO(Long calculoId, Instant fecha, BigDecimal totalGeneral) {
        this.calculoId = calculoId;
        this.fecha = fecha;
        this.totalGeneral = totalGeneral;
    }

    public Long getCalculoId() {
        return calculoId;
    }

    public void setCalculoId(Long calculoId) {
        this.calculoId = calculoId;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotalGeneral() {
        return totalGeneral;
    }

    public void setTotalGeneral(BigDecimal totalGeneral) {
        this.totalGeneral = totalGeneral;
    }
}

package com.mslogisticaactivo.dao.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FinanceEntity", schema = "asset")
public class FinanceEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    private String monedaOperacion;
    private BigDecimal valorCompra;
    private BigDecimal tasaCambio;
    private String subdia;
    private String numeroCompra;
    private Date fechaCompra;
    private String cuentaContable;
    private String cuentaGasto;
    private String centroCosto;
    private String tipoAnexoCta6;
    private String codAnexoCta6;
    private Date inicioDepreciacion;
    private Date ultimaDepreciacion;
    private BigDecimal valorAdquiridoUS;
    private BigDecimal valorAdquiridoMN;
    private BigDecimal valorDepreciadoUS;
    private BigDecimal valorDepreciadoMN;

    @OneToMany(mappedBy = "finanzas")
    private List<AssetEntity> assets;
}

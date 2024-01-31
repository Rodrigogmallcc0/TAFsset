package com.mslogisticaactivo.dao.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "AssetEntity", schema = "asset")
public class AssetEntity {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String assetId;

    private String descripcion;
    private String marcaDetallesEspecificos;
    private String modeloDetallesEspecificos;
    private String placa;
    private String color;
    private String serie;
    private int añoFabricacion;
    private String grupoCategorizacion;
    private String materialCategorizacion;
    private String localidad;
    private String seccion;
    private String numeroOficina;
    private String piso;
    private String dependenciaId;
    private String responsableId;
    private Date fechaCambioUbicacion;
    private String finanzasId;
    private String unidadMedidaId;

/*     // Campos relacionados con la adquisición del activo
    private String tipoAnexo;
    private String anexo;
    private Date fechaAdquisicion;
    private String tipoDocumento;
    private String numeroDocumento;

    private Date fechaGarantia;
    private String monedaOperaciones;
    private double valorCompra;
    private double tasaCambio;
    private String subdiaDetallesTransaccion;
    private String numeroFactura;
    private Date fechaFactura;
    private String cuentaContableAsociada;
    private String cuentaGasto;
    private String centroCostoId;
    private String tipoAnexoCta6;
    private String codigoAnexoCta6;
    private Date inicioDepreciacion;
    private Date ultimaDepreciacion;
    private double valorAdquisicionUS;
    private double valorAdquisicionMN;
    private String situacionActivo;
    private Date fechaSituacion;
    private double tasaDepreciacion;
    private int mesesDepreciacion;
    private int cantidad;
    private String clase;
    private String codigoAgrupacion;
    private String userRegistro;
    private Date fechaHoraCreacion;
 */
    private Boolean isDeleted;
    private Boolean isActive;
    private Boolean isAssigned;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;

    @ManyToOne
    @JoinColumn(name = "marcaId")
    private MarcaEntity marca;

    @ManyToOne
    @JoinColumn(name = "modeloId")
    private ModeloEntity modelo;

    @ManyToOne
    @JoinColumn(name = "grupoId")
    private GrupoEntity grupo;

    @ManyToOne
    @JoinColumn(name = "agrupacionId")
    private AgrupacionEntity agrupacion;

    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "materialId")
    private MaterialEntity material;

    @ManyToOne
    @JoinColumn(name = "estadoId")
    private EstadoEntity estado;

    @ManyToOne
    @JoinColumn(name = "seccionId")
    private SeccionEntity seccionE;

    @ManyToOne
    @JoinColumn(name = "finanzas")
    private FinanceEntity finanzas;

    @ManyToOne
    @JoinColumn(name = "unidadMedida")
    private UnidadMedidaEntity unidadMedida;

    @ManyToOne
    @JoinColumn(name = "adquisicion")
    private AdquisicionEntity adquisicion;


}

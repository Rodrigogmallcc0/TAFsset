package com.mslogisticaactivo.dao.entity;

import java.time.LocalDateTime;
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
@Table(name = "Material", schema = "asset")
public class MaterialEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;
    private String nombre;
    private String estado;
    private String tipo;

    private Boolean isDeleted;
    private Boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;

    @OneToMany(mappedBy = "material")
    private List<AssetEntity> assets;
}

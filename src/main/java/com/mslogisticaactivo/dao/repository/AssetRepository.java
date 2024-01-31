package com.mslogisticaactivo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mslogisticaactivo.dao.entity.AssetEntity;

@Repository
public interface AssetRepository extends JpaRepository<AssetEntity, String> {

}

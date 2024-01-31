package com.mslogisticaactivo.business.service;

import com.mslogisticaactivo.expose.dto.AssetDTO;

public interface AssetService {
    AssetDTO.Response createAsset(AssetDTO.Request asset);
    AssetDTO.Response getAssetById(String id);
    AssetDTO.Response updateAsset(AssetDTO.Request asset);
    AssetDTO.Response deleteAsset(String id);
    AssetDTO.Response getAllAssets();
    AssetDTO.Response getBySupplier(String supplierId);
    AssetDTO.Response getByName(String name);
    
}

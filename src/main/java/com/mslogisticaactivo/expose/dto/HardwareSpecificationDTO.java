package com.mslogisticaactivo.expose.dto;

import lombok.Getter;
import lombok.Setter;

public class HardwareSpecificationDTO {

    @Getter
    @Setter
    public static class Response {

        private String id;
        private String motherboard;
        private String processor;
        private String ramModel;
        private String ramBrand;
        private String graphicsCardModel;
        private String graphicsCardBrand;
        private String storageModel;
        private String storageBrand;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;

    }

    @Getter
    @Setter
    public static class Request {

        private String id;
        private String motherboard;
        private String processor;
        private String ramModel;
        private String ramBrand;
        private String graphicsCardModel;
        private String graphicsCardBrand;
        private String storageModel;
        private String storageBrand;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;

    }
    
}

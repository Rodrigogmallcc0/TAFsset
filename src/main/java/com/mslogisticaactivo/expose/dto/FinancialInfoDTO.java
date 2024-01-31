package com.mslogisticaactivo.expose.dto;

import lombok.Getter;
import lombok.Setter;

public class FinancialInfoDTO {
    
    @Getter
    @Setter
    public static class Response {

        private String id;
        private Double cost;
        private Double depreciation;
        private String costCenter;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;
    }
    
    @Getter
    @Setter
    public static class Request {

        private String id;
        private Double cost;
        private Double depreciation;
        private String costCenter;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;
    }
}

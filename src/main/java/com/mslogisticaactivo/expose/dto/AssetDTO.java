package com.mslogisticaactivo.expose.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class AssetDTO {

    @Getter
    @Setter
    public static class Response {

        private String assetId;
        private String name;
        private String description;
        private String serialNumber;
        private Date acquisitionDate;
        private String brand;
        private Date warranty;
        private String costCenterId;
        private String acquisitionType;
        private String invoice;
        private String supplier;
        private String userId;

        private Boolean isDeleted;
        private Boolean isActive;
        private Boolean isAssigned;
        private String createdBy;
        private LocalDateTime createdDate;
        private String modifiedBy;
        private LocalDateTime modifiedDate;

        private List<HardwareSpecificationDTO> hardwareSpecifications;
        private FinancialInfoDTO financialInfo;
        private List<SoftwareSpecificationDTO> softwareList;
    }

    @Getter
    @Setter
    public static class Request {

        private String assetId;
        private String name;
        private String description;
        private String serialNumber;
        private Date acquisitionDate;
        private String brand;
        private Date warranty;
        private String costCenterId;
        private String acquisitionType;
        private String invoice;
        private String supplier;
        private String userId;

        private Boolean isDeleted;
        private Boolean isActive;
        private Boolean isAssigned;
        private String createdBy;
        private LocalDateTime createdDate;
        private String modifiedBy;
        private LocalDateTime modifiedDate;

        private List<HardwareSpecificationDTO> hardwareSpecifications;
        private FinancialInfoDTO financialInfo;
        private List<SoftwareSpecificationDTO> softwareList;
    }

}

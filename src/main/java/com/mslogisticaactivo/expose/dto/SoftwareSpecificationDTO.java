package com.mslogisticaactivo.expose.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class SoftwareSpecificationDTO {

    @Getter
    @Setter
    public static class Response {

        private String id;
        private String name;
        private String marketVersion;
        private String reportedVersion;
        private String creator;
        private String category;
        private String licenseType;
        private Date installationDate;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;
    }

    @Getter
    @Setter
    public static class Request {

        private String id;
        private String name;
        private String marketVersion;
        private String reportedVersion;
        private String creator;
        private String category;
        private String licenseType;
        private Date installationDate;
        private Boolean isDeleted;
        private Boolean isActive;
        private AssetDTO asset;
    }

}

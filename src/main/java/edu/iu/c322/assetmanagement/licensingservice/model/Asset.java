package edu.iu.c322.assetmanagement.licensingservice.model;

import jakarta.persistence.Transient;

public class Asset {
    private int id;
    private String name;
    private int licenseId;

    @Transient
    private String licenseType;
    @Transient
    private String licenseDescription;
}

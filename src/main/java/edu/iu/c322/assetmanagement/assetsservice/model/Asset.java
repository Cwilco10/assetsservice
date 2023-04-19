package edu.iu.c322.assetmanagement.assetsservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.util.Objects;

@Entity
public class Asset {
    @Id
    private int id;
    private String name;
    private int licenseId;

    @Transient
    private String licenseType;
    @Transient
    private String licenseDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicenseDescription() {
        return licenseDescription;
    }

    public void setLicenseDescription(String licenseDescription) {
        this.licenseDescription = licenseDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asset asset = (Asset) o;
        return id == asset.id && licenseId == asset.licenseId && name.equals(asset.name) && licenseType.equals(asset.licenseType) && Objects.equals(licenseDescription, asset.licenseDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, licenseId, licenseType, licenseDescription);
    }
}

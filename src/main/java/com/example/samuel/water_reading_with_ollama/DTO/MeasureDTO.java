package com.example.samuel.water_reading_with_ollama.DTO;

import java.util.Arrays;
import java.util.Objects;

public class MeasureDTO {

    private Long id;

    private String customerCode;
    private String measureDateTime;
    private String measureType;
    private int originalValue;
    private int measureValue;
    private Boolean hasConfirmed;
    private byte[] image;
    private String imageContentType;

    public MeasureDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getMeasureDateTime() {
        return measureDateTime;
    }

    public void setMeasureDateTime(String measureDateTime) {
        this.measureDateTime = measureDateTime;
    }

    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public int getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(int originalValue) {
        this.originalValue = originalValue;
    }

    public int getMeasureValue() {
        return measureValue;
    }

    public void setMeasureValue(int measureValue) {
        this.measureValue = measureValue;
    }

    public Boolean getHasConfirmed() {
        return hasConfirmed;
    }

    public void setHasConfirmed(Boolean hasConfirmed) {
        this.hasConfirmed = hasConfirmed;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MeasureDTO that = (MeasureDTO) o;
        return getOriginalValue() == that.getOriginalValue() && getMeasureValue() == that.getMeasureValue() && Objects.equals(getId(), that.getId()) && Objects.equals(getCustomerCode(), that.getCustomerCode()) && Objects.equals(getMeasureDateTime(), that.getMeasureDateTime()) && Objects.equals(getMeasureType(), that.getMeasureType()) && Objects.equals(getHasConfirmed(), that.getHasConfirmed()) && Objects.deepEquals(getImage(), that.getImage()) && Objects.equals(getImageContentType(), that.getImageContentType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomerCode(), getMeasureDateTime(), getMeasureType(), getOriginalValue(), getMeasureValue(), getHasConfirmed(), Arrays.hashCode(getImage()), getImageContentType());
    }
}

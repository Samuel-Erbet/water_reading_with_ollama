package com.example.samuel.water_reading_with_ollama.Entity;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Objects;

@Entity
public class Measure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerCode;
    private String measureDateTime;
    private String measureType;
    private int originalValue;
    private int measureValue;
    private Boolean hasConfirmed;
    private byte[] image;
    private String imageContentType;

    public Measure() {
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
        Measure measure = (Measure) o;
        return getOriginalValue() == measure.getOriginalValue() && getMeasureValue() == measure.getMeasureValue() && Objects.equals(getId(), measure.getId()) && Objects.equals(getCustomerCode(), measure.getCustomerCode()) && Objects.equals(getMeasureDateTime(), measure.getMeasureDateTime()) && Objects.equals(getMeasureType(), measure.getMeasureType()) && Objects.equals(getHasConfirmed(), measure.getHasConfirmed()) && Objects.deepEquals(getImage(), measure.getImage()) && Objects.equals(getImageContentType(), measure.getImageContentType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomerCode(), getMeasureDateTime(), getMeasureType(), getOriginalValue(), getMeasureValue(), getHasConfirmed(), Arrays.hashCode(getImage()), getImageContentType());
    }
}

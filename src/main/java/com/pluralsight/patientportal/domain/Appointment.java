package com.pluralsight.patientportal.domain;

/**
 * Appointment domain object
 */
public class Appointment {

    private Integer id;
    private String reason;
    private Boolean insuranceChange;
    private String phoneNumber;

    public Appointment() {

    }

    public Appointment(Integer id, String reason, Boolean insuranceChange, String phoneNumber) {
        this.id = id;
        this.reason = reason;
        this.insuranceChange = insuranceChange;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getInsuranceChange() {
        return insuranceChange;
    }

    public void setInsuranceChange(Boolean insuranceChange) {
        this.insuranceChange = insuranceChange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

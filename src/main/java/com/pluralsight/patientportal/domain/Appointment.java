package com.pluralsight.patientportal.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Appointment domain object
 */
@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

	@NotNull
    @Column(name = "reason", nullable = false)
    private String reason;

    @NotNull
    @Column(name = "insurance_change", nullable = false)
    private Boolean insuranceChange;

    @NotNull
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getReason() {
        return reason;
    }

    public Appointment reason(String reason) {
        this.reason = reason;
        return this;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean isInsuranceChange() {
        return insuranceChange;
    }

    public Appointment insuranceChange(Boolean insuranceChange) {
        this.insuranceChange = insuranceChange;
        return this;
    }

    public void setInsuranceChange(Boolean insuranceChange) {
        this.insuranceChange = insuranceChange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Appointment phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appointment appointment = (Appointment) o;
        if (appointment.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), appointment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Appointment{" +
            "id=" + getId() +
            ", userId='" + getUserId() + "'" +
            ", reason='" + getReason() + "'" +
            ", insuranceChange='" + isInsuranceChange() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }
}
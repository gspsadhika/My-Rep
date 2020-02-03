package com.cts.training.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractual")
//@PrimaryKeyJoinColumn(name="emp_id")
//@DiscriminatorValue(value="CE")
//@AttributeOverrides({
//	@AttributeOverride(name="id", column= @Column(name="id")),
//	@AttributeOverride(name="name", column= @Column(name="name"))
//})

public class ContractualEmployee extends Employee {
	private double payperHour;
	private float contractPeriod;
	public double getPayperHour() {
		return payperHour;
	}
	public void setPayperHour(double payperHour) {
		this.payperHour = payperHour;
	}
	public float getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(float contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
	
	

}

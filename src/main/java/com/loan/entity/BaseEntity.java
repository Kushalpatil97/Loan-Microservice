package com.loan.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseEntity {
	@CreatedDate
	@Column(updatable = false)
	public LocalDateTime createdAt;
	
	
	@Column(updatable = false)
	public String CreatedBy;
	
	@LastModifiedDate
	@Column(updatable = false)
	public LocalDateTime updatedAt;
	
	@LastModifiedBy
	@Column(updatable = false)
	public String Updatedby;
	
	

}

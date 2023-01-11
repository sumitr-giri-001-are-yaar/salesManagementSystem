package com.nissan.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblSalesVist")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Integer visitId; 
	

	
	private String cust_name;
	
	private String contact_person;
	
	private Integer contact_no;
	
	private String  interest_product;
	
	private String visit_subject;
	
	private String description;
	
	@Setter(AccessLevel.NONE) 
	private LocalDate visit_datetime = LocalDate.now();
	
	private Boolean is_disabled;
	
	private Boolean is_deleted;
	
	private Integer emp_id;

	
}

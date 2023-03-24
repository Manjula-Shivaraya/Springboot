package com.psl.SpringBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity //To interact with the database Mysql using JPA.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Department {
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}

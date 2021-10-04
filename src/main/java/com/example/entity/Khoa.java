package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="d_khoa")
public class Khoa {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Khoa [id=" + id + ", name=" + name + "]";
	}
	public Khoa(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Khoa() {
		super();
	}
	
	
}

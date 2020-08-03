package com.zhenzhen.demo.springboot.dto;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;


@Data
public class HelloDto {
	@NotEmpty(message = "名字不能为空")
	private String name;
	private Date date;
	
	public HelloDto(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	public HelloDto() {
		super();
	}
	
	
	
	
}

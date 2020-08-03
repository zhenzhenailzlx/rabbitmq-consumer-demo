package com.zhenzhen.demo.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhenzhen.demo.springboot.common.utils.BeanValidatorUtil;
import com.zhenzhen.demo.springboot.condition.HelloCondition;
import com.zhenzhen.demo.springboot.dto.HelloDto;

import lombok.extern.java.Log;

@RestController
@Log
public class HelloController {

	@GetMapping("/hello")
	public HelloDto hello(HelloCondition helloCondition) {
		BeanValidatorUtil.check(helloCondition);
		log.info("输入参数"+helloCondition);
		return new HelloDto("真哥", new Date());
	}
}

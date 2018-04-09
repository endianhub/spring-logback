package com.xh.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年4月9日
 */
@Controller
@RequestMapping("/test")
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(TestController.class);

	/**
	 * logback测试
	 */
	@RequestMapping("/index")
	public void index() {
		System.out.println("输出日志");
		logger.debug("输出debug级别的日志.....");
		logger.info("输出info级别的日志.....");
		logger.error("输出error级别的日志.....");
	}

}
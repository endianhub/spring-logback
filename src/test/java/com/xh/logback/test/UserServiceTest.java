package com.xh.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年4月9日
 */
public class UserServiceTest {

	private static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

	public static void main(String[] args) {
		logger.debug("输出debug级别的日志.....");
		logger.info("输出info级别的日志.....");
		logger.error("输出error级别的日志.....");
	}
}

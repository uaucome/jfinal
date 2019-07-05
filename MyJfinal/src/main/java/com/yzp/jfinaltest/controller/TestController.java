package com.yzp.jfinaltest.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.yzp.jfinaltest.service.TestService;

/**
 * Description: 接口测试
 *
 * @author yzp
 *
 * @date 2019年7月3日
 */
public class TestController extends Controller {
	
	@Inject
	private TestService testService;
	
	/**
	 * 测试接口
	 */
	public void test() {
		renderText("欢迎来到测试接口");
	}
}

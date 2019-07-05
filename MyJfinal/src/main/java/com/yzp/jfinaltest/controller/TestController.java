package com.yzp.jfinaltest.controller;

import com.alibaba.fastjson.JSONObject;
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
	
	public void test() {
		renderText("欢迎来到测试接口");
	}

	public void getData() {
		//前台需要进行非空判断
		JSONObject object = testService.getData();
		if(object != null) {
			setAttr("obj", object);
			render("index.jsp");
		}else {
			setAttr("obj", null);
		}		
	}
}

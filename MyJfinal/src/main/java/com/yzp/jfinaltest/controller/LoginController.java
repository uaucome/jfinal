package com.yzp.jfinaltest.controller;

import com.jfinal.core.Controller;

/**
 * Description: 登陆模块控制器
 *
 * @author yzp
 *
 * @date 2019年7月5日
 */
public class LoginController extends Controller {
	
	/**
	 * 登陆页
	 */
	public void index() {
		render("login.html");
	}

	/**
	 * 登陆判定
	 */
	public void login() {
		
	}
}

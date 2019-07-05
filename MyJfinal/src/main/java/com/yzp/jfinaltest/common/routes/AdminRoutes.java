package com.yzp.jfinaltest.common.routes;

import com.jfinal.config.Routes;
import com.yzp.jfinaltest.controller.LoginController;

/**
 * Description: 后端路由
 *
 * @author yzp
 *
 * @date 2019年7月5日
 */
public class AdminRoutes extends Routes {

	@Override
	public void config() {
		
		//设置页面base路径
		setBaseViewPath("/view");
		
		//添加测试路由
		//add("/",TestController.class);		// 第三个参数是视图的路径,默认和第一个参数一致
		
		//登陆路由
		add("/",LoginController.class);		

	}

}

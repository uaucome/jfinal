package com.yzp.jfinaltest.common.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;
import com.yzp.jfinaltest.common.routes.AdminRoutes;
import com.yzp.jfinaltest.common.routes.FrontRoutes;

/**
 * Description: 配置文件
 *
 * @author yzp
 *
 * @date 2019年7月3日
 */
public class MyConfig extends JFinalConfig {
	static Prop p;

	/**
	 * 启动入口，运行此 main 方法可以启动项目，此 main 方法可以放置在任意的 Class 类定义中，不一定要放于此
	 */
	public static void main(String[] args) {
		UndertowServer.start(MyConfig.class);
	}

	/**
	 * PropKit.useFirstFound(...) 使用参数中从左到右最先被找到的配置文件
	 * 从左到右依次去找配置，找到则立即加载并立即返回，后续配置将被忽略
	 */
	static void loadConfig() {
		if (p == null) {
			p = PropKit.useFirstFound("config-pro.txt", "config-dev.txt");
		}
	}

	/**
	 * 配置常量
	 */
	@Override
	public void configConstant(Constants me) {
		loadConfig();

		me.setDevMode(p.getBoolean("devMode", false));

		/**
		 * 支持 Controller、Interceptor、Validator 之中使用 @Inject 注入业务层，并且自动实现 AOP
		 * 注入动作支持任意深度并自动处理循环注入
		 */
		me.setInjectDependency(true);

		// 配置对超类中的属性进行注入
		me.setInjectSuperClass(true);

	}

	/**
	 * 配置路由，设置了前端路由和后端路由
	 */
	@Override
	public void configRoute(Routes me) {
		me.add(new FrontRoutes()); // 前端路由
		me.add(new AdminRoutes()); // 后端路由
	}

	/**
	 * 配置插件
	 */
	@Override
	public void configPlugin(Plugins me) {
		Prop p = PropKit.use("config-dev.txt");
		DruidPlugin druidPlugin = new DruidPlugin(p.get("jdbcUrl"), p.get("username"), p.get("password"));
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		arp.setShowSql(true);
		// 所有映射在 MappingKit 中自动化搞定
		//_MappingKit.mapping(arp);
		me.add(arp);
		//启动druid
		druidPlugin.start();
	}

	/**
	 * 配置引擎模板
	 * 
	 */
	@Override
	public void configEngine(Engine me) {

	}

	/**
	 * 可以添加自定义的handler,handler对所有的web请求有着完全的控制权
	 * 设置上下文路径放置样式丢失
	 * 
	 */
	@Override
	public void configHandler(Handlers me) {
		me.add(new ContextPathHandler("ctx"));
	}

	/**
	 * 配置全局拦截器
	 *
	 */
	@Override
	public void configInterceptor(Interceptors me) {

	}

}

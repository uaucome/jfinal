package com.yzp.jfinaltest.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.log.Log;
import com.yzp.jfinaltest.model.Ujfinal;

public class TestService {
	
	private Log logger = Log.getLog(TestService.class);
	
	private Ujfinal dao = new Ujfinal().dao();

	public JSONObject getData() {
		JSONObject object = new JSONObject();
		List<Ujfinal> ujfinals = null;
		try {
			String sql = "select * from ujfinal";
			ujfinals = dao.find(sql);
			if(ujfinals != null && ujfinals.size() > 0) {
				object.put("user", ujfinals);
				object.put("users", null);
			}else {
				object = null;
				logger.info("没有数据");
			}
		}catch (Exception e) {
			logger.info("sql查询出错: "+e);
		}
		return object;
	}

}

package com.yzp.jfinaltest.common;

import javax.sql.DataSource;
import com.jfinal.plugin.activerecord.generator.MetaBuilder;

/**
 * Description: 添加数据库中的表名的工具类
 *
 * @author yzp
 *
 * @date 2019年7月3日
 */
public class MetaBuliderUtil extends MetaBuilder {
	
	private String tablePrefix;
	
	public MetaBuliderUtil(DataSource dataSource) {
		super(dataSource);
	}
	
	public void setTablePrefix(String tablePrefix){
        this.tablePrefix = tablePrefix;
    }

    @Override
    protected  boolean isSkipTable(String tableName){
        return !tableName.contains(tablePrefix);
    }

}

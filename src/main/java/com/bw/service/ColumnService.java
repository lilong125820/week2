package com.bw.service;

import java.util.List;

import com.bw.domain.Column;
import com.bw.vo.Vo;
/**
 * 
 * @ClassName: ColumnService 
 * @Description: TODO
 * @author: lilong
 * @date: 2020年1月6日 上午11:35:08
 */
public interface ColumnService {
	//读取文件后向数据库批量插入
	void insert(List<Column> list1);
	//列表查询
	List<Column> getlist(Vo vo);
	//数据回显
	Column select(Integer id);
	//数据修改
	int update(Column c);

}

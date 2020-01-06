package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.domain.Column;
import com.bw.vo.Vo;
/**
 * 
 * @ClassName: ColumnDao 
 * @Description: TODO
 * @author: lilong
 * @date: 2020年1月6日 上午11:34:34
 */
public interface ColumnDao {
	void insert(@Param("c")Column column,@Param("date")String string2);
	//列表查询
	List<Column> getlist(Vo vo);
	//数据回显
	Column select(Integer id);
	//数据修改
	int update(Column c);

}

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
 * @date: 2020��1��6�� ����11:34:34
 */
public interface ColumnDao {
	void insert(@Param("c")Column column,@Param("date")String string2);
	//�б��ѯ
	List<Column> getlist(Vo vo);
	//���ݻ���
	Column select(Integer id);
	//�����޸�
	int update(Column c);

}

package com.bw.service;

import java.util.List;

import com.bw.domain.Column;
import com.bw.vo.Vo;
/**
 * 
 * @ClassName: ColumnService 
 * @Description: TODO
 * @author: lilong
 * @date: 2020��1��6�� ����11:35:08
 */
public interface ColumnService {
	//��ȡ�ļ��������ݿ���������
	void insert(List<Column> list1);
	//�б��ѯ
	List<Column> getlist(Vo vo);
	//���ݻ���
	Column select(Integer id);
	//�����޸�
	int update(Column c);

}

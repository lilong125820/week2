package com.bw.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.ColumnDao;
import com.bw.domain.Column;
import com.bw.service.ColumnService;
import com.bw.vo.Vo;
/**
 * 
 * @ClassName: ColumnServiceImpl 
 * @Description: TODO
 * @author: lilong
 * @date: 2020��1��6�� ����11:35:03
 */
@Service
public class ColumnServiceImpl implements ColumnService {
	@Autowired
	private ColumnDao columnDao;
	//��ȡ�ļ��������ݿ���������
	@SuppressWarnings("deprecation")
	@Override
	public void insert(List<Column> list1) {
		for (Column column : list1) {
			Date date = column.getDate();
			String string = date.toLocaleString();
			String string2 = string.substring(0,9);
			columnDao.insert(column,string2);
		}
		
	}
	//�б��ѯ
	@Override
	public List<Column> getlist(Vo vo) {
		return columnDao.getlist(vo);
	}
	//���ݻ���
	@Override
	public Column select(Integer id) {
		return columnDao.select(id);
	}
	//�����޸�
	@Override
	public int update(Column c) {
		// TODO Auto-generated method stub
		return columnDao.update(c);
	}
}

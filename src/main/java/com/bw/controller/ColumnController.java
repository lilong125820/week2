package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.domain.Column;
import com.bw.service.ColumnService;
import com.bw.vo.Vo;
import com.github.pagehelper.PageHelper;
/**
 * 
 * @ClassName: ColumnController 
 * @Description: TODO
 * @author: lilong
 * @date: 2020年1月6日 上午11:34:43
 */
@Controller
public class ColumnController {
	@Autowired
	private ColumnService columnService;
	//列表查询
	@RequestMapping("list")
	public String getlist(Model m,@RequestParam(defaultValue ="1")Integer page,Vo vo) {
		PageHelper.startPage(page,3);
		List<Column> list=columnService.getlist(vo);
		m.addAttribute("list",list);
		m.addAttribute("page",page);
		m.addAttribute("v",vo);
		return "list";
	}
	@RequestMapping("sh")
	public String sh(Integer id,Model m) {
		Column c=columnService.select(id);
		m.addAttribute("c",c);
		return "sh";
	}
	@RequestMapping("shz")
	public int shz(@ModelAttribute("c")Column c) {
		int i=columnService.update(c);
		return i;
	}
}

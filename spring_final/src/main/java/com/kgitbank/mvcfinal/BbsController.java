package com.kgitbank.mvcfinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("select")
	public void select(BbsDTO bbsDto, Model model) {
		System.out.println("��Ʈ�ѷ� �Ѿ��");
		BbsDTO dto = dao.select(bbsDto);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("selectAll")
	public void selectAll(Model model){
		List<BbsDTO> list = dao.selectAll();
//		for(int i = 0; i < list.size(); i++) {
//			BbsDTO dto = list.get(i);
//			System.out.println(dto.getId());
//			System.out.println(dto.getTitle());
//			System.out.println(dto.getContent());
//			System.out.println(dto.getWriter());
//			System.out.println("-------------------------------");
//		}
		//view���Ͽ��� ��� ���� ���� �� �ֵ��� �ϴ� ����̴�.
		model.addAttribute("list", list);
	}
}
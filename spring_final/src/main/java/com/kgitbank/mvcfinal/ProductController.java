package com.kgitbank.mvcfinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("insert2")
	public void insert(ProductDTO dto) {
		dao.insert(dto);
	}
	
	@RequestMapping("select2")
	public void select(ProductDTO productDto, Model model) {
		System.out.println("��Ʈ�ѷ� �Ѿ��");
		ProductDTO dto = dao.select(productDto);
		model.addAttribute("dto", dto);
		//��� ������ ����
		System.out.println("------------------------");
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setProductId(dto.getId());
		List<ReplyDTO> list2 = dao2.selectAll(dto2);
		model.addAttribute("list2", list2);
//		for(ReplyDTO replyDTO : list2) {
//			System.out.println(replyDTO);
//		}
	}

	@RequestMapping("selectAll2")
	public void selectAll(Model model){
		List<ProductDTO> list = dao.selectAll();
		//view���Ͽ��� ��� ���� ���� �� �ֵ��� �ϴ� ����̴�.
		model.addAttribute("list", list);
	}
}
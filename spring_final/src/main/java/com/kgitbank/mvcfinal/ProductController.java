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
		System.out.println("컨트롤러 넘어옴");
		ProductDTO dto = dao.select(productDto);
		model.addAttribute("dto", dto);
		//댓글 가지고 오기
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
		//view파일에서 모든 값을 찍을 수 있도록 하는 방법이다.
		model.addAttribute("list", list);
	}
}
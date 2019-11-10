package com.kgitbank.mvcfinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductDAO {
	@Autowired
	SqlSessionTemplate my;
	//my�� context.xml���� ���� �̱��� ��ü�� my�� �ҷ����� ����. my���� sql���ð� ���� ������� �������.

	public void insert(ProductDTO dto) {
		my.insert("product.insert2", dto);
	}
	
	public ProductDTO select(ProductDTO dto) {
		return my.selectOne("product.select2", dto);
	}
	
	public List<ProductDTO> selectAll(){ //ArrayList�� ������� �ʰ� List<>�� �� ������ �ڵ����� ����ȯ. �ڵ� ����ȯ �� ĳ������ ����ϱ� �����̴�.
		return my.selectList("product.selectAll2");
		//my�� sql������ �� ���� List�������� ������ ��簪�� �������� �޼ҵ带 ����Ͽ� �� ���� list�� �ְڴٴ� �Ҹ���.
	}
	
}

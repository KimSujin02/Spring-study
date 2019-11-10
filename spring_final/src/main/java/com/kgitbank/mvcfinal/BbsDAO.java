package com.kgitbank.mvcfinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;
	//my�� context.xml���� ���� �̱��� ��ü�� my�� �ҷ����� ����. my���� sql���ð� ���� ������� �������.

	public BbsDTO select(BbsDTO dto) {
		return my.selectOne("bbs.select", dto);
	}
	
	public List<BbsDTO> selectAll(){ //ArrayList�� ������� �ʰ� List<>�� �� ������ �ڵ����� ����ȯ. �ڵ� ����ȯ �� ĳ������ ����ϱ� �����̴�.
		return my.selectList("bbs.selectAll");
		//my�� sql������ �� ���� List�������� ������ ��簪�� �������� �޼ҵ带 ����Ͽ� �� ���� list�� �ְڴٴ� �Ҹ���.
	}
	
}

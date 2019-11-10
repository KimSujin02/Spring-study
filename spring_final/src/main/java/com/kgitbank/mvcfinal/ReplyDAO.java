package com.kgitbank.mvcfinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ReplyDAO {
	@Autowired
	SqlSessionTemplate my;
	//my�� context.xml���� ���� �̱��� ��ü�� my�� �ҷ����� ����. my���� sql���ð� ���� ������� �������.
	
	public List<ReplyDTO> selectAll(ReplyDTO dto){ //ArrayList�� ������� �ʰ� List<>�� �� ������ �ڵ����� ����ȯ. �ڵ� ����ȯ �� ĳ������ ����ϱ� �����̴�.
		return my.selectList("reply.selectAll3", dto);
		//my�� sql������ �� ���� List�������� ������ ��簪�� �������� �޼ҵ带 ����Ͽ� �� ���� list�� �ְڴٴ� �Ҹ���.
	}
}

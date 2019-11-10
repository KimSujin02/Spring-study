package com.kgitbank.mvcfinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	SqlSessionTemplate my;

	public void insert(MemberDTO dto) {
		my.insert("member.insert", dto);
		//member.xml파일에서 mapper태그에서 member라고 이름이 정의된 태그안에 있는 insert를 쓸것이다.
	}
}

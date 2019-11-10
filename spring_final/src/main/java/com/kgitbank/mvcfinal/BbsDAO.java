package com.kgitbank.mvcfinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;
	//my는 context.xml에서 만든 싱글톤 객체인 my를 불러오는 거임. my에는 sql세팅과 같은 내용들이 들어있음.

	public BbsDTO select(BbsDTO dto) {
		return my.selectOne("bbs.select", dto);
	}
	
	public List<BbsDTO> selectAll(){ //ArrayList를 사용하지 않고 List<>를 쓴 이유는 자동으로 형변환. 자동 형변환 업 캐스팅을 사용하기 위함이다.
		return my.selectList("bbs.selectAll");
		//my로 sql세팅을 한 것을 List형식으로 다음의 모든값을 가져오는 메소드를 사용하여 그 값을 list에 넣겠다는 소리다.
	}
	
}

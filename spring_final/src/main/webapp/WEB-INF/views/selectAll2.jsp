<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- css적용하는 방법이다. -->
<link rel="stylesheet" type="text/css" href="resources/css/project.css">

</head>
<body>
<div id="total">
	<!-- top 메뉴 들어가는 부분 -->
	<div id="top">
		<jsp:include page="top.jsp"/>
	</div>
	<!-- 장바구니 고정시킬 곳 -->
	<div id="top2">
		<jsp:include page="top2.jsp"/>
	</div>
	
	<div id="content">
		<h3>제품 전체 출력</h3>
		<hr color="lime">
		<table border=1>
		<tr>
			<th>아이디</th>
			<th>제목</th>
			<th>내용</th>
			<th>가격</th>
			<th>대표이미지</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.id}</td>
				<td><a href="select2?id=${dto.id}"> ${dto.title} </a></td>
				<td>${dto.content}</td>
				<td>${dto.price}</td>
				<td><img width=200 height=200 src=resources/img/${dto.img}></td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
</body>
</html>
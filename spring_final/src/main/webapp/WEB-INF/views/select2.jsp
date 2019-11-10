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
		<h3>제품정보</h3>
		<hr color="lime">
		<table border=1 width="500" height="700">
		<tr>
			<td width="100">아이디</td>
			<td>${dto.id}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${dto.title}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td height="300">${dto.content}</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>${dto.price}</td>
		</tr>
		<tr>
			<td>대표이미지</td>
			<td><img width=200 height=200 src=resources/img/${dto.img}></td>
		</tr>
		</table>
	</div>
	
	<hr color="lime">
	<div id="result">
		<c:forEach var="dto2" items="${list2}">
		-${dto2.content}, ${dto2.writer} <br>
		</c:forEach>
	</div>
</div>
</body>
</html>
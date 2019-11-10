<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h3>게시판 출력</h3>
		<hr color="lime">
		<table border=1 width="500" height="600">
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
			<td>작성자</td>
			<td>${dto.writer}</td>
		</tr>
		</table>
	</div>
</div>
</body>
</html>
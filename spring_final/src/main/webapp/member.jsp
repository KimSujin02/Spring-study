<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
		<form action="insert">
			<table>
				<tr>
					<td>아이디 : </td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>비밀번호 : </td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td>이름 : </td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>전화번호 : </td>
					<td><input type="text" name="tell"></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">회원가입 처리</button></td>
				</tr>
		</table>
		</form>
	</div>
</div>
</body>
</html>
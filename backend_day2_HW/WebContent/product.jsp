<%@page import="com.ssafy.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Product product = (Product) request.getAttribute("product");
	%>
	<h1>상품이 저장되었습니다.</h1>
	<table>
		<tr><td>상품번호</td><td><%=product.getNum() %></td></tr>
		<tr><td>상품명</td><td><%=product.getName() %></td> </tr>
		<tr><td>상품 가격</td><td><%=product.getPrice() %></td> </tr>
		<tr><td>상품 설명</td><td><%=product.getContent() %></td> </tr>
	</table>
</body>
</html>
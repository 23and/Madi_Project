<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>로그인 후 header</title>
		${member.name} 로그인
		<a href="<%=request.getContextPath()%>/login.do?command=logout">Logout</a>
	</head>
</html>
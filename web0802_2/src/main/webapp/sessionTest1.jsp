<%@page import="java.util.Arrays"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%
    session.setAttribute("key1", "문자열");//setattribute : 공통 세션안에 내용저장
    session.setAttribute("key2", Arrays.asList("홍길동","강하나","김하늘"));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 저장
</body>
</html>
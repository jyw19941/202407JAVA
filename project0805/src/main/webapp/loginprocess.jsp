<%@page import="account.accountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Process</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    String pw = request.getParameter("password");
    String id = request.getParameter("ID");
    accountDAO dao = new accountDAO();

    if (dao.checkLogin(id, pw)) {
     	//로그인 성공 , 쿠키 설정
     	Cookie loginCookie = new Cookie("username", username);
     	loginCookie.setMaxAge(60*60);
     	response.addCookie(loginCookie);
     	out.println("<script>");
    	out.println("alert('환영합니다!');");
     	out.println("window.location.href = 'login_main.jsp';");
     	out.println("</script>");
    } else {
    	out.println("<script>");
    	out.println("alert('아이디 또는 비밀번호가 틀립니다!')");
    	out.println("history.back()");
    	out.println("</script>");
    }

%>
</body>
</html>
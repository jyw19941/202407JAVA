<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    // 현재 세션 가져오기
    HttpSession mySession = request.getSession(false);

    // 세션에서 로그인 정보 가져오기
    String username = null;
    if (mySession != null) {
        username = (String) mySession.getAttribute("username");
    }

    // 로그인 되어 있지 않으면 로그인 페이지로 리디렉션
    if (username == null) {
        // 로그인하지 않은 상태에서 접근 시 경고 메시지 출력 후 리디렉션
        String message = "로그인이 필요합니다. 로그인 페이지로 이동합니다.";
        out.println("<script type='text/javascript'>");
        out.println("alert('" + message + "');");
        out.println("window.location.href='login.jsp';");
        out.println("</script>");
        return;
    }

    // 로그인된 경우, 게시판 페이지로 리디렉션
    response.sendRedirect("index.jsp");
%>

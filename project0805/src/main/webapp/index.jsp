<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 데이터베이스 접속
BoardDAO dao = new BoardDAO();
List<BoardDTO> list = dao.getBoardList();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        table {
            width: 680px;
            margin: 20px auto; /* 중앙 정렬 */
            text-align: center;
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        th, td {
            padding: 10px;
            border: 3px solid #ddd;
        }
        th {
            background-color: silver;
        }
        .num      { width: 80px; }
        .title    { width: 230px; }
        .writer   { width: 100px; }
        .regtime  { width: 250px; }
        .hit	{width:150px;}
        a:link    { text-decoration: none; color: blue; }
        a:visited { text-decoration: none; color: gray; }
        a:hover   { text-decoration: none; color: red; }
        .button-container {
            margin: 20px;
        }
        .button-container input[type="button"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            margin: 5px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .button-container input[type="button"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<table>
    <thead>
        <tr>
            <th class="num">번호</th>
            <th class="title">제목</th>
            <th class="writer">작성자</th>
            <th class="regtime">작성일시</th>
            <th class="hit">조회수</th>
        </tr>
    </thead>
    <tbody>
    <%
    for (BoardDTO dto : list) {
    %>
        <tr>
            <td><%= dto.getNum() %></td>
            <td style="text-align:left;">
                <a href="view.jsp?num=<%= dto.getNum() %>"><%= dto.getTitle() %></a>
            </td>
            <td><%= dto.getWriter() %></td>
            <td><%= dto.getRegtime() %></td>
            <td><%= dto.getHits() %></td>
        </tr>
    <%
    }
    %>
    </tbody>
</table>

<div class="button-container">
    <input type="button" value="글쓰기" onclick="location.href='write.jsp'">
    <input type="button" value="홈으로" onclick="location.href='login_main.jsp'">
</div>

</body>
</html>

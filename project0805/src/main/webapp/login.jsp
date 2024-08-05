<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>












<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로 그 인</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: #fff;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px; /* Increased width */
            max-width: 100%; /* Responsive design */
        }
        .login-container h2 {
            margin-bottom: 30px; /* Increased margin */
            color: #333;
            font-size: 24px; /* Increased font size */
            text-align: center;
        }
        .login-container input {
            width: calc(100% - 20px); /* Full width with padding adjustment */
            padding: 15px; /* Increased padding */
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px; /* Increased font size */
        }
        .login-container button {
            width: calc(100% - 0px); /* Full width with padding adjustment */
            
            padding: 20px;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 18px; /* Increased font size */
            cursor: pointer;
            margin-top: 10px auto;
        }
        .login-container button:hover {
            background-color: #0056b3;
        }
        .login-container .message {
            margin-top: 20px;
            text-align: center;
            color: #666;
        }
        .login-container .message a {
            color: #007bff;
            text-decoration: none;
        }
        .login-container .message a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="loginprocess.jsp" method="post">
            <input type="text" name="ID" placeholder="ID" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
        <div class="message">
            <p>아이디가 존재하지 않으면</p><p> <a href="signup.jsp">회원 가입</a>을 눌러주세요</p>
        </div>
    </div>
</body>
</html>

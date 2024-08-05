<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Website</title>
    <style>
        @charset 'utf-8';
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }
        ul,
        ol {
            list-style: none;
        }
        a {
            text-decoration: none;
        }

        /* header */
        header {
            width: 100%;
            border-bottom: 1px solid #ddd;
        }
        header .inner {
            width: 1180px;
            height: 120px;
            margin: 0px auto;
            position: relative;
        }
        header .inner h1 {
            position: absolute;
            left: 0px;
            bottom: 15px;
        }
        header .inner h1 a {
            font: bold 24px/1 "arial";
            color: #444;
        }
        header .inner .util {
            position: absolute;
            top: 20px;
            right: 30px;
        }
        header .inner .util li {
            float: left;
        }
        header .inner .util li a {
            display: block;
            font: 12px/1 "arial";
            color: #999;
            padding: 0px 10px;
        }
        header .inner #gnb {
            position: absolute;
            bottom: 0px;
            right: 0px;
        }
        header .inner #gnb li {
            float: left;
        }
        header .inner #gnb li a {
            display: block;
            font: bold 15px/1 "arial";
            color: #555;
            padding: 20px 40px;
            transition: all 0.5s;
        }
        header .inner #gnb li a:hover {
            background: #555;
            color: #fff;
        }
        figure {
            width: 100%;
            height: calc(100vh - 120px);
            background: #000;
            position: relative;
            overflow: hidden;
            padding-top: 250px;
        }
        figure video {
            object-fit: cover;
            width: 100%;
            height: 100%;
            opacity: 0.3;
            position: absolute;
            top: 0px;
            left: 0px;
        }
        figure .inner {
            width: 1180px;
            margin: 0px auto;
            position: relative;
        }
        figure .inner h1 {
            font: normal 120px/1 "arial";
            color: #fff;
            margin-bottom: 20px;
        }
        figure .inner p {
            font: 16px/1.4 "arial";
            color: #888;
            margin-bottom: 60px;
        }
        figure .inner a {
            display: block;
            width: 400px;
            height: 30px;
            border: 1px solid #bbb;
            font: bold 11px/30px "arial";
            color: #fff;
            text-align: center;
            letter-spacing: 1px;
            transition: all 0.5s;
        }
        figure .inner a:hover {
            background: #fff;
            color: #555;
        }
        /* news */
        section {
            width: 100%;
            padding: 200px 0px;
        }
        section .inner {
            width: 1180px;
            margin: 0px auto;
        }
        section .inner h1 {
            font: bold 24px/1 "arial";
            color: #555;
            text-align: center;
            margin-bottom: 50px;
        }
        section .inner .wrap {
            width: 100%;
        }
        section .inner .wrap::after {
            content: "";
            display: block;
            clear: both;
        }
        section .inner .wrap article {
            width: 280px;
            float: left;
            margin-right: 20px;
        }
        section .inner .wrap article:last-child {
            margin-right: 0px;
        }
        section .inner .wrap article h2 {
            margin-bottom: 10px;
        }
        section .inner .wrap article h2 a {
            font: bold 16px/1 "arial";
            color: #555;
        }
        section .inner .wrap article p {
            font: 14px/1.4 "arial";
            color: #777;
        }
        section .inner .wrap article .pic {
            width: 100%;
            height: 120px;
            background: #333;
            margin-bottom: 15px;
            position: relative;
            overflow: hidden;
        }
        section .inner .wrap article .pic img {
            object-fit: cover;
            width: 100%;
            height: 100%;
        }
        /* footer */
        footer {
            width: 100%;
            background: #333;
            padding: 100px 0px;
            border-top: 1px solid #888;
        }
        footer .inner {
            width: 1180px;
            margin: 0px auto;
        }
        footer .inner .upper {
            width: 100%;
            border-bottom: 1px solid #777;
            padding-bottom: 20px;
        }
        footer .inner .upper::after {
            content: "";
            display: block;
            clear: both;
        }
        footer .inner .upper h1 {
            float: left;
            font: bold 24px/1 "arial";
            color: #666;
        }
        footer .inner .upper ul {
            float: right;
        }
        footer .inner .upper ul li {
            float: left;
            margin-left: 20px;
        }
        footer .inner .upper ul li a {
            font: bold 14px/1 "arial";
            color: #666;
        }
        footer .inner .lower {
            width: 100%;
            padding-top: 20px;
        }
        footer .inner .lower address {
            width: 100%;
            font: 12px/1.3 "arial";
            color: #777;
            margin-bottom: 20px;
        }
        footer .inner .lower p {
            width: 100%;
            font: 12px/1 "arial";
            color: #777;
        }
    </style>
</head>
<body>
    <header>
        <div class="inner">
            <h1><a href="#">My Website</a></h1>
            <ul class="util">
                <li><a href="logout.jsp">Logout</a></li>
               
            </ul>
            <ul id="gnb">
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </div>
    </header>
    <figure>
        <video src="images/visual.mp4" autoplay muted loop></video>
        <div class="inner">
            <h1>Welcome to My Website</h1>
            <p>Your subtitle or description here</p>
            <a href="#">Learn More</a>
        </div>
    </figure>
    <section>
        <div class="inner">
            <h1>Latest News</h1>
            <div class="wrap">
                <article>
                    <div class="pic"><img src="images/brand4.jpg" alt="News Image 1"></div>
                    <h2><a href="index.jsp">게시판</a></h2>
                    <p>News description here.</p>
                </article>
               >
                <!-- Add more articles as needed -->
            </div>
        </div>
    </section>
    <footer>
        <div class="inner">
            <div class="upper">
                <h1>Footer Title</h1>
                <ul>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms of Service</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>
            <div class="lower">
       

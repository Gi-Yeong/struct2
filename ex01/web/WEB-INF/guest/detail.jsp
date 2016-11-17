<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style></style>
    <!-- jQuery (자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/grid.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="grid12">
            <h1>상세보기</h1>
        </div>
    </div>
    <div class="row">
        <div class="grid4">사번</div>
        <div class="grid12">${bean.sabun}</div>
    </div>
    <div class="row">
        <div class="grid4">이름</div>
        <div class="grid12">${bean.name}</div>
    </div>
    <div class="row">
        <div class="grid4">날짜</div>
        <div class="grid12">${bean.nalja}</div>
    </div>
    <div class="row">
        <div class="grid4">금액</div>
        <div class="grid12">${bean.pay}</div>
    </div>
    <div class="row">
        <div class="grid12">
            <a href="./add.do?idx=${bean.sabun}">수정</a>
            <a href="./del.do?idx=${bean.sabun}">삭제</a>
        </div>
    </div>
</div>
</body>
</html>

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
    <title>LogIN</title>
</head>
<body>
<h1>로그인 페이지</h1>
<form method="post">
    <p>
        <label for="sabun">sabun</label>
        <input type="text" name="sabun" id="sabun">
        ${param.errMsg1}
    </p>
    <p>
        <label for="name">name</label>
        <input type="text" name="name" id="name">
        ${param.errMsg2}
    </p>
    <p>
        <button type="submit">로그인</button>
        <button type="reset">취소</button>
    </p>
</form>
</body>
</html>

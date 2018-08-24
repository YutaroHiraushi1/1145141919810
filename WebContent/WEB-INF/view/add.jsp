<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<body>
	<p>登録</p>
	<form action="/Capacity11/AddResult" method="post">
		学籍番号：<input type="text" name="num"><br>
		名前：<input type="text" name="name	"><br>
		パスワード：<input type="password" name="pass"><br>
		<input type="submit" value="登録">
	</form>
</body>
</html>
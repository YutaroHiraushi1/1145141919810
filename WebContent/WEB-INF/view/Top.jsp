<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<p>ログイン</p>
	<form action="/natukadai/Show" method="post">
		学籍番号:<input type="text" name="num"><br>
		パスワード:<input type="password" name="pass"><br>
		<input type="submit" value="ログイン">
	</form>
	<p><a href="/natukadai/Add">新規登録</a></p>
</body>
</html>
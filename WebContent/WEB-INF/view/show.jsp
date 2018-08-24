<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Dto.kadaidto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録兼一覧</title>
</head>
<body>
	<p>
	下のほうに一覧が表示されています。<br>
	受験内容登録</p>
	<form action="/Capacity11/Insert" method="post">
				<table>
					<tbody>
						<tr>
							<th>受験資格名</th>
							<td><select name="juken" required>
							<option value="基本情報技術者試験">基本情報技術者試験</option>
							<option value="応用情報技術者試験">応用情報技術者試験</option>
							</select></td>
						</tr>
						<tr>
							<th>年</th>
							<td><select name="year" required>
									<option value="-" selected>-</option>
									<option value="2011">2011</option>
									<option value="2012">2012</option>
									<option value="2013">2013</option>
									<option value="2014">2014</option>
									<option value="2015">2015</option>
									<option value="2016">2016</option>
									<option value="2017">2017</option>
									<option value="2018">2018</option>
									<option value="2019">2019</option>
									<option value="2020">2020</option>
									<option value="2021">2021</option>
									<option value="2022">2022</option>
									<option value="2023">2023</option>
									<option value="2024">2024</option>
									<option value="2025">2025</option>
									<option value="2026">2026</option>
									<option value="2027">2027</option>
									<option value="2028">2028</option>
									<option value="2029">2029</option>
									<option value="2030">2030</option>
							</select></td>
						</tr>
						<tr>
							<th>月</th>
							<td><select name="month" required>
									<option value="">-</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
							</select></td>
						</tr>
						<tr>
							<th>日</th>
							<td><select name="day">
									<option value="">-</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
									<option value="13">13</option>
									<option value="14">14</option>
									<option value="15">15</option>
									<option value="16">16</option>
									<option value="17">17</option>
									<option value="18">18</option>
									<option value="19">19</option>
									<option value="20">20</option>
									<option value="21">21</option>
									<option value="22">22</option>
									<option value="23">23</option>
									<option value="24">24</option>
									<option value="25">25</option>
									<option value="26">26</option>
									<option value="27">27</option>
									<option value="28">28</option>
									<option value="29">29</option>
									<option value="30">30</option>
									<option value="31">31</option>
							</select></td>
						</tr>
						<tr>
							<th>結果</th>
							<td><select name="result">
								<option>受験予定</option>
								<option>合格</option>
								<option>不合格</option>
							</select></td>
						</tr>
				</table>
					<input type="submit" value="登録">
			</form>
	<table>
		<caption>受験結果一覧</caption>
			<tr>
				<th>資格名</th>
				<th>受験日</th>
				<th>結果</th>
			</tr>
			<%ArrayList<kadaidto> result = (ArrayList<kadaidto>) request.getAttribute("result");
					for (kadaidto  keigo: result) {%>
			<tr>
				<td><%=keigo.getName()%></td>
				<td><%=keigo.getDate()%></td>
				<td><%=keigo.getResult()%></td>
			</tr>
			<%}%>
	</table>
</body>
</html>
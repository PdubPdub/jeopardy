<%@ page import="beans.*"%>
		<jsp:useBean  id="question" type="beans.QuestionBean"  class="beans.QuestionBean" 
		scope="request" />
<html>
<head><META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
	<link rel="stylesheet" type="text/css" href="css/css3.css">
<html>
<body><div>
	</br>
		<div class ="cat"><p class="daily">${requestScope.dailylbl}</p></br>
			Category: <jsp:getProperty name="question" property="category" /></br>
			Question: <jsp:getProperty name="question" property="question" /></br>
			</br>
		</div>
			<br>
		<div class="name">
			</br>
			<form method="get" action="Display?">
				<input type="hidden" name="x" value="${requestScope.x}" />
				<input type="hidden" name="y" value="${requestScope.y}" />
				<input type="${requestScope.radio}" name="answer" value="${question.a1}" required>${requestScope.hide1}</input></br>
				<input type="${requestScope.radio}" name="answer" value="${question.a2}">${requestScope.hide2}</input></br>
				<input type="${requestScope.radio}" name="answer" value="${question.a3}">${requestScope.hide3}</input></br>
				<input type="${requestScope.radio}" name="answer" value="${question.a4}">${requestScope.hide4}</input></br>
				</br>
				<input class="name" type="${requestScope.activate}" name="bet" min="0" max="1000" size="30" placeholder="Enter Bet" required></input></br></br>
				<input class="submit" type="${requestScope.submit}" value="Answer" /></br>
			</form>
		</div>
		<div class="name">${requestScope.rightwrong}
		</br></br>
			<form action="${requestScope.jsppage}">
	<input class="submit" type="${requestScope.ret}" value="${requestScope.buttonText}" />
			</form>
		</div>
	</div>
</body>
</html>

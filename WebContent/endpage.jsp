<%@ page import="beans.*"%>
		<jsp:useBean  id="question" type="beans.QuestionBean"  class="beans.QuestionBean" 
		scope="request" />
<html>
<head><META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<link rel="stylesheet" type="text/css" href="css/css4.css">
<html>
<body>
	</br></br>
	<div>
		<div class ="name">CONGRATUALATIONS!<br><p class="cat">${sessionScope.userName}<p>
		</div>
		</br>
		<div class="cat">
			FINAL SCORE: ${sessionScope.score}!<br>
			<p class="name">Trebek is still not impressed...</p>
		</div>
	</div>
</body>
</html>
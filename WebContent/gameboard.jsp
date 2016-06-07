<%@ page import="beans.*"%>
		<jsp:useBean  id="board" type="beans.QuestionBean"  class="beans.QuestionBean" 
		scope="request" />



<html>
<head><META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<link rel="stylesheet" type="text/css" href="css/css2.css">
</head>
	<body>
		<p align="center"><img class="logo" src="images/logo3.png"/></p>
		<div class="name"><p class="header">${sessionScope.userName}</p></div>
		</br>
		<div class="score"><p>SCORE</br>${sessionScope.score}</p>
		</form></div>
		<div class="board">
			<div class="cat"><p>FAMOUS MUSICIANS</p></div>
		    <div class="cat"><p>VIDEO GAME VILLAINS</p></div>
			<div class="cat"><p>GAME SHOWS</p></div>
			<div class="cat"><p>COMIC BOOK CHARACTERS</p></div>
			<div class="cat"><p>SATURDAY NIGHT LIVE ACTORS</p></div>
			<form method="get" action='Display?'>
				<input type="hidden" name="q" value="0" />
     			<input type="hidden" name="x" value="0" />
     			<input type="hidden" name="y" value="0" />
				<div><button id="btns" class="question" onclick="" ${picked[0].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="5" />
     			<input type="hidden" name="x" value="1" />
     			<input type="hidden" name="y" value="0" />
			    <div><button id="btns" class="question" onclick="" ${picked[5].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="10" />
				<input type="hidden" name="x" value="2" />
     			<input type="hidden" name="y" value="0" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[10].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="15" />
				<input type="hidden" name="x" value="3" />
     			<input type="hidden" name="y" value="0" />     
			    <div><button id="btns" class="question" onclick="" ${picked[15].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="20" />
				<input type="hidden" name="x" value="4" />
     			<input type="hidden" name="y" value="0" />  
			    <div><button id="btns" class="question" onclick="" ${picked[20].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="1" />
				<input type="hidden" name="x" value="0" />
     			<input type="hidden" name="y" value="1" />  
			    <div><button id="btns" class="question" onclick="" ${picked[1].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="6" />
				<input type="hidden" name="x" value="1" />
     			<input type="hidden" name="y" value="1" />    	
			    <div><button id="btns" class="question" onclick="" ${picked[6].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="11" />
				<input type="hidden" name="x" value="2" />
     			<input type="hidden" name="y" value="1" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[11].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="16" />
				<input type="hidden" name="x" value="3" />
     			<input type="hidden" name="y" value="1" />  
			    <div><button id="btns" class="question" onclick="" ${picked[16].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="21" />
				<input type="hidden" name="x" value="4" />
     			<input type="hidden" name="y" value="1" />  
			    <div><button id="btns" class="question" onclick="" ${picked[21].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="2" />
				<input type="hidden" name="x" value="0" />
     			<input type="hidden" name="y" value="2" />  
			    <div><button id="btns" class="question" onclick="" ${picked[2].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="7" />
				<input type="hidden" name="x" value="1" />
     			<input type="hidden" name="y" value="2" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[7].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="12" />
				<input type="hidden" name="x" value="2" />
     			<input type="hidden" name="y" value="2" />  
			   	<div><button id="btns" class="question" onclick="" ${picked[12].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="17" />
				<input type="hidden" name="x" value="3" />
     			<input type="hidden" name="y" value="2" />  
			    <div><button id="btns" class="question" onclick="" ${picked[17].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="22" />
				<input type="hidden" name="x" value="4" />
     			<input type="hidden" name="y" value="2" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[22].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="3" />
				<input type="hidden" name="x" value="0" />
     			<input type="hidden" name="y" value="3" />  
			    <div><button id="btns" class="question" onclick="" ${picked[3].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="8" />
				<input type="hidden" name="x" value="1" />
     			<input type="hidden" name="y" value="3" />  
			    <div><button id="btns" class="question" onclick="" ${picked[8].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="13" />
				<input type="hidden" name="x" value="2" />
     			<input type="hidden" name="y" value="3" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[13].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="18" />
				<input type="hidden" name="x" value="3" />
     			<input type="hidden" name="y" value="3" />  
			    <div><button id="btns" class="question" onclick="" ${picked[18].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="23" />
				<input type="hidden" name="x" value="4" />
     			<input type="hidden" name="y" value="3" />  
			    <div><button id="btns" class="question" onclick="" ${picked[23].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="4" />
				<input type="hidden" name="x" value="0" />
     			<input type="hidden" name="y" value="4" />  
			    <div><button id="btns" class="question" onclick="" ${picked[4].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="9" />
				<input type="hidden" name="x" value="1" />
     			<input type="hidden" name="y" value="4" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[9].chosen}</button></div>
			</form>
			<form action="Display?"> 
				<input type="hidden" name="q" value="14" />
				<input type="hidden" name="x" value="2" />
     			<input type="hidden" name="y" value="4" /> 
			    <div><button id="btns" class="question" onclick="" ${picked[14].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="19" />
				<input type="hidden" name="x" value="3" />
     			<input type="hidden" name="y" value="4" />  
			    <div><button id="btns" class="question" onclick="" ${picked[19].chosen}</button></div>
			</form>
			<form action="Display?">
				<input type="hidden" name="q" value="24" />
				<input type="hidden" name="x" value="4" />
     			<input type="hidden" name="y" value="4" />  
			    <div><button id="btns" class="question" onclick="" ${picked[24].chosen}</button></div>
			</form>
		</div>
		
	</body>
</html>
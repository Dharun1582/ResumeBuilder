<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume Form</title>
</head>
<body>
	<form action="/resumeform" method="POST">
	<label>Enter Name : <input type="text" name="name" required/> </label><br>
	<label>Enter Mail : <input type="email" name="email" required/></label><br>
	<label>Enter Number : <input type="text" name="phno" pattern="[1-9]{1}[0-9]{9}" placeholder="999999999"></label><br>
	<label>Enter career objective : <br><textarea name="careerobjective" rows="5" cols="10" required></textarea></label>
	<br><br><br>
	
	
	<label>Institute : <input type="text" name="institute"/></label><br>
	<label>Course : <input type="text" name="course"/></label><br><br>
	<label>Year : <input type="text" name="year" pattern="[1-9]{1}[0-9]{3}-[1-9]{1}[0-9]{3}" /></label>
	


	
	
<%-- 
	<h1>Education :</h1>
	<div >
		<label>School/college/degree : <input type="text" /></label><br>
		<label>Description : <br><textarea rows="5" cols="10" ></textarea></label><br><br>
	</div>
	
	<h1>Experience :</h1>
	<div >
		<label>Title : <input type="text" /></label><br>
		<label>Description : <br><textarea rows="5" cols="10" ></textarea></label><br><br>
	</div>
	
	<h1>Skills :</h1>
	<div >
		<label>Domain : <input type="text" /></label><br>
		<label>Skills : <br><textarea rows="5" cols="10" ></textarea></label><br><br>
	</div>
	
	<label>Hobbies : <input type="text"  required/></label>
	--%>
	<input type="submit" />
	
	</form>
</body>
</html>
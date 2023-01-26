<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Education</title>
</head>
<body>
<form method="POST">
	<label>Institute : <input type="text" name="institute"/></label><br>
	<label>Course : <input type="text" name="course"/></label><br><br>
	<label>Year : <input type="text" name="year" pattern="[1-9]{1}[0-9]{3}-[1-9]{1}[0-9]{3}" /></label>
		<input type="submit" />

</form>

<a href="/addprojects">Add Projects</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Projects</title>
</head>
<body>
<form method="POST">
	<label>Title : <input type="text" name="title"/></label><br>

	<label>Year : <input type="text" name="year" pattern="[1-9]{1}[0-9]{3}" /></label>
		<label>Desc : <input type="text" name="desc"/></label><br><br>
		<input type="submit" />

</form>
</body>
</html>



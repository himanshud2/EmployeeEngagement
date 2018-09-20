<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>

</head>

<body>
	<h1>delete employee</h1>

	<form action="deleteservlet" method="post">
		<table style="with: 50%">
			<tr>
				<td>Enter emp id :</td>
				<td><input type="text" name="empid" /></td>
			</tr>
			<tr>
				<td>Enter employee name :</td>
				<td><input type="text" name="fullname" /></td>
			</tr>
			
		</table>
		
		 <input type="submit"value="submit" />
	</form>

</body>
</html>
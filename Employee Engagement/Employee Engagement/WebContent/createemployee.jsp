<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create employee</title>

</head>

<body>
	<h1>create employee</h1>

	<form action="createservlet" method="post">
		<table style="with: 50%">
			<tr>
				<td>emp id :</td>
				<td><input type="text" name="empid" /></td>
			</tr>
			<tr>
				<td>full name :</td>
				<td><input type="text" name="fullname" /></td>
			</tr>
			<tr>
				<td>login id :</td>
				<td><input type="text" name="loginid" /></td>
			</tr>

			<tr>
				<td>password :</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>manager name :</td>
				<td><input type="text" name="managername" /></td>
			</tr>
			<tr>
				<td>project name :</td>
				<td><input type="text" name="projectname" /></td>
			</tr>
			<tr>
				<td>phone number :</td>
				<td><input type="text" name="phonenumber" /></td>
			</tr>

		</table>
		
		 <input type="submit"value="submit" />
	</form>

</body>
</html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Event</title>

</head>

<body>
	<h1>add event
	</h1>

	<form action="addeventservlet" method="post">
		<table style="with: 50%">
			<tr>
				<td>type:</td>
				<td><input type="checkbox" name="type" value="meetup">Meet up<br>
		<input type="checkbox" name="type" value="game">Game<br>
		 <input type="checkbox" name="type"value="competitions">Competitions<br> 
			</tr>
			<tr>
				<td>event id :</td>
				<td><input type="text" name="eventid" /></td>
			</tr>
			<tr>
				<td>event name :</td>
				<td><input type="text" name="eventname" /></td>
			</tr>

			<tr>
				<td>event venue :</td>
				<td><input type="text" name="eventvenue" /></td>
			</tr>
			<tr>
				<td>event date :</td>
				<td><input type="text" name="eventdate" /></td>
			</tr>
			<tr>
				<td>event time :</td>
				<td><input type="text" name="eventtime" /></td>
			</tr>
			

		</table>
		
		 <input type="submit"value="submit" />
	</form>

</body>
</html>
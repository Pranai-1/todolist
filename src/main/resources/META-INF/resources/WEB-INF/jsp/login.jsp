<html>
	<head>
		<title>loading login page</title>
	</head>
	<body>
		<div>
		    <h1>
		    
			Welcome to login page ${name}
			</h1>
			<pre>${errorMessage}</pre>
			<form method="post">
			Name:<input type="text" name="name">
			Password:<input type="password" name="password">
			         <input type="submit">
			</form>
		</div>
	</body>
</html>
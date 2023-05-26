<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
		<title>Adding Todo</title>
		
	</head>
	<body>
	<div class="container">
		<h1>Add your Todo ${name} </h1>
		<form:form method="post" modelAttribute="todo">
		<fieldset>
		    <form:label path="Description">Description</form:label>
			<form:input type="text" path="description" required="required"/>
			<form:errors path="description" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset>
		    <form:label path="targetdate">TargetDate</form:label>
			<form:input type="text" path="targetdate" required="required"/>
			<form:errors path="targetdate" cssClass="text-warning"/>
		</fieldset>
			
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="isdone" />
			<input type="submit" class="btn btn-success">
		</form:form>
		 </div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src=" webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script type="text/javascript">
 $('#targetdate').datepicker({
	    format: 'yyyy/mm/dd',
	});
 </script>
    
	</body>
</html>
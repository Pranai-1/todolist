<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
         <title>Loading todos</title>
    </head>
    <body>
       <div class="container">
    	<h1>Your todos   </h1>
    	<table class="table">
    	
    	<thead>
    	<tr>
    	    <th>description</th>
    	    <th>targetdate</th>
    	    <th>isdone</th>
    	    <th>Update</th>
    	    <th>Delete</th>
    	 </tr>
    	</thead>
    	
    	<tbody>
    		<c:forEach items="${todo}" var="todo">
    		<tr>
    			<td>${todo.description}</td>
    			<td>${todo.targetdate}</td>
    			<td>${todo.isdone}</td>
    			<td><a href="update-todo?id=${todo.id}" class="btn btn-success" >Update</a></td>
    			<td><a href="delete-todo?id=${todo.id}" class="btn btn-success" >Delete</a></td>
    		</tr>
    		</c:forEach>
    		
    		</div>
    	</tbody>
    	</table>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <a href="addtodo" class="btn btn-success">AddTodo</a>
    </body>

</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
    <head>
		<title>Gestion des étudiants</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
		
	</head>
	
	<body>
		
		<h4>Enregistrement d'un étudiant</h4>
       
       <c:url var="save_student_url" value="/etudiant/enregistrer"/>
       
        <form:form action="${save_student_url}" method="post" modelAttribute="student" class="form">
        
            <form:label path="firstname">Firstname: </form:label> 
            <form:input type="text" path="firstname"/>
            
            <form:label path="lastname">Lastname: </form:label> 
            <form:input type="text" path="lastname"/>
            
            <form:label path="age">Age: </form:label> 
            <form:input path="age"/>
            
            <form:select  path="university">
			    <form:option value="">Sélectionner une valeur</form:option>
			    <form:options items="${schools}" itemLabel="name"></form:options>
			  </form:select>
            
            <input type="submit" class="btn-success" value="submit"/>
            
        </form:form>
       
    
    </body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/login" var="loginLink" />

<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<form method="post" action="${loginLink}">
		<div class="form-group">
			<label for="username">Nom d'utilisateur :</label> <input type="text"
				class="form-control" name="username" required>
		</div>
		<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>

	<%@include file="footer.jsp"%>

</body>
</html>
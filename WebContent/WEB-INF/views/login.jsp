<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/assets/style.css" var="style" />
<c:url value="/login" var="loginLink"/>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${style}" />
<title>Login</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<form method="post" action="${loginLink}">
		<p><label for="username">Nom d'utilisateur :</label></p>
		<p><input type="text" name="username" /></p>
		<p><input type="submit" value="Envoyer" /></p>
	</form>

	<%@include file="footer.jsp"%>

</body>
</html>
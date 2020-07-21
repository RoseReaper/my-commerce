<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/assets/style.css" var="style" />
<c:url value="/addProduct" var="addProductLink"/>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${style}" />
<title>Ajouter un produit</title>
</head>
<body>

	<%@include file="header.jsp"%>
	
	<h1>Ajouter un produit</h1>

	<form method="post" action="${addProductLink}">
		<p><label for="name">Nom :</label></p>
		<p><input type="text" name="name" /></p>
		<p><label for="content">Contenu :</label></p>
		<p><input type="text" name="content" /></p>
		<p><label for="price">Prix :</label></p>
		<p><input type="text" name="price" /></p>
		<p><input type="submit" value="Envoyer" /></p>
	</form>

	<%@include file="footer.jsp"%>

</body>
</html>
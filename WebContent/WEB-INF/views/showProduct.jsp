<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/assets/style.css" var="style" />

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${style}" />
<title>Détails d'un produit</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<h1>Détail du produit</h1>

	<p>Nom : <c:out value="${product.name}" /><p>
	<p>Contenu : <c:out value="${product.content}" /><p>
	<p>Prix : <c:out value="${product.price}" /><p>

	<%@include file="footer.jsp"%>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<title>Détails d'un produit</title>
</head>
<body>

	<%@include file="navbar.jsp"%>

	<h1>Détail du produit</h1>

	<ul>
		<li>Nom : <c:out value="${product.name}" />
		</li>
		<li>Contenu : <c:out value="${product.content}" />
		</li>
		<li>Prix : <c:out value="${product.price}" />
		</li>
		<li>Catégorie : <c:out value="${product.category}" />
		</li>
	</ul>

	<%@include file="footer.jsp"%>

</body>
</html>
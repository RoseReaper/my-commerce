<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/auth/removeProduct" var="removeProductLink" />

<!DOCTYPE html>
<html>
<head>
<title>Liste des produits</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<h1>Produits</h1>

	<c:forEach items="${products}" var="product">
		<form method="post" action="${removeProductLink}">
			<div class="form-group">
				<c:out value="${product.name}" />
				<input type="hidden" name="id" value="${product.id}" />
				<button type="submit" class="btn btn-primary">Supprimer</button>
			</div>
		</form>
	</c:forEach>

	<%@include file="footer.jsp"%>

</body>
</html>
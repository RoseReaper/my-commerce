<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/addProduct" var="addProductLink" />

<!DOCTYPE html>
<html>
<head>
<title>Ajouter un produit</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<h1>Ajouter un produit</h1>

	<form method="post" action="${addProductLink}">
		<div class="form-group">
			<label for="name">Nom :</label>
			<input type="text" class="form-control" name="name" required>
		</div>
		<div class="form-group">
			<label for="content">Contenu</label>
			<input type="text" class="form-control" name="content" required>
		</div>
		<div class="form-group">
			<label for="price">Prix :</label>
			<input type="text" class="form-control" name="price" required>
		</div>
		<div class="form-group">
			<label for="category">Catégorie :</label>
			<select class="form-control" name="categoryId" required>
				<option value="default" selected>Choisissez une catégorie</option>
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>
			</select>
		</div>
		<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>

	<%@include file="footer.jsp"%>

</body>
</html>
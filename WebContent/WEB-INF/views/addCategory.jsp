<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/addCategory" var="addCategoryLink" />

<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<title>Ajouter une catégorie</title>
</head>
<body>

	<%@include file="navbar.jsp"%>

	<h1>Ajouter une catégorie</h1>

<form method="post" action="${addCategoryLink}" accept-charset="utf-8">
  <div class="form-group">
    <label for="name">Nom :</label>
    <input type="text" class="form-control" name="name" required>
  </div>
  <button type="submit" class="btn btn-primary">Envoyer</button>
</form>

	<%@include file="footer.jsp"%>

</body>
</html>
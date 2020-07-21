<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="headerCore"%>
<headerCore:url value="/listProducts" var="listProductsLink" />
<headerCore:url value="/auth/addProduct" var="addProductLink" />
<headerCore:url value="/login" var="loginLink" />
<headerCore:url value="/logout" var="logoutLink" />

<nav>
	<ul>
		<li><a href="${listProductsLink}">Produits</a></li>
		<li><a href="${addProductLink}">Ajouter un produit</a></li>
		<headerCore:if test="${empty user}">
			<li><a href="${loginLink}">Login</a></li>
		</headerCore:if>
		<headerCore:if test="${not empty user}">
			<li><a href="${logoutLink}">Logout</a></li>
		</headerCore:if>
	</ul>
</nav>
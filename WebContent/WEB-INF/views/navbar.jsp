<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="headerCore"%>

<headerCore:url value="/listProducts" var="listProductsLink" />
<headerCore:url value="/auth/addProduct" var="addProductLink" />
<headerCore:url value="/auth/addCategory" var="addCategoryLink" />
<headerCore:url value="/login" var="loginLink" />
<headerCore:url value="/logout" var="logoutLink" />

<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="${listProductsLink}">My Commerce</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link"
				href="${listProductsLink}">Produits<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Ajouter </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="${addProductLink}">Ajouter un
						produit</a> <a class="dropdown-item" href="${addCategoryLink}">Ajouter une
						catégorie</a>
				</div></li>
			<headerCore:if test="${empty user}">
				<li class="nav-item"><a class="nav-link" href="${loginLink}">Login</a></li>
			</headerCore:if>
			<headerCore:if test="${not empty user}">
				<li class="nav-item"><a class="nav-link" href="${logoutLink}">Logout</a></li>
			</headerCore:if>
		</ul>
	</div>
</nav>
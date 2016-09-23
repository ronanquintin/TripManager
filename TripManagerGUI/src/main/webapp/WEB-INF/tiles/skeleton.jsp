<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" /></title>

<spring:url value="/resources/css/tripmanager.css" var="tripmanagerCSS" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/css/bootstrap-datepicker.min.css" var="bootstrapDatepickerCss" />

<link href="${bootstrapCss}" rel="stylesheet">
<link href="${bootstrapDatepickerCss}" rel="stylesheet">
<link href="${tripmanagerCSS}" rel="stylesheet">




</head>
<body>
	<div class="page">
		<tiles:insertAttribute name="header" />
		<div class="content">
			<tiles:insertAttribute name="menu" />
			<div class="trip-manager">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>


	<spring:url value="/resources/js/jquery-3.1.0.min.js" var="jqueryJS" />
	<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />
	<spring:url value="/resources/js/bootstrap-datepicker.min.js" var="bootstrapDatepickerJS" />
	<spring:url value="/resources/js/bootstrap-datepicker.fr.min.js" var="bootstrapDatepickerFRJS" />
	<spring:url value="/resources/js/tripmanager.js" var="tripmanagerJS" />
	

	<script src="${jqueryJS}"></script>
	<script src="${bootstrapJS}"></script>
	<script src="${bootstrapDatepickerJS}"></script>
	<script src="${bootstrapDatepickerFRJS}"></script>
	<script src="${tripmanagerJS}"></script>
	
	<tiles:insertAttribute name="scripts" />
	

	


</body>
</html>
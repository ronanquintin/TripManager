<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
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

<link href="${bootstrapCss}" rel="stylesheet">
<link href="${datepickerCss} }" rel="stylesheet">
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


	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />
q	<spring:url value="/resources/js/jquery-3.1.0.min.js" var="jqueryJS" />

	<link href="${bootstrapJS}" rel="stylesheet">
	<link href="${bootstrapDatePickerJS}" rel="stylesheet">
	<link href="${bootstrapDatePickerFRJS}" rel="stylesheet" charset="UTF-8">
	<link href="${jqueryJS}" rel="stylesheet">
	

	


</body>
</html>
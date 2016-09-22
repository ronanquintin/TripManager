<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:insertDefinition name="skeleton">
	<tiles:putAttribute name="body">
		<h1>Create a new trip</h1>
		<spring:url value="/trips" var="tripActionUrl" />
		<form:form method="post" modelAttribute="tripModel" action="${tripActionUrl}">
			<div class="form-group">
				<label for="name">Trip name</label>
				<form:input path="name" type="text" class="form-control" id="name" placeholder="Trip name" />
				<form:errors path="name" class="control-label" />
			</div>
			<div class="input-group date">
				<input type="text" class="form-control" value="12-02-2012">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
			<button type="submit" class="btn btn-default">Create</button>
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>
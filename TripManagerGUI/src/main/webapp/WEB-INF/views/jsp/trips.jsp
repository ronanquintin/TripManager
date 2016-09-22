<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<tiles:insertDefinition name="skeleton">
	<tiles:putAttribute name="body">
		<div class="container">
			<div class="row">
				<h1>Trips</h1>
			</div>
			<div class="row">
				<spring:url value="/trips/new" var="createTripUrl" />
				<a class="btn btn-default" href="${createTripUrl}" role="button">Create a new trip</a>
			</div>
			<div class="row">
				<table class="table table-condensed table-bordered">
					<tr>
						<td>Name</td>
					</tr>
					<!--  data -->
					<c:forEach items="${trips}" var="trip">
						<tr>
							<td>${trip.name}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
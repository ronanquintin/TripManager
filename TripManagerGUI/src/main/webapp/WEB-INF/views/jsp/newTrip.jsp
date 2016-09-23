<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:insertDefinition name="skeleton">
	<tiles:putAttribute name="body">
		<spring:url value="/trips" var="tripActionUrl" />
		<form:form method="post" modelAttribute="tripModel" action="${tripActionUrl}">
			<div class="container-fluid">
				<div class="row margin-b-15">
					<div class="col-md-4">
						<h1>Create a new trip</h1>
					</div>
				</div>
				<div class="row  margin-b-15">
					<div class="col-md-4">
						<div class="form-group">
							<label for="name">Trip name</label>
							<form:input path="name" type="text" class="form-control" id="name" placeholder="Trip name" />
							<form:errors path="name" class="control-label" />
						</div>
					</div>
					<div class="col-md-4">
						<div class="input-group date">
							<label for="departureDate">Departure date</label>
							<form:input type="text" path="departureDate" id="departureDate" class="form-control" value="12-02-2012" />
						</div>
					</div>
				</div>
				<div class="row margin-b-15">
					<div class="col-md-4">
						<button type="submit" class="btn btn-default">Create</button>
					</div>
				</div>
			</div>
		</form:form>
	</tiles:putAttribute>
	<tiles:putAttribute name="scripts">
		<script type="text/javascript">
			$('departureDate').datepicker();
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>

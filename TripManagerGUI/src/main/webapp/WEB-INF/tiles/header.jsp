<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="header">
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<spring:url value="/" var="homeUrl" />
				<a class="navbar-brand" href="${homeUrl}">TripManager</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Trips<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<spring:url value="/trips" var="tripsUrl" />
							<li><a href="${tripsUrl}">My trips</a></li>
							<spring:url value="/trips/new" var="createTripsUrl" />
							<li><a href="${createTripUrl}">Create a new trip</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
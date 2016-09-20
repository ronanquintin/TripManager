<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="skeleton">
	<tiles:putAttribute name="body">
	<h1>Trips</h1>

		<table class="table table-condensed table-bordered">
		
			<tr>
				<td>Trips</td>
			</tr>
		
			<!--  data -->
			<c:forEach items="${trips}" var="trip">
				<tr>
					<td>${trip.name}</td>
				</tr>
			</c:forEach >
		</table>
		
		

	</tiles:putAttribute>
</tiles:insertDefinition>
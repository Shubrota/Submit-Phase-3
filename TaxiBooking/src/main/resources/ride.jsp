<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Ride Booked</h1>
<h2>All Rides</h2>
<table border="1">
	<tr>
		<th>ID</th>
		<th>From</th>
		<th>To</th>
		<th>Distance in KM</th>
		<th>Fare</th>
	</tr>
	<c:forEach var="ride" items="${ride}">
		<tr>
			<td>${ride.id}</td>
			<td>${ride.from}</td>
			<td>${ride.to}</td>
			<td>${ride.distance}</td>
			<td>${ride.fare}</td>
		</tr>
	</c:forEach>
</table>


<br><br><br><br>
<a href="RideDetails.html">Back to Booking</a>
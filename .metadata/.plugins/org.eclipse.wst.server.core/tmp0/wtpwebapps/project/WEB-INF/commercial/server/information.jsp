<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<table class="table">
	<tr>
		<th>상권업종대분류명</th>
		<th>수</th>
	</tr>
	<tr>
		<c:forEach items="${result}" var="e">
			<tr>
				<td>${e.largeName}</td>
				<td>${e.num}</td>
			</tr>
		</c:forEach>
	<tr>
		<td colspan="2"><button onclick="open_pop()" class="btn btn-primary btn-sm" style="width:100%">More
				Info</button></td>
	</tr>
</table>

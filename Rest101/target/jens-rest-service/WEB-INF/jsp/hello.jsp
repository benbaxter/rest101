<!doctype html>
<html>
<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>
<head>
<title>Insert title here</title>
</head>
<body>
Hello World!

<br />
<c:if test="not empty myObj">
	<c:forEach var="o" items="myObj">
		<c:out value="o"></c:out>
		<br />
		{{o}}
	</c:forEach>
</c:if>
</body>
</html>
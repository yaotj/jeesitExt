<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html style="overflow-x:hidden;overflow-y:auto;">
	<head>
		<title><sitemesh:title/> - Powered By JeeSite</title>
		<%@include file="/WEB-INF/views/include/head.jsp" %>
		<sitemesh:head/>
	</head>
	<body>自定义框架
		<sitemesh:body/>
	</body>
</html>

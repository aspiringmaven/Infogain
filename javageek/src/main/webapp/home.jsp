<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>/home.do Action</title>
</head>
<body>
	<div>This JSP is mapped against /home.do path in struts-config.xml</div>
	<div></div>
	<div>Below form is struts form UserForm.java and will submit to struts Action UserAction.java</div>
	<div>
		<html:form action="/user" method="POST">
			Name : <html:text name="userForm" property="name"></html:text><br>
			Age : <html:text name="userForm" property="age"></html:text><br>
			<html:submit></html:submit>
		</html:form>	
	</div>
</body>
</html>
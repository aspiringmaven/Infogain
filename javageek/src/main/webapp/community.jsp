<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Greeting Page</title>
</head>
<body>
	<div>
		Hello
		<bean:write name="userForm" property="name"></bean:write>
		!!
	</div>
	
	<div>
		<logic:lessThan name="userForm" property="age" value="18">
			Kid!
		</logic:lessThan>
		<logic:lessEqual name="userForm" property="age"  value="18">
			Young guns of the India.
		</logic:lessEqual>	
		<logic:greaterEqual name="userForm" property="age"  value="18">
			<logic:lessThan name="userForm" property="age"  value="50">
			  Citizen.
			</logic:lessThan>
			<logic:greaterEqual name="userForm" property="age"  value="50">
				Senior Citizen!!
			</logic:greaterEqual>
		</logic:greaterEqual>
	</div>
</body>
</html>
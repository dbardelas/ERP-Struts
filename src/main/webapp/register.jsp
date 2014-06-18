<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
<s:head/>
</head>
<body>
	<h3>Registro empresa</h3>
	<s:form action="register">
		<s:textfield name="empresa.codigo" label="Código" />
		<s:textfield name="empresa.cif" label="Cif" />
		<s:textfield name="empresa.razonSocial" label="Razón social" />
		<s:submit value="Enviar" />
	</s:form>
</body>
</html>
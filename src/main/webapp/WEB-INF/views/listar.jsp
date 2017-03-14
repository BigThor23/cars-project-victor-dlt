<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Coches</title>
</head>
<body>
<h1>Todos los productos </h1>
<table>
        <tr>
            <th>matricula</th>
            <th>modelo</th>
            <th>Fecha Matriculacion</th>
            <th>Km</th>
            <th>Precio</th>
        </tr>
        <c:forEach items="${coches}" var="coche">
            <tr>
                
                 <td><c:out value="${coches.matricula}"></c:out></td>
                 <td><c:out value="${coches.modelo}"></c:out></td>
                 <td><c:out value="${coches.fechaMatriculacion}"></c:out></td>
                 <td><c:out value="${coches.km}"></c:out></td>
                 <td><c:out value="${coches.precio}"></c:out></td>
           
            
                
            </tr>
        </c:forEach>
    </table>
</body>
</html>
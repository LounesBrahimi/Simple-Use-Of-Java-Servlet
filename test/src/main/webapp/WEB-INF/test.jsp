<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Simple JSP Page</h2>
        <p>
            <% 
            String attribut = (String) request.getAttribute("test");
            out.println( attribut );
            %>
        </p>
</body>
</html>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("username");

    // Create session and store name
    session.setAttribute("user", name);

    // Set session expiry time to 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>

<p>Your session will expire in 1 minute.</p>

<a href="check.jsp">Click here to check session</a>

</body>
</html>
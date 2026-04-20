<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>🍪 Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
        for (Cookie c : cookies) {
%>
            <p>
                <b>Name:</b> <%= c.getName() %><br>
                <b>Value:</b> <%= c.getValue() %><br>
                <b>Max Age:</b> <%= c.getMaxAge() %><br>
                <hr>
            </p>
<%
        }
    } else {
%>
        <h3>No active cookies found.</h3>
<%
    }
%>

<br>
<a href="index.jsp">⬅ Back to Add Cookie</a>

</body>
</html>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2>Session Expired!</h2>
        <p>Please login again.</p>
        <a href="index.jsp">Go Back</a>
<%
    } else {
%>
        <h2>Welcome back <%= user %>!</h2>
        <p>Your session is still active.</p>
<%
    }
%>

</body>
</html>
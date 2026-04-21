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
        <h2>❌ Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.jsp">Go Back</a>
<%
    } else {
%>
        <h2>✅ Hello again <%= user %>!</h2>
        <p>Your session is still active.</p>
        <a href="check.jsp">Refresh</a>
<%
    }
%>

</body>
</html>
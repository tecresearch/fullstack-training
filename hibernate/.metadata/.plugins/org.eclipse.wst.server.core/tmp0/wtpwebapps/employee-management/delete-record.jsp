<%@page import="com.cetpa.*"%>
<%@ include file="navbar.jsp" %>
<html>
  <body onload="makeActive('delete')">
  <%
  int eid=Integer.parseInt(request.getParameter("eid"));
  Employee emp=EmployeeRepository.getEmployee(eid);
  EmployeeRepository.deleteEmployee(emp);
  %>  
  <div class='dv'>
  	<label class='lamsg' style='color:green'>Employee with id <%=eid%> has been deleted successfully</label>
  </div>
 </body>
</html>
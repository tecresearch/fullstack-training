<%@page import="com.cetpa.*"%>
<%@ include file="navbar.jsp" %>
<html>
  <body onload="makeActive('add')">
  <%
  Employee emp=new Employee();
  emp.setEid(Integer.parseInt(request.getParameter("eid")));
  emp.setFirstname(request.getParameter("firstname"));
  emp.setLastname(request.getParameter("lastname"));
  emp.setPhone(request.getParameter("phone"));
  emp.setEmail(request.getParameter("email"));
  emp.setDepartment(request.getParameter("department"));
  emp.setSalary(Integer.parseInt(request.getParameter("salary")));
  EmployeeRepository.saveEmployee(emp);
  %>  
  <div class='dv'>
  	<label class='lamsg' style='color:green'>Employee has been added successfully</label>
  </div>
 </body>
</html>
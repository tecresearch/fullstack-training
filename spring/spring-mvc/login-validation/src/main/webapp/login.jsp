<html>
 <body>
  <form action="authenticate-user" method="post">
   <table style='margin:auto;;border:3px solid green;background-color:gray;color:white;font-size:22px' cellpadding='14px'>
   	 <tr>
   	  <td>Enter user id</td>
   	  <td><input type='text' name='uid' value="${userid}" style='font-size:20px' required></td>
   	 </tr>
   	 <tr>
   	  <td>Enter password</td>
   	  <td><input type='password' name='pass' style='font-size:20px' required></td>
   	 </tr>
   	 <tr>
   	  <td colspan="2" align="right">
   	   <button style='font-size:20px'>Submit</button>
   	  </td>
   	 </tr>
   </table>
  </form>
  <div style="text-align: center;margin-top:10px">
    <h2 style='color:red'>${msg}</h2>
  </div>
 </body>
</html>
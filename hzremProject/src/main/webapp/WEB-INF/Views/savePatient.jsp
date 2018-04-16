<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
<form action="save" method="post">
<center>
<pre>
PatientID      :<input type="text" name="patient_id" ><br>
PatientName    :<input type="text" name="patient_Name" ><br>
Sex            :<input type="radio" name="sex" value="Male">Male 
               <input type="radio" name="sex" value="Female">Female
Address        :<textarea name="address" ></textarea><br>
Age            :<input type="text" name="age" ><br>
PhoneNUmber    :<input type="text" name="phoneNumber" ><br>

<input type="submit" value="Register"/>     <input type="reset" value="Clear">

</pre>
${msg}
</center>


</form>

</body>
</html>
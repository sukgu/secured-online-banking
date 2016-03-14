<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <title>Secured Online Banking</title>
     <link rel="icon" href="resources/images/title.ico" type="image/icon" />
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta http-equiv="Content-Type"
 content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<form:form action="register" commandName="reg_cust" method="post">
<div class="page-out">
<div class="page-in">
<div class="page">
<div class="main">
<div class="header">
<div class="header-top">
<h1>SOB <span></span></h1>
</div>
<div class="header-bottom">
<h2><b>Secure Banking with us.</b></h2>
</div>
<div class="topmenu">
<ul>
  <li
 style="background: transparent none repeat scroll 0% 50%; -moz-background-clip: initial; -moz-background-origin: initial; -moz-background-inline-policy: initial; padding-left: 0px;"><a
  href="validate"><span>Home</span></a></li>
  <li><a href="services"><span>Services</span></a></li>
  <li><a href="register"><span>Register</span></a></li>
  <li><a href="evalidate"><span>Employee_Login</span></a></li>
  <li><a href="about_us"><span>About&nbsp;us</span></a></li>
  
  <li><a href="feedback"><span>Feedback</span></a></li>
  
  
</ul>
</div>
</div>
<div class="content">
    <table style="width: 100%; height: 513px;">
        <tr>
            <td>
               <form:label path="salutation">Salutation</form:label> </td>
            <td>
                <form:select path="salutation">
                    <form:option value="Select">Select</form:option>
					<form:option value="Mr.">Mr.</form:option>
					<form:option value="Mrs.">Mrs.</form:option>
					<form:option value="Miss">Miss</form:option>
					</form:select></td>
            <td>
           <form:label path="adhaar">Adhaar No.</form:label></td>
            <td>
              <form:input path="adhaar"/>  &nbsp;</td>
        </tr>
        <tr><td></td><td><form:errors path="salutation" cssClass="error" /><td></td><td><form:errors path="adhaar" cssClass="error" /></td></tr>
        <tr>
            <td>
              <form:label path="fname">First Name</form:label>  </td>
            <td>
                <form:input path="fname" /></td>
            <td>
               <form:label path="mname">Middle Name</form:label> </td>
            <td>
                <form:input path="mname"/></td>
        </tr>
                <tr><td></td><td><form:errors path="fname" cssClass="error" /></td><td></td><td><form:errors path="mname" cssClass="error" /></td></tr>
        
        <tr>
            <td>
               <form:label path="lname">Last Name</form:label> </td>
            <td>
                <form:input path="lname"/></td>
            <td>
                <form:label path="account_type">Account Type</form:label></td>
            <td class="style1">
                <form:select path="account_type">
                    <form:option value="">Select</form:option>
					<form:option value="saving">Saving</form:option>
					<form:option value="current">Current</form:option>
					<form:option value="platinum">Platinum</form:option>
					<form:option value="gold">Gold</form:option>
                </form:select></td>
        </tr>
                <tr><td></td><td><form:errors path="lname" cssClass="error" /></td><td></td><td></td></tr>
        
        <tr>
            <td>
                 <form:label path="fatherName">Father's Name</form:label> </td>
            <td>
                <form:input path="fatherName"/></td>
            <td>
                 <form:label path="dob">Date Of Birth</form:label></td>
            <td>
                <form:input path="dob"/>(dd-mmm-yy)</td>
        </tr>
                <tr><td></td><td><form:errors path="fatherName" cssClass="error" /></td><td></td><td><form:errors path="dob" cssClass="error" /></td></tr>
        
        <tr>
            <td>
                  <form:label path="gender">Gender</form:label> </td>
            <td>
                <form:radiobutton path="gender" value="Male"/>Male
                <form:radiobutton path="gender" value="Female"/>Female
                </td>
            <td>
               <form:label path="education">Education</form:label></td>
            <td>
                <form:select path="education">
				<form:option value="Select">Select</form:option>
                    <form:option value="UnderGraduate">UnderGraduate</form:option>
					 <form:option value="Graduate">Graduate</form:option>
					  <form:option value="PostGraduate">PostGraduate</form:option>
                </form:select></td>
        </tr>
        <tr>
            <td class="style2">
                <form:label path="occupation">Occupation</form:label></td>
            <td class="style1">
                <form:select path="occupation">
                    <form:option value="Select">Select</form:option>
					<form:option value="Buisness">Buisness</form:option>
					<form:option value="Farmer">Farmer</form:option>
					<form:option value="Govt.job">Govt.job</form:option>
					<form:option value="Student">Student</form:option>
                </form:select></td>
            <td class="style2">
                <form:label path="mStatus">Maritial Status</form:label></td>
            <td class="style1">
                <form:select path="mStatus">
                    <form:option value="Select">Select</form:option>
					<form:option value="Single">Single</form:option>
					<form:option value="Married">Married</form:option>
					<form:option value="Divorced">Divorced</form:option>
					<form:option value="Widow">Widow</form:option>
					<form:option value="Widower">Widower</form:option>
					
                </form:select></td>
        </tr>
        <tr>
            <td class="style2">
                <form:label path="gid">Guaranter id</form:label></td>
            <td class="style2">
                <form:input path="gid" /></td>
            <td class="style2">
               Document to Upload</td>
            <td class="style2">
             <input type="file" name="file"/>  </td>
        </tr>
                <tr><td></td><td><form:errors path="gid" cssClass="error" /></td><td></td><td></td></tr>
        
        <tr>
            <td class="style2">
                Communication Address :</td>
            <td class="style1">
                </td>
            <td class="style1">
                </td>
            <td class="style1">
                </td>
        </tr>
        <tr>
            <td class="style2">
                <form:label path="address">Street</form:label></td>
            <td class="style1">
                <form:input path="address"/></td>
            <td class="style2">
                <form:label path="city">City</form:label></td>
            <td class="style1">
                <form:input path="city"/></td>
        </tr>
                <tr><td></td><td><form:errors path="address" cssClass="error" /></td><td></td><td><form:errors path="city" cssClass="error" /></td></tr>
        
        <tr>
            <td class="style2">
                <form:label path="state">State</form:label></td>
            <td class="style1">
                <form:select path="state">
                    <form:option value="Select">Select</form:option>
					<form:option value="Haryana">Harayana</form:option>
					<form:option value="Maharashtra">Maharashtra</form:option>
					<form:option value="Punjab">Punjab</form:option>
					<form:option value="Karnataka">Karnataka</form:option>
					<form:option value="Gujrat">Gujarat</form:option>
					<form:option value="TamilNadu">TamilNadu</form:option>
					<form:option value="Chattisgarh">Chattisgarh</form:option>
					<form:option value="Orrisa">Orrisa</form:option>
					<form:option value="UttarPradesh">Uttar Pradesh</form:option>
					<form:option value="Uttaranchal">Uttaranchal</form:option>
					<form:option value="Madhya Pradesh">Madhya Pradesh</form:option>
                </form:select></td>
            <td class="style2">
                <form:label path="pincode">Pincode</form:label></td>
            <td class="style1">
                <form:input path="pincode"/></td>
        </tr>
                <tr><td></td><td><form:errors path="state" cssClass="error" /></td><td></td><td><form:errors path="pincode" cssClass="error" /></td></tr>
        
        <tr>
            <td class="style2">
               Permanent Address :</td>
            <td class="style2">
               Same As Communication Address</td>
            <td class="style1">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style2">
                <form:label path="paddress">Street</form:label></td>
            <td class="style1">
                <form:input path="paddress"/></td>
            <td class="style2">
                <form:label path="pcity">City</form:label></td>
            <td class="style1">
                <form:input path="pcity"/></td>
        </tr>
                        <tr><td></td><td><form:errors path="paddress" cssClass="error" /></td><td></td><td><form:errors path="pcity" cssClass="error" /></td></tr>
        
        <tr>
            <td class="style2">
                <form:label path="pstate">State</form:label></td>
            <td class="style1">
                <form:select path="pstate">
                   <form:option value="Select">Select</form:option>
					<form:option value="Haryana">Harayana</form:option>
					<form:option value="Maharashtra">Maharashtra</form:option>
					<form:option value="Punjab">Punjab</form:option>
					<form:option value="Karnataka">Karnataka</form:option>
					<form:option value="Gujrat">Gujarat</form:option>
					<form:option value="TamilNadu">TamilNadu</form:option>
					<form:option value="Chattisgarh">Chattisgarh</form:option>
					<form:option value="Orrisa">Orrisa</form:option>
					<form:option value="UttarPradesh">Uttar Pradesh</form:option>
					<form:option value="Uttaranchal">Uttaranchal</form:option>
					<form:option value="Madhya Pradesh">Madhya Pradesh</form:option>
                </form:select></td>
            <td class="style2">
                <form:label path="ppincode">Pincode</form:label></td>
            <td class="style1">
                <form:input path="ppincode"/></td>
        </tr>
         <tr><td></td><td><form:errors path="pstate" cssClass="error" /></td><td></td><td><form:errors path="ppincode" cssClass="error" /></td></tr>
        <tr>
            <td class="style2">
              <form:label path="mobileNo">Mobile No.</form:label>  </td>
            <td class="style1">
                <form:input path="mobileNo" /></td>
                            <td class="style2">
                <form:label path="email">Email</form:label></td>
            <td class="style1">
                <form:input path="email"/></td>
        </tr>
                                <tr><td></td><td><form:errors path="mobileNo" cssClass="error" /></td><td></td><td><form:errors path="email" cssClass="error" /></td></tr>
        
        <tr>
            <td class="style2">
                <form:label path="grossIncome">Gross Income</form:label></td>
            <td class="style1">
                <form:input path="grossIncome"/></td>
            <td class="style2">
                <form:label path="branchcode">Branch Code</form:label></td>
            <td class="style1">
                 <form:input path="branchcode"/></td>
        </tr>
                        <tr><td></td><td><form:errors path="grossIncome" cssClass="error" /></td><td></td><td><form:errors path="branchcode" cssClass="error" /></td></tr>
        
        <tr>
            <td class="style1">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                &nbsp;</td>
           <td></td>
            <td class="style1" >
                <input id="Submit1" type="submit" value="Submit" style="height:29px;width:70px;"/></td>
            <td class="style1">
                &nbsp;</td>
        </tr>
    </table>
</div>
<div class="footer">
<!--DO NOT Remove The Footer Links-->
<a href="http://www.htmltemplates.net">
<img src="images/footer.gif" alt="html templates" border="0" height="1" width="1"></a>
<p>&copy; Copyright 2010. Designed by <a target="_blank"
 href="http://www.htmltemplates.net">htmltemplates.net</a><br>
<!--DO NOT Remove The Footer Links-->
</p>
<ul>
  <li style="border-left: medium none;"><a href="login"><span>Home</span></a></li>
  <li><a href="about_us"><span>About&nbsp;us</span></a></li>
  <li><a href="whatsnew"><span>What's&nbsp;new</span></a></li>
  <li><a href="services"><span>Services</span></a></li>
  <li><a href="contact"><span>Contact</span></a></li>
  <li><a href="resources"><span>Resources</span></a></li>
  <li style="padding-right: 0px;"><a href="link"><span>Links</span></a></li>

</ul>
</div>
</div>
</div>
</div>
</div></form:form>
</body>
</html>

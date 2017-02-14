<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="Servlet.ServletCommands"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/editableDropdown.css">
        <title>Student Book Register</title>
        <script language="javascript" type="text/javascript" src="javascripts/datetimepicker.js"> </script>
        <script language="javascript" type="text/javascript" src="javascripts/validation.js"> </script>
        <script language="javascript" type="text/javascript" src="javascripts/editableDropdown.js"> </script>
    </head>
    <body>
        <form id="RegistrationMainForm" action="Controller" method="POST">
            <div style="border:1px black solid;height:535px;width:560px;position:absolute;top:0px;margin-top:50px;left:50%;margin-left:-280px;overflow:auto;" id="CenterDiVContainer">
            <table align="center" >
                <tr>
                <h1 align="center">Student Book Registration Page</h1>
                </tr>
                <tr>
                    <td> UserName : </td>
                    <td> <input type="text" name="<%=ServletCommands.paramUserName%>" size ="30"> </td>
                </tr>

                <tr>
                    <td> PassWord : </td>
                    <td> <input type="password" id="pass" name="<%=ServletCommands.paramPassWord%>" size ="30"> </td>
                </tr>

                <tr>
                    <td> PassWord : </td>
                    <td> <input type="password" id="verifyPass" size ="30"> </td>
                </tr>

                <tr>
                    <td> FirstName : </td>
                    <td> <input type="text"  name="<%=ServletCommands.paramFirstName%>" size ="30"> </td>
                </tr>
                
		<tr>
                    <td> LastName : </td>
                    <td> <input type="text"  name="<%=ServletCommands.paramLastName%>" size ="30"> </td>
                </tr>
                
                <tr>
                    <td> Country : </td>
                    <td>
                        <input type="text" name="<%=ServletCommands.paramCountry%>" value="Greece" size ="28" selectBoxOptions="Canada;Denmark;Finland;Germany;Mexico;Norway;Sweden;United Kingdom;United States">
                    </td>
                </tr>
                
                <tr>
                    <td> Institute : </td>
                    <td>
                        <input type="text" name="<%=ServletCommands.paramInstitute%>" value="University of Crete" size ="28" selectBoxOptions="University of Crete;University of Athens;University of Patras">
                    </td>
                </tr>
                
                <tr>
                    <td> Department : </td>
                    <td>
                        <input type="text" name="<%=ServletCommands.paramDepartment%>" value="Computer Science" size ="28" selectBoxOptions="Biology;Chemistry;Mathematics;Applied Mathematics">
                    </td>
                </tr>

                <tr>
                    <td> e-mail : </td>
                    <td> <input type="text" name="<%=ServletCommands.paramMail%>" size ="30"></td>
                    <%--
                    <td><select name="mail"> <option value="hotmail">@ hotmail.com</option>
				<option value="csd">@ csd.uoc.gr</option>
				<option value="yahoo">@ yahoo.com</option>
			</select>
                    </td>
                --%>
                </tr>
                
                <tr>
                    <td>Telephone :</td>
                    <td><input type="text" name="<%=ServletCommands.paramTelephone%>" id="tel" size="30"></td>
                </tr>

                <tr>
                    <td> Birth Date : </td>
                    <td>
                         <input id="demo2" name="<%=ServletCommands.paramBDate%>"type="text" size="10"><a href="javascript:NewCal('demo2','dd-mm-yyyy')">
                         <img src="images/cal.gif" width="16" height="16" border="0" alt="Pick a date"></a>
                    </td>
                </tr>

                <tr>
                    <td> Select Gender : </td>
                    <td>
                        <select name="<%=ServletCommands.paramGender%>">
                            <option value="MALE">Male</option>
                            <option value="FEMALE">Female</option>
                        </select>
                    </td>
                </tr>

                 <tr>
                    <td> Master Student? : </td>
                    <td> <input type="checkbox" name="<%=ServletCommands.paramMaster%>"> </td>
                    <td align="right">
                        <button type="submit" id="Login" name="<%=ServletCommands.param_CNTRL_Login%>">
                            Go Back
                        </button>
                        <button type="submit" id="RegistrationFormSubmit" name="<%=ServletCommands.param_CNTRL_Register%>" onclick="javascript:checkWholeForm('RegistrationMainForm')">
                            Submit
                        </button>
                    </td>
                </tr>
            </table>
            </div>
        </form>

        <script type="text/javascript"> 
        createEditableSelect(document.forms[0].<%=ServletCommands.paramCountry%>);
        createEditableSelect(document.forms[0].<%=ServletCommands.paramInstitute%>);
        createEditableSelect(document.forms[0].<%=ServletCommands.paramDepartment%>);
        </script>
    </body>
</html>

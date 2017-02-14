<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="Servlet.ServletCommands"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login To Student Web</title>
    </head>
    <body>
        <form id="LoginForm" action="Controller" method="POST">
            <div id="LoginDiV">
           
            <table align="center" >
                <tr>
                    <h1 align="center"> Welcome to Unanny </h1>
                </tr>
                <tr>
                    <td> UserName </td>
                    <td> <input type="text" name="" size ="20"> </td>
                </tr>
                <tr>
                    <td> PassWord </td>
                    <td> <input type="password" name="" size ="20"> </td>
                </tr>
                <tr>
                    <td>
                        <button type="submit" id="Login" name="<%=ServletCommands.param_CNTRL_Login%>">
                            Login
                        </button>
                    </td>
                    
                </tr>
            </table>
                            <table>
                                <tr> 
                                    <h3 align="center"> New Here?</h3></tr>
                                <tr>
                                    <td><button type="submit" id="Register" name="<%=ServletCommands.param_CNTRL_GoToRegister%>">
                             Parent
                        </button></td>
                        <td><button type="submit" id="Register" name="<%=ServletCommands.param_CNTRL_GoToRegister%>">
                             Nanny
                        </button></td>
                                </tr>
                            </table>
            </div>
            
        </form>
    </body>
</html>

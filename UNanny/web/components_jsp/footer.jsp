<%@page import="Servlet.ServletCommands"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript">
            onload=function() {
                var divh = document.getElementById('FakeDiv').offsetHeight;
                d = document.getElementById('footer');
                tmp=divh+50;
                d.style.top= tmp+"px";
            }
        </script>
    </head>
    <body>
    <form id="BottomViewComponent" action="Controller" method="POST">
        <div style="height:85%;min-height:586px;width:0px;position:absolute;left:50%;margin-left:-480px;overflow:auto;" id="FakeDiv"></div>
        <div style="border:1px black solid;height:40px;width:960px;position:absolute;left:50%;margin-left:-480px;" id="footer">
            <table width="960" align="center">
                <tbody>
                    <tr>
                        <td align="left">
                            <button type="submit" name="<%=ServletCommands.param_CNTRL_GoToProfile%>">Profile</button>
                            <button type="submit" name="<%=ServletCommands.param_CNTRL_GoToGallery%>">Gallery</button>
                            <button type="submit" name="<%=ServletCommands.param_CNTRL_GoToTopics%>">Topics</button>
                            <button type="submit" name="<%=ServletCommands.param_CNTRL_GoToMessages%>">Messages</button>
                        </td>
                        <td align="right">
                            E-Commerce Project 2017
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </form>
    </body>
</html>

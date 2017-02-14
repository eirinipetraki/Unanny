package Servlet;
import HandleData.Member;
import HandleData.Gender;
import UNannyDB.DataBaseMember;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
    private HashMap<String, Dispatcher> dispatchTable;
    private HttpSession session;
    
    public Controller(){
        System.out.println("i am Controller");
        dispatchTable = new HashMap<String, Dispatcher>();
        dispatchTable.put(ServletCommands.param_CNTRL_Login, new Handler_Login());
        dispatchTable.put(ServletCommands.param_CNTRL_Register, new Handler_Register());
        dispatchTable.put(ServletCommands.param_CNTRL_GoToRegister, new Handler_GoTo_Register());
        
    }
protected void handle(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		session = request.getSession(true);
		boolean flag = false;

		Enumeration<String> allParamNames = request.getParameterNames();
		while(allParamNames.hasMoreElements()){
			String tmp = allParamNames.nextElement();
			if(dispatchTable.containsKey(tmp)){
				flag = true;
				dispatchTable.get(tmp).execute(request, response);
			}
		}
		if(!flag){

			dispatchTable.get(ServletCommands.attrError).execute(request, response);
		}
	}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        handle(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        handle(request, response);
    }
    
    private void forward(String addr, HttpServletRequest request, HttpServletResponse response)
    {
        RequestDispatcher rd = getServletContext().getRequestDispatcher(addr);
        System.out.println("i am at forward");
        try {
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private interface Dispatcher{
        public void execute(HttpServletRequest request, HttpServletResponse response);
    }
    
     private class Handler_Login implements Dispatcher {
        @Override
        public void execute(HttpServletRequest request, HttpServletResponse response){
           System.out.println("Go to register");
            forward("/home.jsp",request,response);
           
        }
    }
    
   
    private class Handler_Register implements Dispatcher {
        @Override
        public void execute(HttpServletRequest request, HttpServletResponse response){
           
            forward("/home.jsp",request,response);
           
        }
    }
    
    

    private class Handler_GoTo_Register implements Dispatcher {
        @Override
        public void execute(HttpServletRequest request, HttpServletResponse response){
             System.out.println("Go to register");
            forward("/registration.jsp",request,response);
        }
    }
    
    
    
   
    
   
}

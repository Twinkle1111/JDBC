package com.java.utils;

import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class EmployeeQueries
 */
public class EmployeeQueries extends HttpServlet {
	
	public static final String INSERT="INSERT INTO TBL_EMPLOYEE(ID,NAME,CITY,SALARY) VALUES(?,?,?,?)";
	public static final String SELECT_ALL="SELECT * FROM TBL_EMPLOYEE";
	public static final String SELECT_BY_ID="SELECT * FROM TBL_EMPLOYEE WHERE ID=?";
	

}

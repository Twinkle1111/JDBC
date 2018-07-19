package com.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.model.Model;
import com.java.repositary.EmployeeRepositaryImpl;
import com.java.service.EmployeeServiceImpl;
import com.java.service.IEmloyeeService;
public class App 
{
    public static  void main( String[] args )
    {
    	EmployeeRepositaryImpl repository=new EmployeeRepositaryImpl();
    	IEmloyeeService service=new EmployeeServiceImpl(repository);
    	Model emp1=new Model(); 
    	emp1.id=1;
    	emp1.name="john";
    	emp1.city="hyd";
    	emp1.salary=1456.7;
       service.save(emp1); // calling save
    	
    	Model emp2=new Model();
    	emp2.id=2;
    	emp2.name="matthew";
    	emp2.city="ny";
    	emp2.salary=2456.7;
    	
    	service.save(emp2);// calling save
    	
    	Model emp3=new Model();
    	emp3.id=3;
    	emp3.name="alex";
    	emp3.city="nj";
    	emp3.salary=3456.7;
    	
    	service.save(emp3);// calling save*/
    	//SELECT ALL or FIND ALL
    	System.out.println(service.findAll());
    	
    	//SELECT ONE
    	System.out.println(service.findById(3));
    }
}


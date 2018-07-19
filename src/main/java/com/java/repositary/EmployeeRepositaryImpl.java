package com.java.repositary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.model.Model;
import com.java.utils.EmployeeQueries;

public class EmployeeRepositaryImpl implements IEmployeeRepository {

	public void save(Model emp, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps=con.prepareStatement(EmployeeQueries.INSERT);
		ps.setInt(1, emp.id);
		ps.setString(2, emp.name);
		ps.setString(3, emp.city);
		ps.setDouble(4, emp.salary);
		
		ps.executeUpdate();
		
	}

	public void updateNameAndSalary(String name, String salary, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void updateCity(String city, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public List<Model> findAll(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		List<Model> employees=new ArrayList<Model>();
		PreparedStatement ps=con.prepareStatement(EmployeeQueries.SELECT_ALL);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Model e=new Model();
			e.id=rs.getInt("ID");// ID is column_name in the table tbl_employee
			e.name=rs.getString("NAME");
			e.city=rs.getString("CITY");
			e.salary=rs.getDouble("SALARY");
			
			employees.add(e);
		}
		return employees;
	}

	public Model findById(int id, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Model e=new Model();
		PreparedStatement ps=con.prepareStatement(EmployeeQueries.SELECT_BY_ID);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			e.id=rs.getInt("ID");// ID is column_name in the table tbl_employee
			e.name=rs.getString("NAME");
			e.city=rs.getString("CITY");
			e.salary=rs.getDouble("SALARY");
		}
		
		return e;
		
	}

	public void deleteById(int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void deleteAll(Connection con) {
		// TODO Auto-generated method stub

	}

}
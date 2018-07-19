package com.java.service;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Model;
import com.java.repositary.IEmployeeRepository;
import com.java.utils.ConnectionUtils;

public class EmployeeServiceImpl implements IEmloyeeService {

	private IEmployeeRepository repository;
	public EmployeeServiceImpl(IEmployeeRepository repository) {
		this.repository=repository;
	}
	

	public void save(Model emp) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=ConnectionUtils.getConnection();
			repository.save(emp, con);
			con.commit();
			System.out.println("commited: "+emp.id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				System.out.println("rollback: "+emp.id);
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				//System.out.println("closing connection ");
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateNameAndSalary(String name, String salary, int id) {
		// TODO Auto-generated method stub

	}

	public void updateCity(String city, int id) {
		// TODO Auto-generated method stub

	}

	public List<Model> findAll() {
		List<Model> employees=null;
		
		Connection con=null;
		try {
			con = ConnectionUtils.getConnection();
			employees=repository.findAll(con); 
			// select operation so commit not required
		} catch (SQLException e) {
			// select operation so rollback not required
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employees;
	}

	public Model findById(int id) {
		// TODO Auto-generated method stub
		Model emp=null;
		Connection con=null;
		try {
			con=ConnectionUtils.getConnection();
			emp=repository.findById(id, con);
			// SELECT operation so commit not required
		} catch (SQLException e) {
			// SELECT operation so rollback not required
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return emp;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
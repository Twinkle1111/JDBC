package com.java.repositary;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Model;

public interface IEmployeeRepository {
	public void save(Model emp,Connection con) throws SQLException;
	public void updateNameAndSalary(String name,String salary,int id,Connection con);
	public void updateCity(String city,int id,Connection con);
	public List<Model> findAll(Connection con) throws SQLException;
	public Model findById(int id,Connection con) throws SQLException;
	public void deleteById(int id,Connection con);
	public void deleteAll(Connection con);
}
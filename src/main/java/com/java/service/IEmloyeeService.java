package com.java.service;

import java.util.ArrayList;
import java.util.List;
import com.java.model.Model;

public interface IEmloyeeService {

	public void save(Model emp);
	public void updateNameAndSalary(String name,String salary,int id);
	public void updateCity(String city,int id);
	public List<Model> findAll();
	public Model findById(int id);
	public void deleteById(int id);
	public void deleteAll();
	
}

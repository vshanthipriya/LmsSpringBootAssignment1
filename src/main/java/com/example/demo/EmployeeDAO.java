package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	
	private static Employees list=new Employees();
	static {
		
		list.getEmployeeList().add(new Employee(1,"prem","Tiwari","shanthi@gmail.com"));
		list.getEmployeeList().add(new Employee(2,"Vikas","Kumar","xyz@gmail.com"));
		list.getEmployeeList().add(new Employee(3,"prem","Tiwari","abc@gmail.com"));
				
	}
	public Employees getAllEmployees()
    {
  
        return list;
    }
	
	public void
    addEmployee(Employee employee)
{
    list.getEmployeeList()
        .add(employee);
       
}
    
}

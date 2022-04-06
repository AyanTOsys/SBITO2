package nativequery;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dao.BaseDAO;
import dao.BaseDAOImpl;

public class NativeQueryTest {
	
	@Test
	public void showAllRecords() {
		
		
		BaseDAO base = new BaseDAOImpl();
		
		List<Emp> staff =  base.findAll("Emp");
		for (Emp employee : staff) {
			System.out.println("Emp Number   : "+employee.getEmployeeNumber());
			System.out.println("Emp Name     : "+employee.getEmployeeName());
			System.out.println("Emp Manager  : "+employee.getMgr());
			System.out.println("Emp Job      : "+employee.getJob());
			System.out.println("Emp Hiredate : "+employee.getHiredate());
			System.out.println("Emp Salary   : "+employee.getSalary());
			System.out.println("Emp Comm     : "+employee.getCommision());
			System.out.println("Emp Deptno   : "+employee.getDepartmentNumber());
			System.out.println("------------------------");
		}
		
		
		
	}
}

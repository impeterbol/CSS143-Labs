import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);

		
		//todo: Build some PermanentHire and Consultant objects here
		//and add them to the ArrayList below
		PermanentHire perm1 = new PermanentHire("Peter", 12345, 1000, 11);
		PermanentHire perm2 = new PermanentHire("Jack", 456789, 2000, 13);
		ColorWithAlpha col1 = new ColorWithAlpha(3,4,5,6);

		Consultant cons1 = new Consultant("Cons1", 12344,20,3);
		Consultant cons2 = new Consultant("Cons2", 3456, 30,4);

		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
//		myEmployees.add(col1); // gives error java: incompatible types: ColorWithAlpha cannot be converted to Employee
		//if arraylist could store colorwalpha we needed a broader parent class to avoid errors

		//todo: add a sixth and seventh employee to this list that you create
		myEmployees.add(perm1);
		myEmployees.add(perm2);

		myEmployees.add(cons1);
		myEmployees.add(cons2);
		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
		
		
	}
}

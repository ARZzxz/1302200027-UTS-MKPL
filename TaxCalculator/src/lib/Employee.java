package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan

	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	private Spouse spouse;
	private Child child;


	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender, Spouse spouse, Child child) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		this.spouse = spouse;
		this.child = child;
	}

	public void setMonthlySalary(int grade) {	
	if (grade == 1) {
		monthlySalary = 3000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
	}else if (grade == 2) {
		monthlySalary = 5000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
	}else if (grade == 3) {
		monthlySalary = 7000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
	}
}
}

public class Spouse {
    private String name;
    private String idNumber;
    
    public Spouse(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getIdNumber() {
        return idNumber;
    }
}

public class Child {
    private String name;
    private String idNumber;
    
    public Child(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getIdNumber() {
        return idNumber;
    }
}

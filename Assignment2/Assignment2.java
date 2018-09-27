
	/**
	 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
	 * Please try to think the extra credit question. 
	 * The deadline of this assignment is 09/21/2018 23:59 PST.
	 * Please feel free to contact Amanda and Zane for any questions.
	 */

	class Employee {
		String name;
		int age;
		Gender gender;
	    double salary;// salary per month

	    // Constructor. Please set all the data in constructor.
		// score: 2/2
	    public Employee(String name, int age, Gender gender, double salary) {
	    	//write your code here
	    	this.name=name;	
	    	this.age=age;	
	    	this.gender=gender;
	    	this.salary=salary;
	    }
	    
	    // Getter for `name`. Return the current `name` data
	    public String getName() {
	    	//write your code here
	    	return name;
	    }

	    // Setter for `name`. Set `name` data
	    public void setName(String name) {
	    	//write your code here
	    	this.name=name;
	    }
	    public void raiseSalary(double byPercent){
	    	double afterRaise=byPercent/100*this.salary;
	    }
	}

	enum Gender {
		MALE,
		FEMALE;
	}


	public class Assignment2 {
	    // Assignment

	    /**
	     * Write a method to calculate the Social Security Tax of an employee and print it.
	     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
	     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
	     */
		//score: 1.5/2
	    public double socialSecurityTax(Employee employee) {
	        //write your code here
	        //salary is more than 0 and less than or equal to 8900 
	        if(employee.salary>0&&employee.salary<=8900) //TA: you dont have to do employee.salary>0, becasue employee.salary<=8900 already cover 
	        {
	        	double tax=employee.salary*6.2/100;
	        	System.out.printf("Tax is %f.\n",tax);
	        	return tax;
	        }
	        //salary is more than 8900
	        else if(employee.salary>8900)
	        {
	        	double tax=106800*6.2/100; 
	        	System.out.printf("Tax is %f.\n",tax);
	        	return tax;
	        }
	        //salary is less than 0
	        else //TA: you do not have to cover less than 0, due to employee.salary<=8900 already cover
	        {
	        	System.out.println("Salary less than 0,tax does not exist.");
	        	return -1;
	        }
	    }

	    /**
	     * Write a method to calculate an employee's contribution for insurance coverage and print it.
	     * Amount of deduction is computed as follows:
	     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
	     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
	     */
		//score: 1.5/2
	    public double insuranceCoverage(Employee employee) {
	        //write your code here
	        //age under 35 and above 0
	        if(employee.age<35&&employee.age>0) // TA: don't need employee.age>0, employee.age<35 already cover
	        {
	        	double contribution=employee.salary*3/100;
	        	System.out.printf("Employee %s's contribution is %f.\n",employee.name,contribution);
	        	return contribution;
	        }
	        //age between 35 and 50 (inclusive) 
	        else if(employee.age>=35&&employee.age<=50)
	        {
	        	double contribution=employee.salary*4/100;
	        	System.out.printf("Employee %s's contribution is %f.\n",employee.name,contribution);
	        	return contribution;
	        }
	        //age between 50 and 60 (exclusive)
	        else if(employee.age>50&&employee.age<60)
	        {
	        	double contribution=employee.salary*5/100;
	        	System.out.printf("Employee %s's contribution is %f.\n",employee.name,contribution);
	        	return contribution;
	        }
	        //age above 60
	        else if(employee.age>=60)
	        {
	        	double contribution=employee.salary*6/100;
	        	System.out.printf("Employee %s's contribution is %f.\n",employee.name,contribution);
	        	return contribution;
	        }
	        //age under or equal to 0
	        else //TA: do not need age under or equal to 0
	        {
	        	System.out.printf("Employee %s's age is incorrect, contribution does not exist.\n",employee.name);
	        	return -1;
	        }

	    }

	    /**
	     * Write a method to sort three employees' salary from low to high, and then print their name in order.
	     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	     * John Alice Jenny
	     */
		//score:2/2
	    public void sortSalary(Employee e1, Employee e2, Employee e3) {
	        //write your code here
	        Employee low=e1;
	        //store 3 employees into an array to sort
	    	Employee[] employee = new Employee[3];
	    	employee[0]=e1;
	    	employee[1]=e2;
	    	employee[2]=e3;
	    	//tmep array in order to swap
	    	Employee temp=new Employee("Temp",1,Gender.FEMALE,0);
	    	//selection sort
	    	for(int i=0;i<2;i++){
	    		for(int j=i+1;j<3;j++){
	    			if(employee[i].salary>employee[j].salary){
	    				temp=employee[i];
	    				employee[i]=employee[j];
	    				employee[j]=temp;
	    			}  				
	    		}
	    	}
	    	//print the name according to salary in ascending order
	    	for(int i=0;i<3;i++)
	    		System.out.println(employee[i].name); 
	    }

	    /**
	     * Write a method to raise an employee's salary to three times of his/her original salary.
	     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
	     * Do not change the input of this method.
	     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
	     */
		//score:2/2
	    public void tripleSalary(Employee employee) {
	        //write your code here
	    	employee.raiseSalary(300);	    	
	    }


	    //Extra credit
	//score:2/2
	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */
	    /*
	     write your understanding here.
	     
	     The reason is the swap function doesn't change the objects that a and b original refers to, a refers to Jenny all the time
	     and b refers to John all the time. A and b are separate references from x and y.
	     What the function does is create two object x and y. X refers to a and y refers to b. Then, it makes x refers to b and y 
	     refers to a. But a still refers to Jenny and b still refers to John.  
	     So the function swap what x and y refers to, but x and y has no relationship with a and b. As a result, there is no change of 
	     a and b.

	    */
	     public static void main(String[] args) {
	     	Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
	     	Employee b = new Employee("John", 30, Gender.MALE, 2500);
	     	System.out.println("Before: a=" + a.getName());
	     	System.out.println("Before: b=" + b.getName());
	     	swap(a, b);
	     	System.out.println("After: a=" + a.getName());
	     	System.out.println("After: b=" + b.getName());
	     }

	     public static void swap(Employee x, Employee y) {
	     	Employee temp = x;
	     	x = y;
	     	y = temp;
	     }
	 }


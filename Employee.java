public class Employee {
    
    String name;
    int id;
    double salary;
    String department;

   
   public Employee(String name, int id,  double salary,String department) {
       this.name = name;
       this.id = id;
       this.salary = salary;
       this.department=department;
   }

   
   public void displayDetails() {
       System.out.println("Employee ID: " + id);
       System.out.println("Name: " + name);
       
       System.out.println("Salary: $" + salary);
       System.out.println("Department: " + department);
   }


   public static void main(String[] args) {
        Employee emp=new Employee("Alice",101,300000.0,"Sales");
       emp.displayDetails();

     
   }
}



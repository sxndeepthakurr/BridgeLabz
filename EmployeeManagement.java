public class EmployeeManagement {
    
    static class Employee{
        static String companyName="Sisodiya.pvt.ltd";
        static int totalEmployees = 0;
        String name;
        final int id;
        String designation;
        static void displayTotalEmployee(){
            System.out.println("Total Employee"+totalEmployees);
        }
    public Employee(String name, int id, String designation) {
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
   }
}
    public static void main(String[] args){
        Employee e=new Employee("Rishav",7695,"jdhkw");
        e.displayTotalEmployee();
    }
}

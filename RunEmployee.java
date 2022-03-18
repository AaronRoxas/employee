import java.util.Scanner;

public class RunEmployee
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee(); 
        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();


        System.out.print("Please enter your full name: ");
        employee.getName();

        System.out.print("Full-Time Employee ('f'), Part-time Employee ('p'): ");
        String choice = s.nextLine();

       
            if(choice.equalsIgnoreCase("f")){
                System.out.print("Please enter your monthly salary: ");
                fullTime.setMonthlySalary();

                System.out.println("Hello " + employee.setName + " your monthly salary is: " + fullTime.monthlySalary);

            }
            else if (choice.equalsIgnoreCase("p")){ 
                System.out.print("Rate per hour: ");
                partTime.getRatePerHour();
                System.out.print("Hours worked this month: ");
                partTime.getRatePerHour();

                System.out.println("Name: "+employee.setName  + " Monthly Wage: " + partTime.getWage() + " Final Pay: " + partTime.finalPay);

                


            }
            else {
              
            }
             
        

     


    }
}
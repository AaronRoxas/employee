import java.util.Scanner;
public class PartTimeEmployee {
    Scanner s = new Scanner(System.in);
    double ratePerHour;
    double hoursWorked;
    double wage;
    double finalPay;

    public void setWage(){
        wage = ratePerHour * hoursWorked;
        System.out.println("Wage: "+wage);
        return;
    }

    public void finalPay(){
        finalPay = wage * 0.95;
        System.out.print("Final Pay: "+finalPay);
    }

    public double getWage(){
        return wage;
    }

    public void getRatePerHour(){
        ratePerHour = s.nextDouble();
        return;   
    }
    public void getHours(){
        hoursWorked = s.nextDouble();
        return;
    }
    

    
}
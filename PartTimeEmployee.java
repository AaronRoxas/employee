import java.util.Scanner;
public class PartTimeEmployee {
    Scanner s = new Scanner(System.in);
    double ratePerHour;
    int hoursWorked;
    double wage;
    double finalPay;

    public void setWage(){
        wage = ratePerHour * hoursWorked;
        return;
    }

    public double getWage(){
        return wage;
    }

    public void getRatePerHour(){
        ratePerHour = s.nextDouble();
        return;   
    }
    public void getHours(){
        hoursWorked = s.nextInt();
        return;
    }
    

    
}

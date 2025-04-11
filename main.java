
import java.util.Scanner;



public class main {
 
    public static void main(String[] args) {
        
Scanner user = new Scanner(System.in);

        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("1. Full Time");
            System.out.println("2. Part Time");
            System.out.println("3. Exit");
            System.out.println("==========================");
            System.out.print("Choose an option: ");

            int chose = user.nextInt();

            if (chose == 3) {
                System.out.println("Exiting...");
                break;  
            }

            System.out.println("Enter your name: ");
            String n = user.next();

            System.out.println("Enter your age: ");
            int age = user.nextInt();

            switch (chose) {

                case 1:
                    System.out.println("Enter Your Monthly Salary: ");
                    double ms = user.nextDouble();

                    System.out.println("Enter number of Your Kids: ");
                    double kid = user.nextDouble();

                    fulltime f = new fulltime(n, age, ms, kid);
                    f.output();
                    
                    
                    break;

                case 2:
                    System.out.println("Enter your working hour: ");
                    double wh = user.nextDouble();

                    System.out.println("Enter your extra hours: ");
                    int eh = user.nextInt();

                    parttime p = new parttime(n, age, wh, eh);
                    p.output();
                    break;

                    
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); 
        }

        user.close();
    }
    
}

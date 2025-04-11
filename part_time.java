
public class parttime extends employee {
   
   private double salaryrate;
    private double bonus;   


    public parttime(String name, int age, double workinghr, int eh) {
        super(name, age);
        wh(workinghr);          
        calculateBonus(eh);     
    }

   
    public void wh(double workinghr) {
        this.salaryrate = workinghr * 8;
    }

  
    public void calculateBonus(int extraHours) {
        int bonusBlocks = extraHours / 2;
        this.bonus = salaryrate * 0.10 * bonusBlocks;
        this.salaryrate += bonus;  
    }

    public double getSalaryRate() {
        return salaryrate;
    }

    public double getBonus() {
        return bonus;
    }

//    public void input() {
//        System.out.println("Enter your working hour: ");
//        double wh = user.nextDouble();
//
//        System.out.println("Enter your extra hours: ");
//        int eh = user.nextInt();
//
//        wh(wh);             
//        calculateBonus(eh); 
//    }

    public void output() {
        System.out.println();
        System.out.println("=====Employee Information=====");
        super.output();
       
        
        System.out.println("Department: "+super.dept);
         System.out.println("ID: "+super.ID);
        System.out.println("Base Salary: $"+ (salaryrate - bonus));
        System.out.println("Bonus: $"+bonus);
        System.out.println("Total Salary: $"+ getSalaryRate());
       
    }
}

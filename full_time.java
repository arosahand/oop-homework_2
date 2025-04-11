
public class fulltime extends employee {
    
    
    private double ysalary;
   private double tax;
  
    public fulltime(String name, int age, double ms, double nkids){
        super(name, age);
      cals(ms);
       FindTax(ms, nkids);
    }
   
 public double getysalary(){
     return ysalary;
 }   
 
public void cals(double ms){
   this.ysalary=ms*12;   
}
  
public void FindTax(double ms, double nkids){
    this.tax =0.25*(ms*11-nkids*450); 
}
 
 public double gettax(){
     return tax;
 }
    
 public void input(){
    // super.input();
//     System.out.println("Enter your monthly salary");
//                
//            int ms=super.user.nextInt();
//            
//            //setysalary(ms);
//            
//            System.out.println("enter the number of your kids");
//            //settax(ms, super.user.nextDouble());
//            output();
 }
 public void output(){
     System.out.println("=====Employee Information=====");
     
                super.output();
                 
                System.out.println("Department: "+super.dept); 
                System.out.println("ID: "+super.ID); 
                   System.out.println("Salary: $"+getysalary());
                   System.out.println("Tax: $"+gettax());
                   
                 
 }
 
 
}

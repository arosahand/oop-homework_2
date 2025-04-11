
import java.util.Scanner;


public class employee {
    Scanner user= new Scanner(System.in);
 static  int IDconter=1;
    int ID;
 private String name;
 private int age;
  final  String  dept="IT";
    
  public employee(String name, int age){
       
                 this.name=name;
                 this.age=age;
                 this.ID=IDconter++;
  }
    
//    public void setname(String name){
//        this.name=name;
//    }
 public String getname(){
     return name;
 }   
 
//  public void setage(int age){
//        this.age=age;
//    }
 public int getage(){
     return age;
 }   
 
 
// public void input(){
//     System.out.println("Enter Your Name: ");  
//setname(user.next());
//     System.out.println("Enter Your Age: ");
//     setage(user.nextInt());
//               
// }
 
 
 public void output(){
      System.out.println("Name: "+getname());
      System.out.println("Age: "+getage());
                
 }
 
}

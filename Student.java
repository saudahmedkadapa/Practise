import java.util.Date;
import java.util.Scanner;

public class Student {
    Scanner sc =new Scanner (System.in);
    private int id;
    private String name;
    private Date AdmissionDate;
    float percentage;
   
    
    public void infoStudent(int i,String n,Date d){
        this.id=i;
        this.name=n;
        this.AdmissionDate=d;

    }
    public void CalculatePercentage()
    {
        System.out.println("Enter the three number for Percentage= ");
    
        int marks1=sc.nextInt();
            int marks2=sc.nextInt();
            int marks3=sc.nextInt();
       
         percentage=(marks1+marks2+marks3)/3;
        
        
    }
    public void Display()
    {
        System.out.println("Name of the Student="+name+"\n"+ "Id ="+id+"\n"+"Admission Date="+AdmissionDate);
        System.out.println("percentage="+percentage);
    }
}

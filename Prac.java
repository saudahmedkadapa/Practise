import java.security.SecureRandom;
import java.util.Scanner;

abstract class Prac {
    public abstract void  num();
    }
    class demo extends Prac{
        public void num()
        {
            System.out.println("abstract method taken");
        }
        public static void main(String[] args) {
            demo d=new demo();

            d.num();
            
        }

    }
    
  

   
    


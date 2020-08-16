//Name-Tasfique
//Student ID-5886429
//Task1
package labtask4;
import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        
        //declaration of variables
        
        double mark[] = new double[20];
        double sum=0;
        double avg = 0;
        Scanner read = new Scanner (System.in);
        int i=0; 
        //generation of 20 students, and how much mark each student got.
        
        for(i = 0; i < mark.length; i++){
            
           System.out.println("Enter the marks for 20 students. ");
           mark[i] = read.nextInt(); 
           
           while (mark[i]<0 || mark[i]>100){ //within the for loop
                System.out.println("You have entered an invalid mark");  
                System.out.println("Enter the marks for 20 students. ");
                mark[i] = read.nextInt();   
            }
           
            
        sum += mark[i];
        avg = sum/mark.length;
        }
        System.out.println("The Average Marks is " +avg);
        System.out.println("The Sum is " +sum);
        
        int abv = 0; //should be outside the loop
        for(i=0; i < mark.length; i++){ //for loop needs to be initialised individually
            if (mark[i] > avg) {
                abv++;
               }
           
        }
         System.out.println("Number of student scored above average is " +abv); 
        
        
         
        double high = mark[0];
        double low = mark[0];
        
        for(i=0; i < mark.length; i++){
            if (mark[i]>high)  
            {
                high = mark[i];
                
            } 
            else if (mark[i]<low)
            {
                low = mark[i];
            }
            
        
        }
            System.out.println("The lowest mark"+low);
            System.out.println("The highest mark"+high);

      }
}
    
        
       
        
        
     
        
        
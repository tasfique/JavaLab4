package labtask4;
import java.util.Scanner;

public class Task2 
{
  public static void main (String[] args){
        
        Scanner read =new Scanner(System.in);
        
        //Declaration of array
        char seat[][]= new char [11][16];
        
        //Decalaration of variables
        int row;
        int column;
        String choice;
        
        System.out.println(" Welcome to Sri Kuala Lumpur Auditorium");
        System.out.println("\t");
        System.out.println("Greetings!");
        System.out.println("\t");
        System.out.println("Would you like to reserve a seat to this event? Enter 'y' for yes or 'n' for no ");
        choice = read.next();
        
       
        // When the user selects 'y' this code executes.
        while(choice.equalsIgnoreCase("y"))
        {   
            System.out.println("\t");
            System.out.println(" [ ]: Represents an empty seat");
            System.out.println(" [x]: Represents a booked seat");
            System.out.println("\t");
            System.out.println("\t");
            System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15 ");
            
            //for generating the rows and seats.
            for(int i =1; i<=10;i++)
            {   System.out.print(i+"\t");
                for(int j =1; j<=15;j++)
                {
                    System.out.print("[" + seat[i][j] + "]\t");  
                }
                 System.out.println();
                 
            }
            System.out.println("\t\t\t\t=\t=\t=\t=     SRI KUALA LUMPUR AUDITORIUM     \t=\t=\t=");
            System.out.println("\t");
            
            //asks user for the seat they want to reserve
            System.out.println("\t");
            System.out.println("Please state the seat you wish to reserve");
            
                //prompts for row
                System.out.print("Please enter the row : ");
                row = read.nextInt();
                while (row>10 || row<1)
                {
                    System.out.println("Exceeded row count");
                    System.out.println("Please re-enter the row: ");
                    System.out.print("Row: ");
                    row = read.nextInt();
                }

                //prompts for seat
                System.out.print("Please enter you desired seat: ");
                column = read.nextInt();
                while (column > 15 || column<1) // seting barrier if an invalid seat number is entered.
                {
                    System.out.println("You have entered an invalid seat");
                    System.out.println("Please enter the seat number again ");
                    System.out.print("Seat: ");
                    column = read.nextInt();
                }
                
                //Message to display the seat is already booked when trying ot overbook.
                if( seat[row][column]== 'X')
                {
                    System.out.println("This seat has already been reserved.");
                    System.out.println("Please re-enter seat row and seat");
                    System.out.print("Row: ");
                    row = read.nextInt();
                    System.out.print("Seat: ");
                    column = read.nextInt();
                }

                //Defining a taken seat
                seat[row][column]= 'X';

                System.out.println("\t");
                System.out.println(" Represents an available seating: [0] ");
                System.out.println(" Represents an unavailable seating [x]");
                System.out.println("\t");
                System.out.println("\t");
                
                
            int counter =0;
            double cost;
            for(int i =1; i<=seat.length;i++)
                {   for(int j =1; j<=seat[0].length;j++)
                    {
                        if(seat[i-1][j-1]== 'X')
                        {
                            counter =counter+1;
                        }
                        else
                        {
                            counter=counter;
                        }
                      
                    }
              
                }
            
            
            cost = counter * 7.50;   
            System.out.println("You have booked "+counter+" Ticket(s)");
            System.out.println(String.format("Your total cost is " +" RM"+cost));    
        
        System.out.print("Would you like to book another seat? (y/n) : ");
        choice = read.next();
        while ((!choice.equalsIgnoreCase("y"))&&(!choice.equalsIgnoreCase("n")))
        {
            System.out.println("invalid response");
            System.out.print("Would you like to book another seat? (y/n) : ");
            choice = read.next();
        }
        }
        System.out.println("Have a nice day !!!");
    }
    
}

package LABTASK4;

import java.util.Scanner;
import java.io.*;

public class Task3
{
     public static void main (String args[])throws IOException
    {
     
        
        Scanner read = new Scanner(System.in);

        
        int menuOption;
        
        System.out.println(" Welcome ");
        System.out.println("\t");
        System.out.println("Please enter your options ");
        System.out.println("\t");
        
        //the menu options 
        System.out.println("(1) Add a new contact\n" +
        "(2) Search for an existing contact\n" +"(3) Exit ");
        System.out.print("Select your Options: '1', '2' or '3' ");
        menuOption= read.nextInt();
        // This lines of code will execute if the user selects 1
        while (menuOption==1)
        {
            addition();
            System.out.println("Continue? (Yes/No)");
            String cont = read.next();
            

            
            if (cont.equalsIgnoreCase("yes"))
            {
                addition();
                System.out.println("Continue? (Yes/No)");
                cont = read.next();
            } 
            
            if (cont.equalsIgnoreCase("no"))
            {
                System.out.println("(1) Add a new contact\n" +
                "(2) Search for an existing contact\n" +"(3) Exit ");
                System.out.print("Select your Options: '1', '2' or '3' ");
                menuOption= read.nextInt();    
            }

        }
        // This lines of codes will execute if user selects 2         
        while(menuOption==2)
        {
            search();
            System.out.println("Continue? (Yes/No)");
            String cont2 = read.next();
            
            if (cont2.equalsIgnoreCase("yes"))
            {
                search();
                System.out.println("Continue? (Yes/No)");
                cont2 = read.next();
            } 
            
            if (cont2.equalsIgnoreCase("no"))
            {
                System.out.println("(1) Add a new contact\n" +
                "(2) Search for an existing contact\n" +"(3) Exit ");
                System.out.print("Select your Options: '1', '2' or '3' ");
                menuOption= read.nextInt();    
            }
        }
        //If an invalid number is selected for the menu option
        while(menuOption!=1 && menuOption!=2 && menuOption!=3)
        {
            System.out.println("\t");
            System.out.println("Invalid number is selected. ");
            System.out.println("\t");
            System.out.println("(1) Add a new contact\n" +
            "(2) Search for an existing contact\n" +"(3) Exit ");
            System.out.print("Select your Options: '1', '2' or '3' ");
            menuOption= read.nextInt();    
        }
    }
    
    //Reading data from a phonebook file.
    private static void addition() throws IOException 
    {   
        FileWriter fw = new FileWriter("phonebook.txt", true);// this stops file to be erased.
        PrintWriter pw = new PrintWriter(fw);
        Scanner read = new Scanner(System.in);
        
        System.out.println("\t");
        System.out.println("Please enter surname or last name: ");
        String last_name= read.nextLine();
        
        System.out.println("Enter phone number (eg: 0123456789)");
        int p_number= read.nextInt();      
        
        pw.println(last_name);
        pw.println(p_number);
        pw.close();
    }
    
    public static void search() throws IOException
    {
        File file = new File("phonebook.txt"); 
                    Scanner input = new Scanner (file); 
                    String line ;
                   Scanner read = new Scanner(System.in);
                    String name;
                    String option;
                    //read one line at a time 
                    System.out.println("Enter LAST NAME: "); 
                    name = read.nextLine(); 
                     
                     
                    while(input.hasNext()) 
                    {   //reads line 
                        line=input.nextLine(); 
                         
                        if(line.equals(name))  //compare line with user input 
                        { 
                            line=input.nextLine(); 
                            System.out.println(line); 
                            boolean results = true; 
                            System.out.println("Enter 2 to continue,otherwise enter 1 or 3."); 
                            option=read.nextLine(); 
                        } 
                        
             
                    } 
          boolean results = false;
                   if(results==false) 
                    { 
                        System.out.println("LAST NAME cannot be found."); 
                        System.out.println("Enter LAST NAME: "); 
                        name = read.nextLine(); 
                    }   
    }
}
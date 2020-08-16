package labtask4; 
 
import java.util.Scanner; import java.io.*; 
 
public class Task3New { 
     
    public static void main (String args[])throws IOException 
    { 
      
         
        Scanner read = new Scanner(System.in); 
 
         
        int option; 
         
        System.out.println(" . . . . Initiating program"); 
        System.out.println("\t"); 
        System.out.println("Please enter only relevant information"); 
        System.out.println("\t"); 
        //option menu 
        System.out.println("(1) Add a new contact\n" + 
        "(2) Search for an existing contact\n" +"(3) Exit ");         System.out.print("Option: ");         option= read.nextInt(); 
         
        while (option==1) 
        {             add(); 
            System.out.println("Continue? (Yes/No)"); 
            String cont = read.next(); 
              
             
            if (cont.equalsIgnoreCase("yes")) 
            {                 add(); 
                System.out.println("Continue? (Yes/No)");                 cont = read.next(); 
            }  
             
            if (cont.equalsIgnoreCase("no")) 
            { 
                System.out.println("(1) Add a new contact\n" + 
                "(2) Search for an existing contact\n" +"(3) Exit "); 
                System.out.print("Option: "); 
                option= read.nextInt();     
            } 
 
        } 
                  
        while(option==2) 
        { 
              
         
       search(); 
         
            System.out.println("Continue? (Yes/No)"); 
            String cont2 = read.next(); 
             
            if (cont2.equalsIgnoreCase("yes")) 
            {                 search(); 
                System.out.println("Continue? (Yes/No)");                 cont2 = read.next(); 
            }  
             
            if (cont2.equalsIgnoreCase("no")) 
            { 
                System.out.println("(1) Add a new contact\n" + 
                "(2) Search for an existing contact\n" +"(3) Exit ");                 System.out.print("Option: ");                 option= read.nextInt();     
            } 
            while((!cont2.equalsIgnoreCase("yes"))&&(!cont2.equalsIgnoreCase("no"))) 
            { 
                System.out.println("Invalid response");                 System.out.println("Continue? (Yes/No)");                 cont2 = read.next();        
            } 
        } 
         
        //Validation of options         while(option!=1 && option!=2 && option!=3) 
        { 
            System.out.println("\t"); 
            System.out.println("Invalid request"); 
            System.out.println("\t"); 
            System.out.println("(1) Add a new contact\n" + 
            "(2) Search for an existing contact\n" +"(3) Exit ");             System.out.print("Option: ");             option= read.nextInt();     
        } 
    }      
    //Reading data from a file(Adding data to the file) 
    public static void add() throws IOException  
    {    
        FileWriter fw = new FileWriter("phonebook.txt", true);// avoid erasing a file that already exist 
        PrintWriter pw = new PrintWriter(fw); 
        Scanner read = new Scanner(System.in); 
         
        System.out.println("\t"); 
        System.out.println("Note: Please enter only in caps"); 
        System.out.println("Please enter surname or last name: "); 
        String l_name= read.next(); 
        System.out.println("Enter phone number (eg: 0123456789)"); 
        int p_no= read.nextInt();       
         
        pw.println(l_name);         pw.println(p_no);         pw.close(); 
    } 
     
    public static void search() throws IOException //appending a file 
    { 
         Scanner read = new Scanner (System.in); 
         
        File file = new File("phonebook.txt"); 
        Scanner input = new Scanner(file); 
         
        System.out.println("Note: Please enter only in caps"); 
        System.out.println("Please enter surname or last name: "); 
        String l_name = read.nextLine(); 
         
        int counter = 0;         while(input.hasNextLine()) 
        { 
            String contact = input.nextLine(); 
 
            if(contact.equals(l_name)) 
            { 
                counter ++;                 contact = input.nextLine(); 
                System.out.println ("Phone number: (60+)"+contact); 
            } 
        } 
            if(counter==0) 
            { 
                System.out.println("Contact not found"); 
            } 
            input.close(); 
         
    } 
     
}

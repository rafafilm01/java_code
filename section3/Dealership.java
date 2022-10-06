import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // greetings 
    System.out.println("Welcome to java car Dealership\n");

    System.out.println("* Select option 'a' to buy a car ");
    System.out.println("* Select option 'b' to sell a car \n");
    
    String option = scan.next();

    switch(option) {
        case "a": System.out.println("*** Welcome to our buying menu ***"); 
        // capture the budget , license , credit score
        System.out.println("what is your budget ? ");
        int budget = scan.nextInt();
        if (budget >= 10000) {
            System.out.println("your money is good");

            System.out.println("\n Do you have insurance ? (yes/ no)");
            scan.nextLine(); //throwaway  scan line due to previously used scan.nextInt()
            String insurance = scan.nextLine();

            System.out.println("Have you got a valid license  ? (yes / no) ");
            String license = scan.nextLine();
      
            System.out.println("What is your credit score ?");
            int creditScore = scan.nextInt();

            if (insurance .equals("yes") && license.equals("yes") && creditScore>=660) {
                System.out.println(" Congratulations , you meet the criteria and can purchase a new car today !");


            }else{
                System.out.println("sorry but you od not meet the criteria");
            }
                
        }else {
            System.out.println("sorry but you do not have enough funds to purchase a car at this time");
        }


        
        break;
        case "b": System.out.println("*** welcome to our selling menu ***"); 
        System.out.println("\nwhat is your car valued at ? ");
        int value = scan.nextInt();
        System.out.println("what is your selling price ? ");
        int price = scan.nextInt();
        if (value > price && price<30000){
            System.out.println("we will buy your car ! ");

        }else{
            System.out.println("Sorry, we are not interested !  ");
        }


        
        
        break;
        default: System.out.println("Please make sure you have selected either 'a' or 'b'");
    }

    scan.close();
    }
}

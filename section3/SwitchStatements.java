//use  of switch  vs else / if  , sue SWITCH when comparing 1 value against a list of others , for anything else  stick to else / if
// NOTE change the name of static void iteration to MAIN to run a different program 

public class SwitchStatements {
    public static void mainOld(String[] args) {
        int month =5;

        switch(month) {
            case 1: System.out.println("Jan");
            case 2: System.out.println("Feb");
            case 3: System.out.println("Mar");
            case 4: System.out.println("Ap");
            case 5: System.out.println("May");
            case 6: System.out.println("June");
            case 7: System.out.println("July");
            case 8: System.out.println("Aug");
            case 9: System.out.println("Sept");
            case 10: System.out.println("Oct");
            case 11: System.out.println("Nov");
            case 12: System.out.println("Dec");
            default: System.out.println("Month unknown");
        }
      
    }

    public static void main(String[] args) {
        int month =7;

        switch(month) {
            case 1: System.out.println("Jan"); break;
            case 2: System.out.println("Feb"); break;
            case 3: System.out.println("Mar"); break;
            case 4: System.out.println("Ap"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("Aug"); break;
            case 9: System.out.println("Sept"); break;
            case 10: System.out.println("Oct"); break;
            case 11: System.out.println("Nov"); break;
            case 12: System.out.println("Dec"); break;
            default: System.out.println("Month unknown");
        }
      
    }

}

//with a SWITCH statement , the program gets activated as soon as the condition is met and carries out from there , every other case will also be carried out after 5
//use the BREAK keyword to break the swiches 
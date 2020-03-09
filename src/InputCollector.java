import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt){
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    private static Scanner scan = new Scanner(System.in);
    public static Contact catchInfoContact(){
        String name =  getUserInput("Enter name: ");
        String number =  getUserInput("Enter number: ");
        while (!Validation.isCorrectNumber(number)){
            number =  getUserInput("Invalid input remember the format (XXX-XXX-XXX) and all of them has to be numbers. Try again: ");
        }
        String work =  getUserInput("Enter work: ");
        String home =  getUserInput("Enter home: ");
        String city =  getUserInput("Enter city: ");
        while(Validation.isLetters(city) && city.isEmpty()){
            city =  getUserInput("Invalid input the city only can contain letters. Try again: ");
        }
        return new Contact(number,home,work,name,city);
    }
    public  static String menu(){
        System.out.println("+ ===    Contact App      === + ");
        System.out.println("| 1.List all contacts         | ");
        System.out.println("| 2.Add new Contact           |");
        System.out.println("| 3.Remove Contact            |");
        System.out.println("| 4.Update Contact            | ");
        System.out.println("| 5.Quit                      | ");
        System.out.println("+ = = = = = = = = = = = = = = + ");
       while(true){
           System.out.println("Enter your option:");
           String input = scan.nextLine();
           if(Validation.isNumeric(input)){
               switch (input){
                   case "1":
                       return "1";
                   case "2":
                       return "2";
                   case "3":
                       return "3";
                   case "4":
                       return "4";
                   case "5":
                       return "5";
                   default:
                       System.out.println("Invalid input please try again");
               }
           }
           System.out.println("Invalid input please try again");
       }
    }
}

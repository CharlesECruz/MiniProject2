import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private static ArrayList<Contact> ListContact = new ArrayList<Contact>();
    public static void startDefaultContact(){
        Contact con1 = new Contact("123-123-1234","","","Carlos","Vancouver");
        Contact con2 = new Contact("321-123-4567","","","Lola Mento","Vancouver");
        ListContact.add(con1);
        ListContact.add(con2);
    }
    public static void AllContacts() {
        int i = 0;
        for(Contact contact : ListContact){
            System.out.println(i++ +". "+contact.toString());
        }
    }

    public static void AddContact() {
        Contact newContact = InputCollector.catchInfoContact();
        ListContact.add(newContact);
        System.out.println("Successfully added a new contact!");
    }

    public static void RemoveContact() {
        AllContacts();
        Scanner scan = new Scanner(System.in);
        boolean valid;
        do{
            int indexContactRemove = Integer.parseInt(InputCollector.getUserInput("Enter the index of contact to remove: "));
            if (!(indexContactRemove>0) && !(indexContactRemove<= ListContact.size())){
                System.out.println("Invalid input. Enter a number between 0 and "+ListContact.size());
                valid = false;
            }else{
                valid = true;
            String nameRemove = ListContact.get(indexContactRemove).getName();
            ListContact.remove(ListContact.get(indexContactRemove));
            System.out.println("Successfully removed "+nameRemove);
            }
        }while(!valid);
    }

    public static void UpdateContact() {
        AllContacts();
        boolean valid;
        do{
            int indexContactUpdate = Integer.parseInt(InputCollector.getUserInput("Enter the index of contact to update: "));
            if (!(indexContactUpdate>0) && !(indexContactUpdate<= ListContact.size())){
                System.out.println("Invalid input. Enter a number between 0 and "+ListContact.size());
                valid = false;
            }else{
                valid = true;
                Contact updateContact = InputCollector.catchInfoContact();
                ListContact.set(indexContactUpdate,updateContact);
                System.out.println("Successfully update");
            }
        }while(!valid);
    }

    public void addContact(Contact newContact){
        ListContact.add(newContact);
    }
}

import java.util.concurrent.TimeUnit;

public class Driver {
    public static void main(String[] args) {
        boolean end = false;
        ContactList.startDefaultContact();
        while (!end){

            switch (InputCollector.menu()){
                case "1":
                    ContactList.AllContacts();
                    break;
                case "2":
                    ContactList.AddContact();
                    break;
                case "3":
                    ContactList.RemoveContact();
                    break;
                case "4":
                    ContactList.UpdateContact();
                    break;
                case "5":
                    end=true;
                    break;
                default:
                    System.out.println("Something it's wrong we restart the app again");
                    restart();
            }
        }
        System.out.println("Bye! bye! :)");
    }
    public static void restart(){
        for(int i = 0; i<=10; i++){
            System.out.println("The app going to restart in "+i);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.flush();
    }

}

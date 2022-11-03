
public class Main {
    public static void main(String[] args) {
        int ch;
        do{
            String username,password;
            username="manger";
            password= "123";
            int choice= 0;
            if(choice==1){
                if(Login.login(username,password)){
                    choice = 1;
                    switch (choice) {
                        case 1 -> {
                            SlotReservation s = new SlotReservation();
                            String name = "karthick", sId = "s1";
                            Person person = Manger.getPerson(name);
                            System.out.println("slots are ");
                            SlotReservation.showSlots();
                            s.bookSlot(sId, person);
                        }
                        case 2 -> {
                            SlotReservation sr = new SlotReservation();
                            String slotId = "";
                            sr.vacateSlot(slotId);
                        }
                        default -> System.out.println("Invalid Choice");
                    }
                }
                else {
                    System.out.println("invalid username Or password");
                }
            }
            else {
                if (username.equals("manger") && password.equals("123")) {
                    choice = 1;
                    Manger manger = new Manger();
                    switch (choice) {
                        case 1 -> {
                            Slot slot = new Slot("s1", SlotStatus.AVAILABLE, 12, 1000);
                            manger.addSlot(slot);

                        }
                        case 2 -> {
                            Slot slot1 = new Slot("s1", SlotStatus.AVAILABLE, 12, 1000);
                            manger.removeSlot(slot1);
                        }
                        case 3 -> {
                            Account account = new Account("karthick7", "abc123", AccountType.RENTER, AccountStatus.ACTIVE);
                            Person person = new Person("karthick", "karthick@gmail.com", "9487856337", account);
                            manger.addPerson(person);
                        }
                        case 4 -> {
                            String name = "karthick";
                            Person person1 = Manger.getPerson(name);
                            manger.removePerson(person1);
                        }
                        default -> System.out.println("invalid choice ");
                    }
                }
                else {
                    System.out.println("invalid username Or password");
                }
            }
            ch=0;
        }while(ch==1);

    }
}
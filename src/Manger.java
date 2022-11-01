import java.util.ArrayList;
public class Manger{
    private static ArrayList<String> slotsList =new ArrayList<>();
    private static ArrayList<Person> personNameList =new ArrayList<>();



    public boolean addSlot(Slot slot){
        slotsList.add(slot.getsId());
        SlotReservation.addSlots(slot.getsId(),slot);
        return true;
    }

    public boolean removeSlot(Slot slot){
        slotsList.remove(slot.getsId());
        SlotReservation.removeSlots(slot.getsId());
        return true;
    }

    public static Person getPerson(String name){
        for (Person p : personNameList) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }
    public boolean addPerson(Person person){
        personNameList.add(person);
        Account account=person.getAccount();
        String id= account.getId();
        String password= account.getPassword();
        Login.addLoginDetails(id,password);
        return true;
    }

    public boolean removePerson(Person person){
        personNameList.remove(person);
        Account account=person.getAccount();
        String id= account.getId();
        Login.removeLoginDetails(id);
        return true;
    }
}

import java.time.LocalDate;
import java.util.*;

public class SlotReservation {
    private static HashMap<String ,Renter> listOfRenter =new HashMap<>();
    private static HashMap<String ,LocalDate> listOfDate =new HashMap<>();
    private static HashMap<String ,Slot> slots = new HashMap<>();

    public static void addSlots(String id,Slot slot){
        slots.put(id,slot);
    }
    public static void removeSlots(String id){
        slots.remove(id);
    }
    public static void calculateRent(String sId) {
    }

    public static boolean fetchReservationDetails(String slotId){
        return listOfRenter.containsKey(slotId);
    }

    public static void addRenter(String sId,Renter renter){
        listOfRenter.put(sId,renter);
        listOfDate.put(sId,LocalDate.now());
    }

    public static void removeRenter(String sId){
        listOfRenter.remove(sId);
        listOfDate.remove(sId);
    }

    public static void showSlots(){
        for(Map.Entry m : slots.entrySet()){
            Slot s = (Slot) m.getValue();
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public void bookSlot(String sId, Person person) {

        boolean status=fetchReservationDetails(sId);
        if (status) {
            System.out.println("already booked");
        }
        else{
            Renter renter = new Renter(person.getName(),person.getEmail(),person.getPhone(),person.getAccount(),"karthick");
            addRenter(sId,renter);
        }

    }

    public void vacateSlot(String sId) {
        boolean status=fetchReservationDetails(sId);
        if(status){
            calculateRent(sId);
            removeRenter(sId);
        }
        else {
            System.out.println("renter not found");
        }

    }
}

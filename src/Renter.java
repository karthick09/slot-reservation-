public class Renter extends Person{
    private final String renterId;


    public Renter(String name, String  email, String phone, Account account, String  renterId) {
        super(name, email, phone, account);
        this.renterId = renterId.toString();
    }

    public String getRenterId() {
        return renterId;
    }
}


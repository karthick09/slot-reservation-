public class Account {
    private final String id;
    private String password;
    private final AccountType type;
    private AccountStatus status;

    public Account(String id, String password, AccountType type, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean resetPassword(){
        return true;
    }
}


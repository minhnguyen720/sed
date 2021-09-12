package bankAccUsingInterface;

public class Account {
    private final String name;
    private final String accountNumber;
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;
    
    
    public Account(
        String name,
        String accountNumber,
        String address,
        String email,
        boolean newsletter,
        boolean mobileBanking
    ) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", address=" + address + ", email="
                + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + "]";
    }
}

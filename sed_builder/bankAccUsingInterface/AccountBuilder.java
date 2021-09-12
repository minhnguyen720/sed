package bankAccUsingInterface;

public class AccountBuilder implements iBuilder {
    private String name; // required
    private String accountNumber; // required
    private String address;
    private String email;
    private boolean newsletter;
    private boolean mobileBanking;

    public AccountBuilder(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    @Override
    public AccountBuilder addName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AccountBuilder addAccountNumber(String number) {
        this.accountNumber = number;
        return this;
    }

    @Override
    public AccountBuilder addAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public AccountBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public AccountBuilder isUseNewsletter(boolean answer) {
        this.newsletter = answer;
        return this;
    }

    @Override
    public AccountBuilder isUseMobileBanking(boolean answer) {
        this.mobileBanking = answer;
        return this;
    }

    @Override
    public Account build() {
        return new Account(name, accountNumber, address, email, newsletter, mobileBanking);
    }
}

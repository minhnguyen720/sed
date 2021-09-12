package bankAccUsingInnerClass.builder;

public class Account {
    private final String name; // required
    private final String accountNumber; // required
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;

    private Account(
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

    public static class AccountBuilder {
        private String name; // required
        private String accountNumber; // required
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;

        public AccountBuilder(
            String name,
            String accountNumber
        ) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        // these setters dedicate to update value for this class's fields
        public AccountBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public AccountBuilder addEmail(String email) {
            this.email = email;
            return this;
        }

        public AccountBuilder wantNewsletter(boolean answer) {
            this.newsletter = answer;
            return this;
        }

        public AccountBuilder wantMobileBanking(boolean answer) {
            mobileBanking = answer;
            return this;
        }

        public Account build () {
            var account = new Account(name,accountNumber,address,email,newsletter,mobileBanking);

            return account;
        }
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", address=" + address + ", email="
                + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + "]";
    }
    
}

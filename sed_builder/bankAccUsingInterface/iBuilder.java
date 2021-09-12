package bankAccUsingInterface;

public interface iBuilder {
    AccountBuilder addName(String name);

    AccountBuilder addAccountNumber(String number);

    AccountBuilder addAddress(String address);

    AccountBuilder addEmail(String email);

    AccountBuilder isUseNewsletter(boolean answer);

    AccountBuilder isUseMobileBanking(boolean answer);

    Account build();
}

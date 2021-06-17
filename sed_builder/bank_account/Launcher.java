package bank_account;

import bank_account.builder.Account;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Customer 1");
        var account = new Account.AccountBuilder("Willie", "14485").withAddress("SaiGon").withEmail("mhng@gmail.com").wantMobileBanking(false).build();
        System.out.println(account);

        System.out.println("Customer 2");
        var account2 = new Account.AccountBuilder("Jason", "58441").wantMobileBanking(true).build();
        System.out.println(account2);
    }
}
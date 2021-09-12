package bankAccUsingInterface;

public class Client {
    public static void main(String[] args) {
        var acc = new AccountBuilder("willie", "0776793379")
        .addAddress("Sai gon")
        .build();

        System.out.println(acc);
    }
}

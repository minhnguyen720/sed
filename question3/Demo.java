package question3;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    // update user when center changes state

    public static HashMap<Center, ArrayList<User>>
        manager = new HashMap<>();

    public static void main(String[] args) {

        // Expected: mem2 gonna stay in 2 centers
        SportCenter sportCenter = new SportCenter("C01");
        SportCenter sportCenter2 = new SportCenter("C02");
        User mem1 = new Member(sportCenter, "M01");
        User mem2 = new Member(sportCenter, "M02");
        sportCenter2.addUser(mem2);
        new Trainer(sportCenter, "T01");
        sportCenter.setState(1);
        sportCenter2.setState(3);

        System.out.println("-----------------------");
        sportCenter.removeUser(mem1);
        sportCenter2.addUser(mem1);
        sportCenter.setState(2);
        sportCenter2.setState(0);


    }

}

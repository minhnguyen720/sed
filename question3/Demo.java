package question3;

import java.util.ArrayList;
import java.util.HashMap;

// using observer design pattern
// 2 method keeping the manager and let the array inside SportCenter hold members that need to notify
public class Demo {
    public static HashMap<SportCenter, ArrayList<User>> manager = new HashMap<>();

    public static void main(String[] args) {
        // create center
        SportCenter center1 = new SportCenter("C01");
        SportCenter center2 = new SportCenter("C02");
        manager.put(center1, new ArrayList<User>());
        manager.put(center2, new ArrayList<User>());

        // create member
        Member member1 = new Member("M01", true);
        Member member2 = new Member("M02", false);
        Member member3 = new Member("M03", true);
        Trainer trainer1 = new Trainer("T01", false);

        // asgin memeber for center
        manager.get(center1).add(member1);
        manager.get(center1).add(member2);
        manager.get(center1).add(trainer1);
        manager.get(center2).add(member1);
        manager.get(center2).add(member3);

        // member register for notify
        // Expected: only mem1 respnse to center1
        member1.checkCenterNotifyUser(center1); //true
        member2.checkCenterNotifyUser(center1); // false
        trainer1.checkCenterNotifyUser(center1); // false
        center1.setState(0);
        center2.setState(1);

        System.out.println("---------------------------");
        // Expected: member1 response to both center
        member1.checkCenterNotifyUser(center2); // true
        member3.checkCenterNotifyUser(center2); // true

        // set state for center
        center1.setState(1);
        
        center2.setState(2);
    }    
}
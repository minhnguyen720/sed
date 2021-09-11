package question3;

public class Demo {
    // update user when center changes state
    public static void main(String[] args) {

        // Expected: mem2 gonna stay in 2 centers
        // Expected: only mem1 response to center
        SportCenter sportCenter = new SportCenter("C01");
        User mem1 = new Member(sportCenter, true ,"M01");
        User mem2 = new Member(sportCenter, false,"M02");
        new Trainer(sportCenter, false ,"T01");
        sportCenter.setState(1);

        // Expected: mem2 response to center
        System.out.println("-----------------------");
        sportCenter.removeUser(mem1);
        mem2.setInterest(true);
        sportCenter.setState(2);


    }

}

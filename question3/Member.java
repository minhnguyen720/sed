package question3;

public class Member extends User {
    public Member(Center center, boolean isInterest, String code) {
        super(center, isInterest);
        this.code = code;
        center.addUser(this);
    }

    @Override
    public void update(SportCenter center) {
        System.out.println("Member " + this.code + " acknowledges that center " + center.getCode()
                + " has changed to state " + center.getState());
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setInterest(boolean isInterest) {
        this.isInterest = isInterest;
        
    }

    @Override
    public boolean getInterest() {
        return this.isInterest;
    }

}

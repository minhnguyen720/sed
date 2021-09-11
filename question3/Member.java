package question3;

public class Member extends User {
    public Member( String code, boolean isInterest) {
        super(isInterest);
        this.code = code;
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
    public boolean getInterest() {
        return this.isInterest;
    }

}

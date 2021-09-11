package question3;

public class Member extends User {
    public Member(Center center,String code) {
        super(center);
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

}

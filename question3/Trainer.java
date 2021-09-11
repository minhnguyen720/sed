package question3;

public class Trainer extends User {

    public Trainer(String code, boolean isInterest) {
        super(isInterest);
        this.code = code;
    }

    @Override
    public void update(SportCenter center) {
        System.out.println("Trainer " + this.code + " acknowledges that center " + center.getCode()
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

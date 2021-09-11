package question3;
public class Trainer extends User {

    public Trainer(Center center, String code) {
        super(center);
        this.code = code;
        center.addUser(this);
    }

    @Override
    public void update(SportCenter center) {
        System.out.println("Trainer " + this.code + " acknowledges that center " +
         center.getCode() + " has changed to state " + center.getState());
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

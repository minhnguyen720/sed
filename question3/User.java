package question3;

public abstract class User {
    String code;
    public boolean isInterest;
    
    public User(boolean isInterest) {
        this.isInterest = isInterest;
    }

    public abstract String getCode();

    public abstract void setCode(String code);

    public abstract void update(SportCenter center);

    public abstract boolean getInterest();

    // if user is interest to gettin notification from center then it will add itself to the list of center
    public void checkCenterNotifyUser(SportCenter center) {
        if(this.isInterest)
            center.addUser(this); // this step confirms that user will be added to the list
    }
}
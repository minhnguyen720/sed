package question3;

public abstract class User {
    String code;
    private Center center;
    public boolean isInterest;
    
    public User(Center center, boolean isInterest) {
        this.center = center;
        this.isInterest = isInterest;
    }
    
    public abstract void setInterest(boolean isInterest);

    public abstract String getCode();

    public abstract void setCode(String code);

    public abstract void update(SportCenter center);

    public abstract boolean getInterest();
}
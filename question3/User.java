package question3;

public abstract class User {
    String code;
    private Center center;

    public User(Center center) {
        this.center = center;
    }

    public abstract String getCode();

    public abstract void setCode(String code);

    public abstract void update(SportCenter center);
}
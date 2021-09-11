package question3;

import java.util.ArrayList;
import java.util.List;

public class SportCenter implements Center {
    protected String code;
    protected int state;

    private List<User> notifyUsers = new ArrayList<>(); //stores only user that interest notification

    public SportCenter(String code) {
        this.code = code;
    }

    @Override
    public void notifyAllUsers() {
        for (User user : notifyUsers)
                user.update(this);
    }

    @Override
    public void addUser(User user) {
        if (!notifyUsers.contains(user))
            notifyUsers.add(user);
        else
            System.out.println("Nothing to do");

    }

    @Override
    public void removeUser(User user) {
        if (notifyUsers.contains(user))
            notifyUsers.remove(user);
        else
            System.out.println("Nothing to do");

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllUsers();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
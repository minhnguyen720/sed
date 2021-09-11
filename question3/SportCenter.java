package question3;

import java.util.ArrayList;
import java.util.List;

public class SportCenter implements Center {
    protected String code;
    protected int state;

    private List<User> users = new ArrayList<>();

    public SportCenter(String code) {
        this.code = code;
    }

    @Override
    public void notifyAllUsers() {
        for (User user : users)
            if(user.getInterest())
                user.update(this);
    }

    @Override
    public void addUser(User user) {
        if (!users.contains(user))
            users.add(user);
        else
            System.out.println("Nothing to do");

    }

    @Override
    public void removeUser(User user) {
        if (users.contains(user))
            users.remove(user);
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
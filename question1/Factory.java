package question1;
public class Factory {

    public static Sport getSport(SportType type) {
        switch(type) {
            case Badminton:
                return new Badminton();
            case Zumba:
                return new Zumba();
            default:
                throw new IllegalArgumentException();
        }
    }
}

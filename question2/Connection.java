package question2;

import java.time.LocalTime;
import java.util.Objects;

public class Connection {
    private static Connection connection;

    private static LocalTime createdAt;

    private Connection() {
        LocalTime time = LocalTime.now();
        createdAt = time;
        System.out.println("A connection has been establised at " + createdAt);
    }

    public static Connection getTime() {
        if (Objects.isNull(connection)) {
            synchronized (Connection.class) {
                if (Objects.isNull(connection))
                    connection = new Connection();
            }
        }
        return connection;
    }
}

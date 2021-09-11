package question2;

public class Demo {
    public static void main(String[] args) {
        var target = new Runnable(){
            @Override
            public void run() {
                Connection.getTime();
            }
        };

        var conn1 = new Thread(target);
        var conn2 = new Thread(target);

        conn1.start();
        conn2.start();
    }
}

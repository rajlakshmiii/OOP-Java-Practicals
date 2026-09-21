class User extends Thread {

    String name;

    User(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " sent message " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) throws Exception {

        User u1 = new User("User 1");
        User u2 = new User("User 2");

        u1.start();
        u2.start();

        System.out.println("User 1 Alive: " + u1.isAlive());
        System.out.println("User 2 Alive: " + u2.isAlive());

        u1.join();
        u2.join();

        System.out.println("User 1 Alive: " + u1.isAlive());
        System.out.println("User 2 Alive: " + u2.isAlive());

        System.out.println("Chat ended");
    }
}

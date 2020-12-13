import java.util.Date;

public class Main {

    public static void main(String... args) {
        Broker broker = new Broker();
        broker.add(new Component());

        System.out.println(broker.publish("Hello"));
        broker.publish(new Date());
        broker.publish(1.52);

    }
}
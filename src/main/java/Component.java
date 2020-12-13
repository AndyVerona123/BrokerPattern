import java.util.Date;


class Component {

    @Subscription
    public String onString(String s) {
        return "Se retorna el campo String: " + s;
    }

    @Subscription
    public void onDate(Date d) {
        System.out.println("Date - " + d);
    }

    @Subscription
    public void onDouble(Double d) {
        System.out.println("Double - " + d);
    }

}
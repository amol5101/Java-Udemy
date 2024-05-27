package Java_Interfaces.interface_2;

public class Test {

    public static void main(String[] args) {

        store s = new store();
        customer c1 = new customer("Amol");
        customer c2 = new customer("Ganesh");

        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}

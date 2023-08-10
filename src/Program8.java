// This program show a basic structure of a enumeration (enum) and how it works

package src;

import src.entities.Order;
import src.entities.OrderStatus;
import java.util.Date;
public class Program8 {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);


    }
}

package domain.store;

import java.time.LocalDateTime;

/**
 * Created by jonnehirvi on 2018-01-02.
 */
public class OrderBuilder {

    private Order tempOrder;

    public OrderBuilder() {

        Order aOrder = new Order();
        aOrder.setId(123);
        aOrder.setPetId(123);
        aOrder.setQuantity(1);
        aOrder.setShipDate(LocalDateTime.now().toString());
        aOrder.setComplete(false);
        aOrder.setStatus("placed");

        tempOrder = aOrder;
    }

    public OrderBuilder withId(long id) {
        tempOrder.setId(id);
        return this;
    }

    public OrderBuilder withPetId(long petId) {
        tempOrder.setPetId(petId);
        return this;
    }

    public OrderBuilder withStatus(String status) {
        tempOrder.setStatus(status);
        return this;
    }

    public Order build() {
        return tempOrder;
    }
}
